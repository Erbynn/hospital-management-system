/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import classes.Patient;
import classes.Test;
import DatabaseConnection.DbConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Chashika
 */
public class TestController {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    JFrame frame = new JFrame();
    
    public  void addTest(Test p){
        try {
            con = DbConnect.Connect();
            
            
            Statement stmt;
            stmt= con.createStatement();
            
            
            String sql = "insert into test(testName,charge)values('"+ p.getTestName() + "','"+ p.getCharge() + "')";
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully added", "patient", JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
          
        }
        
    }
    
     public void removeTest(int tstid,String tstname){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "DELETE from test WHERE id='"+tstid+"' OR Name='"+tstname+"'" ;
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Deleted", "patient", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
        
        }
    
    }
     
      public void updateTest(Test p,int tstid){
        try{
            con=DbConnect.Connect();
            
            Statement stmt;
            stmt = con.createStatement();
          
            String sql= "update Patient set testName='"+p.getTestName()+"',charge='"+p.getCharge()+"' where ID='" + tstid + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }  
    }
}
