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
public class Doctor extends Employee {
    private String DocType;
    
   

    
    public Doctor(String Name,String Age,String ContacNmbr,String Address,String AdmisnDate,String DocType){
        super(Name,Age,ContacNmbr,Address,AdmisnDate);
        this.DocType = DocType;
        
    }

    /**
     * @return the DocType
     */
    public String getDocType() {
        return DocType;
    }
    
}
