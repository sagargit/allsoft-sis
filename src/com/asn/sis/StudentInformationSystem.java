package com.asn.sis;

import com.asn.sis.gui.LoginDialog;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class StudentInformationSystem {

    static private void loadLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//italic method means static
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StudentInformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        LoginDialog login = new LoginDialog(new JFrame(), true);
        login.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        login.setLocationRelativeTo(null);

        login.setVisible(true);
    }
}
