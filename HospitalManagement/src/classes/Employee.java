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
public class Employee {
   
    private String name;
    private String Age;
     private String Ocucupation;
    private String ContacNmbr;
    private String Address;
    private String AdmisnDate;
    
    public Employee(String Name,String Age,String ContacNmbr,String Address,String AdmisnDate){
        
        this.name = Name;
        this.Age = Age;
        this.ContacNmbr = ContacNmbr;
        this.Address = Address;
        this.AdmisnDate = AdmisnDate;
    }
    
    public Employee(String Name,String Ocucupation,String Age, String ContacNmbr,String Address,String AdmisnDate){
        
        this.name = Name;
        this.Age = Age;
        this.Ocucupation = Ocucupation;
        this.ContacNmbr = ContacNmbr;
        this.Address = Address;
        this.AdmisnDate = AdmisnDate;
    }

   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the BDay
     */
    public String getAge() {
        return Age;
    }

    /**
     * @return the ContacNmbr
     */
    public String getContacNmbr() {
        return ContacNmbr;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @return the AdmisnDate
     */
    public String getAdmisnDate() {
        return AdmisnDate;
    }

    /**
     * @return the Ocucupation
     */
    public String getOcucupation() {
        return Ocucupation;
    }
    
}
