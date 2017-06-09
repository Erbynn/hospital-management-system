/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Doctor;
import classes.Employee;
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
public class EmployeeController {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    JFrame frame = new JFrame();
    
    public void createEmployee(Employee e){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "INSERT into employee(EmpName,Occupation,Age,TpNumber,Address,AdmisnDate)Values('"+e.getName()+"','"+e.getOcucupation()+"','"+e.getAge()+"','"+e.getContacNmbr()+"','"+e.getAddress()+"','"+e.getAdmisnDate()+"')";
            pst= con.prepareStatement(sql);
            pst.execute();
            
            String sql1="SELECT EmpID from employee Where EmpName='"+e.getName()+"'";
            pst= con.prepareStatement(sql1);
            rs = pst.executeQuery();
            int empNo=0;
            if(rs.next()){
                empNo=rs.getInt(1);
            }
            int attndnce = 0;
            String mon = "";
            String sql2= "INSERT into attendance(EmplyeeID,Month,Attendance)Values('"+empNo+"','"+mon+"','"+attndnce+"')";
            pst= con.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Registered", "employee", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        } catch (HeadlessException |SQLException ex) {
            JOptionPane.showMessageDialog(frame, ex);
        }
    }
    
    public void removeEmployee(String Eid,String name){
        try {
            con = DbConnect.Connect();
        
            Statement stmt;
            stmt = con.createStatement();
        
            String sql = "DELETE from employee  WHERE EmpID='"+Eid+"' OR EmpName='"+name+"'" ;
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame, "Successfully Deleted", "emplyee", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame, ex);
        
        }
    
    }
    
    public void updateEmployee(Employee e,int EmpID){
        try{
            con=DbConnect.Connect();
            
            Statement stmt;
            stmt = con.createStatement();
          
            String sql= "update employee set EmpName='"+ e.getName() + "',Occupation='"+ e.getOcucupation() +  "',TPNumber='"+ e.getContacNmbr() + "',Address='" + e.getAddress() + "',Age='"+ e.getAge() + "',AdmisnDate='" + e.getAdmisnDate() +  "' where EmpID='" + EmpID+ "'";
               
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(frame,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(frame,ex);
        }  
    }
    
}
