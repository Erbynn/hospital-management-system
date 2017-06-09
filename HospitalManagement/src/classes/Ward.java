/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


/**
 *
 * @author Chashika
 */
public class Ward {
    private int NoOfBeds;
    private int RemainingBeds;
    private int Charge;
    private String WardType;
    
  
    
    public Ward(String WardType,int Charge,int NoOfBeds,int RemainingBeds){
        
        this.WardType = WardType;
        this.Charge = Charge;
        this.NoOfBeds = NoOfBeds;
        this.RemainingBeds = RemainingBeds;
    }

    

    /**
     * @return the NoOfBeds
     */
    public int getNoOfBeds() {
        return NoOfBeds;
    }

    /**
     * @return the RemainingBeds
     */
    public int getRemainingBeds() {
        return RemainingBeds;
    }

    /**
     * @return the Charge
     */
    public int getCharge() {
        return Charge;
    }

    /**
     * @return the WardType
     */
    public String getWardType() {
        return WardType;
    }
    
    
    
   
}
