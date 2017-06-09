/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Ward;
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
public class WardController {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    JFrame frame = new JFrame();
    
    
    public void createWard(Ward w){
        try {
            con = DbConnect.Connect();
            
            Statement stmt;
            stmt= con.createStatement();
            String sql = "INSERT INTO ward(WType,NoOfBeds,Charge,RemainingBeds)VALUES('"+w.getWardType()+"','"+w.getNoOfBeds()+"','"+w.getCharge()+"','"+w.getRemainingBeds()+"')";
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully Added","ward",JOptionPane.INFORMATION_MESSAGE);
        } catch(HeadlessException|SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        
        }
    }
    
    public void updateWard(Ward w,int wid){
         try {
            con = DbConnect.Connect();
            
            Statement stmt;
            stmt= con.createStatement();
            
             
            String sql = "UPDATE ward SET WType='"+w.getWardType()+"',Charge='"+w.getCharge()+"',NoOfBeds='"+w.getNoOfBeds()+"',RemainingBeds='"+w.getRemainingBeds()+"' WHERE WardID='"+wid+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            
        } catch(HeadlessException|SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }
    }
    
}
