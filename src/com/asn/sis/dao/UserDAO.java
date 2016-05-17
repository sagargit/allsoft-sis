
package com.asn.sis.dao;

import com.asn.sis.database.ConnectionFactory;
import com.asn.sis.dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UserDAO {

    PreparedStatement pstmt = null;
    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;
    String a, b;
    int i = 0;
    static String username;

    public UserDAO() {

        con = new ConnectionFactory().getConnection();

    }
    public UserDTO retireveSelectedUser(String user) {
        UserDTO userFromDB=new UserDTO();
        try {
            pstmt = con.prepareStatement("SELECT username,password FROM user WHERE username=?");
            pstmt.setString(1, user);
            rs=pstmt.executeQuery();
            while(rs.next()){
                userFromDB.setUsername(rs.getString(1));
                userFromDB.setPassword(rs.getString(2));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userFromDB;
        
    }

    public void addUser(UserDTO user) {
        String query = "INSERT INTO user values(?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getFirstName());
            pstmt.setString(4, user.getMiddleName());
            pstmt.setString(5, user.getLastName());
            pstmt.setString(6, user.getPassword());
            pstmt.setString(7, user.getPerAddress());
            pstmt.setString(8, user.getTempAddress());
            pstmt.setString(9, user.getContact());
            pstmt.setString(10, user.getEmail());
            if (pstmt.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "One Record inserted in user table");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet searchUser(String a, String b) {
        try {
            if (a.equals("id")) {
                String query = "SELECT * FROM user where id" + "=" + b;
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            } else {
                String query = "SELECT * FROM user where " + a + "='" + b + "'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Boolean checkPassword(String pass) {
        try {
            String query = "SELECT * FROM logintbl where password" + "='" + pass + "'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                i++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (i != 0) {
            return true;
        } else {
            return false;
        }


    }

    public void setUsername(String u1) {
        username = u1;

    }

    public void changePassword(String pass) {
        try {
            String query = "UPDATE logintbl set password" + "='" + pass + "'" + "where username" + "='" + username + "'";
            System.out.println(pass);
            System.out.println(username);
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] grabColumnUser() {
        String[] columnName = null;
        try {
            String query = "SELECT * FROM user";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            columnName = new String[columnCount];//Vector is the collection of object.Stores in key value pairs
            for (int column = 1, i = 0; column <= columnCount; column++) {
                if (!metaData.getColumnName(column).equals("password")) {
                    columnName[i++] = metaData.getColumnName(column);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return columnName;



    }

    public ResultSet getQueryResult() {
        String query = "SELECT * FROM user";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

    }

    public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        Vector<String> columnNames = new Vector<String>(); //Vector is the collection of object.Stores in key value pairs
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    public UserDTO editUser(JTable table) {
        UserDTO userEdit = new UserDTO();
        userEdit.setId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        userEdit.setUsername((String) table.getValueAt(table.getSelectedRow(), 1));
        userEdit.setFirstName((String) table.getValueAt(table.getSelectedRow(), 2));
        userEdit.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 3));
        userEdit.setLastName((String) table.getValueAt(table.getSelectedRow(), 4));
        userEdit.setPassword((String) table.getValueAt(table.getSelectedRow(), 5));
        userEdit.setPerAddress((String) table.getValueAt(table.getSelectedRow(), 6));
        userEdit.setTempAddress((String) table.getValueAt(table.getSelectedRow(), 7));
        userEdit.setContact((String) table.getValueAt(table.getSelectedRow(), 8));
        userEdit.setEmail((String) table.getValueAt(table.getSelectedRow(), 9));
        return userEdit;
    }

    public void updateUser(UserDTO userUpdate) {
        try {
            String query = "UPDATE user SET username=?,firstname=?,middlename=?,lastname=?,password=?,peraddress=?,tempaddress=?,contact=?,email=? WHERE id=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, userUpdate.getUsername());
            pstmt.setString(2, userUpdate.getFirstName());
            pstmt.setString(3, userUpdate.getMiddleName());
            pstmt.setString(4, userUpdate.getLastName());
            pstmt.setString(5, userUpdate.getPassword());
            pstmt.setString(6, userUpdate.getPerAddress());
            pstmt.setString(7, userUpdate.getTempAddress());
            pstmt.setString(8, userUpdate.getContact());
            pstmt.setString(9, userUpdate.getEmail());
            pstmt.setInt(10, userUpdate.getId());
            if (pstmt.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "updated");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }


    }

    public void delete(String value) {
        try {
            String query = "DELETE FROM user WHERE id=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, value);
            if (pstmt.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "deleted");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public void close(){ // logout
        try {
            if(con!=null){
            con.close();
            }
            if(rs!=null){
            rs.close();
            }
            if(stmt!=null){
            stmt.close();
            }
            if(pstmt!=null){
            pstmt.close();
            }
        }
         catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
