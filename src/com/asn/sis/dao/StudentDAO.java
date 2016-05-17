

package com.asn.sis.dao;

import com.asn.sis.database.ConnectionFactory;
import com.asn.sis.dto.StudentDTO;
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


public class StudentDAO {
    PreparedStatement pstmt=null;
    Connection con=null;
     ResultSet rs=null;
    Statement stmt=null;
    String a,b=null;
    public StudentDAO(){
    con=new ConnectionFactory().getConnection();
    }
    public void addStudent(StudentDTO user){
         String query="INSERT INTO studentinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         try{
             pstmt=con.prepareStatement(query);
             pstmt.setInt(1, user.getId());
             pstmt.setString(2, user.getFirstname());
             
             pstmt.setString(3, user.getMiddlename());
             pstmt.setString(4, user.getLastname());
              pstmt.setString(5, user.getGender());
             
            
             pstmt.setString(6, user.getPeraddress());
             pstmt.setString(7, user.getTempaddress());
             pstmt.setString(8, user.getMobile());
             pstmt.setString(9, user.getEmail());
             pstmt.setString(10, user.getParent_name());
             pstmt.setString(11, user.getGuardian_name());
             pstmt.setString(12, user.getParent_contact());
             pstmt.setString(13, user.getGuardian_contact());
             pstmt.setString(14, user.getProgram());
             pstmt.setString(15, user.getSemester());
             pstmt.setString(16, user.getSection());
             
             if(pstmt.executeUpdate()==1){
                 JOptionPane.showMessageDialog(null,"One Record inserted in studentinfo table");
             }       
             
         }
         catch(SQLException e){
             e.printStackTrace();
         }
    }
     public ResultSet getQueryResult(){
        String query="SELECT * FROM studentinfo";
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
                    
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
        
    }
      
      public ResultSet searchStudent(String a,String b) {
        try {
            if (a.equals("id")) {
                String query = "SELECT * FROM studentinfo where id" + "=" + b;
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            } else {
                String query = "SELECT * FROM studentinfo where " + a + "='" + b + "'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
     public String[] grabColumnStudent() {
        String[] columnName = null;
        try {
            String query = "SELECT * FROM studentinfo";
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
    public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException{
        ResultSetMetaData metaData=rs.getMetaData();
        int columnCount=metaData.getColumnCount();
        Vector<String> columnNames = new Vector<String>(); //Vector is the collection of object.Stores in key value pairs
        for (int column = 1; column <=columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data=new Vector<Vector<Object>>();
        while(rs.next()){
            Vector<Object> vector= new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
               vector.add(rs.getObject(columnIndex)); 
            }
            data.add(vector);
        }
        
        return new DefaultTableModel(data,columnNames);
        
    }
     public StudentDTO editStudent(JTable table) {
        StudentDTO studentEdit = new StudentDTO();
        studentEdit.setId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        studentEdit.setFirstname((String) table.getValueAt(table.getSelectedRow(), 1));
        studentEdit.setMiddlename((String) table.getValueAt(table.getSelectedRow(), 2));
        studentEdit.setLastname((String) table.getValueAt(table.getSelectedRow(), 3));
        studentEdit.setGender((String) table.getValueAt(table.getSelectedRow(), 4));
        studentEdit.setPeraddress((String) table.getValueAt(table.getSelectedRow(), 5));
        studentEdit.setTempaddress((String) table.getValueAt(table.getSelectedRow(), 6));
        studentEdit.setMobile((String) table.getValueAt(table.getSelectedRow(), 7));
        studentEdit.setEmail((String) table.getValueAt(table.getSelectedRow(), 8));
        studentEdit.setParent_name((String) table.getValueAt(table.getSelectedRow(), 9));
        studentEdit.setGuardian_name((String) table.getValueAt(table.getSelectedRow(), 10));
        studentEdit.setParent_contact((String) table.getValueAt(table.getSelectedRow(), 11));
        studentEdit.setGuardian_contact((String) table.getValueAt(table.getSelectedRow(), 12));
        studentEdit.setProgram((String) table.getValueAt(table.getSelectedRow(), 13));
        studentEdit.setSemester((String) table.getValueAt(table.getSelectedRow(), 14));
        studentEdit.setSection((String) table.getValueAt(table.getSelectedRow(), 15));
        return studentEdit;
    }
      public void updateStudent(StudentDTO studentUpdate) {
        try {
            String query = "UPDATE studentinfo SET firstname=?,middlename=?,lastname=?,gender=?,peraddress=?,tempaddress=?,mobile=?,email=?,parent_name=?,guardian_name=?,parent_contact=?,guardian_contact=?,program=?,semester=?,section=? WHERE id=?";
            pstmt = con.prepareStatement(query);
           
            pstmt.setString(1, studentUpdate.getFirstname());
            pstmt.setString(2, studentUpdate.getMiddlename());
            pstmt.setString(3, studentUpdate.getLastname());
            pstmt.setString(4, studentUpdate.getGender());
            pstmt.setString(5, studentUpdate.getPeraddress());
            pstmt.setString(6, studentUpdate.getTempaddress());
            pstmt.setString(7, studentUpdate.getMobile());
            pstmt.setString(8, studentUpdate.getEmail());
            pstmt.setString(9, studentUpdate.getParent_name());
            pstmt.setString(10, studentUpdate.getGuardian_name());
            pstmt.setString(11, studentUpdate.getParent_contact());
            pstmt.setString(12, studentUpdate.getGuardian_contact());
            pstmt.setString(13, studentUpdate.getProgram());
            pstmt.setString(14, studentUpdate.getSemester());
            pstmt.setString(15, studentUpdate.getSection());
            pstmt.setInt(16, studentUpdate.getId());
            if (pstmt.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "updated");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }


    }
      public void deleteStudent(String value) {
        try {
            String query = "DELETE FROM studentinfo WHERE id=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, value);
            if (pstmt.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "deleted");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
