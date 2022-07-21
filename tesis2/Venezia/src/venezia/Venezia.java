/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venezia;

import View.JFLog;
import View.JFNewEmployee;
import View.JFProducto;
import View.MDINICIO;
import java.sql.SQLException;

/**
 *
 * @author Usuario-PC
 */
public class Venezia {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
         JFLog menu = new JFLog();
        menu.setVisible(true);

    }
    
}
