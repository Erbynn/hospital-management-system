/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Patient;
import DatabaseConnection.DbConnect;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Chashika
 */
public class PatientController {
    static Connection con = null;
    static ResultSet rs = null;
    static PreparedStatement pst = null;
    static JFrame frame = new JFrame();
    
    public  void createPatient(Patient p){
        try {
            con = DbConnect.Connect();
            
            
            Statement stmt;
            stmt= con.createStatement();
            
            
            String sql = "insert into patient(Name,Age,Gender,TPNumber,Addresss,GurdianName,Disease,AdmitDate,WardID,DoctorID)values('"+ p.getPName() + "','"+ p.getPAge() + "','"+ p.getPGender() + "','"+ p.getPTPNumber() + "','" + p.getPAddress() + "','"+ p.getGurdianName() + "','" + p.getDisease() + "','"+p.getAdmitDate()+"','"+p.getWardID()+"','"+p.getDoctorID()+"')";
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Registered", "patient", JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
          
        }
    }
    
    public void removePatient(String pid,String name){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "DELETE from patient WHERE id='"+pid+"' OR Name='"+name+"'" ;
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Deleted", "patient", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
        
        }
    
    }
    
    public void updatePatient(Patient p,int pid){
        try{
            con=DbConnect.Connect();
            
            Statement stmt;
            stmt = con.createStatement();
          
            String sql= "update Patient set Name='"+ p.getPName() + "',GurdianName='"+ p.getGurdianName() +  "',TPNumber='"+ p.getPTPNumber() + "',Age=" + p.getPAge() + ",Disease='"+ p.getDisease() + "',Gender='" + p.getPGender() +  "',Addresss='" + p.getPAddress() + "' where ID='" + pid + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }  
    }
    
    public int assignWard(){
        Random rand = new Random();
        int wardNo = rand.nextInt(5) + 1;
        return wardNo;
        
    }
    
    public  static double  paybill(int pID,int medicineCharg,String Dischargedate){
        
        try {
            double bill;
            con = DbConnect.Connect();
            String sql1 = "SELECT AdmitDate,WardID from patient where id='"+pID+"'";
           
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            String admitDate="n";
            int wid = 0;
           
            while(rs.next()){
                admitDate = rs.getString(1);
                wid = rs.getInt(2);
               
            }
            
            String sql2 = "SELECT Charge from ward where WardID='"+wid+"'";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            int chrge =0;
            if(rs.next()){
                chrge = rs.getInt(1);
            }
            
            
                
          bill = medicineCharg + chrge*visitday(admitDate.trim(),Dischargedate.trim());
           return bill;
            
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }
        return 0;
    }
    
    public  static int visitday(String admitday,String dischrgeday){
        int AdmitYear = Integer.parseInt(admitday.substring(0, 4));
        int AdmitMonth =Integer.parseInt(admitday.substring(5, 7));
        int AdmitDay = Integer.parseInt(admitday.substring(8, 10));
        
        int DischargeYear = Integer.parseInt(dischrgeday.substring(0, 4));
        int DischargeMonth =Integer.parseInt(dischrgeday.substring(5, 7));
        int DischargeDay = Integer.parseInt(dischrgeday.substring(8, 10));
        
        int days,month,year= 0;
        if(DischargeDay>=AdmitDay){
            days = DischargeDay - AdmitDay;
        }
        else{
            days = 30+DischargeDay - AdmitDay;
            DischargeMonth--;
        }
        if(DischargeMonth>=AdmitMonth){
            month = DischargeMonth - AdmitMonth ;
        }
        else{
            month = 12 + DischargeMonth - AdmitMonth;
            DischargeYear--;
        }
        if(DischargeYear>= AdmitYear){
            year = DischargeYear - AdmitYear;
        }
        else{
            System.out.println("Enter valid day");
        }
        
        return ( days+(month*30)+(year*365));
    }
    
    public void dischargePatient(int patintID){
        try {
             con = DbConnect.Connect();
        
            String sql = "DELETE FROM `hospital_db`.`patient` WHERE `patient`.`id` = '"+patintID+"'" ;
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Discharged", "patient", JOptionPane.INFORMATION_MESSAGE);
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }
    }
    
    
}
