

package classes;

import DatabaseConnection.DbConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Patient {
    private int patientID;
    private String PName;
    private String PAge;
    private String PGender;
    private String PTPNumber;
    private String PAddress;
    private String GurdianName;
    private String Disease;
    private String AdmitDate;
    private int WardID;
    private int DoctorID;
    
    
    
    
    
    public Patient(String PName,String PAge,String PGender,String PTPNumber,String PAddress,String GurdianName,String Disease,String AdmitDate,int WardID,int DoctorID  ){
        
        this.PName = PName;
        this.PAge = PAge;
        this.PGender = PGender;
        this.PTPNumber = PTPNumber;
        this.PAddress = PAddress;
        this.GurdianName = GurdianName;
        this.Disease = Disease;
        this.AdmitDate = AdmitDate;
        this.WardID = WardID;
        this.DoctorID = DoctorID;
    }
    
    public Patient(int patientID){
        this.patientID = patientID;
    }

   

    public void showInfo(){
        System.out.println(getPatientID());
        System.out.println(getPName());
        System.out.println(getPAge());
        System.out.println(getPGender());
        System.out.println(getPTPNumber());
        System.out.println(getPAddress());
        System.out.println(getGurdianName());
        System.out.println(getDisease());
        
    }
    
    
    

    /**
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * @return the PName
     */
    public String getPName() {
        return PName;
    }

    /**
     * @return the PAge
     */
    public String getPAge() {
        return PAge;
    }

    /**
     * @return the PGender
     */
    public String getPGender() {
        return PGender;
    }

    /**
     * @return the PTPNumber
     */
    public String getPTPNumber() {
        return PTPNumber;
    }

    /**
     * @return the PAddress
     */
    public String getPAddress() {
        return PAddress;
    }

    /**
     * @return the GurdianName
     */
    public String getGurdianName() {
        return GurdianName;
    }

    /**
     * @return the Disease
     */
    public String getDisease() {
        return Disease;
    }

    /**
     * @return the AdmitDate
     */
    public String getAdmitDate() {
        return AdmitDate;
    }

    /**
     * @return the WardID
     */
    public int getWardID() {
        return WardID;
    }

    /**
     * @return the DoctorID
     */
    public int getDoctorID() {
        return DoctorID;
    }

    /**
     * @param DoctorID the DoctorID to set
     */
    
}
 