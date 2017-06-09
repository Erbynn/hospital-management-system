/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Doctor;
import classes.Patient;
import DatabaseConnection.DbConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Chashika
 */
public class DoctorController {
    Connection con = null;
    PreparedStatement pst = null;
    JFrame frame = new JFrame();
    
    public void createDoctor(Doctor d){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "INSERT into doctor(name,DocType,TpNumber,Address,Age,AdmisnDate)Values('"+d.getName()+"','"+d.getDocType()+"','"+d.getContacNmbr()+"','"+d.getAddress()+"','"+d.getAge()+"','"+d.getAdmisnDate()+"')";
            pst= con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Registered", "doctor", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        } catch (HeadlessException |SQLException ex) {
            JOptionPane.showMessageDialog(frame, ex);
        }
    }
    
    public void removeDoctor(String Did,String name){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "DELETE from doctor WHERE DocID='"+Did+"' OR Name='"+name+"'" ;
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Deleted", "doctor", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
        
        }
    
    }
    
    public void updateDoctor(Doctor d,int docID){
        try{
            con=DbConnect.Connect();
            
            Statement stmt;
            stmt = con.createStatement();
          
            String sql= "update doctor set Name='"+ d.getName() + "',DocType='"+ d.getDocType() +  "',TPNumber='"+ d.getContacNmbr() + "',Address='" + d.getAddress() + "',Age='"+ d.getAge() + "',AdmisnDate='" + d.getAdmisnDate() +  "' where DocID='" + docID+ "'";
               
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }  
    }
}
