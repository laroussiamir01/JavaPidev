/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Fayechi
 */
public class MaConnexion {
    private Connection cnx;
    public static final String url ="jdbc:mysql://localhost:3306/SauVies";
    public static  String user ="root";
    public static final String pwd ="";
    public static MaConnexion ct;

    private MaConnexion() {
        try {
            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connexion etablie !!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static MaConnexion getInstance(){
        if(ct==null){
            ct = new MaConnexion();
        }
        return ct;
    }

    public Connection getCnx() {
        return cnx;
    }
    
    
}
