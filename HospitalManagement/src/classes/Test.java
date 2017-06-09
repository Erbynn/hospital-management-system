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
public class Test {
    
    private int testId,Charge;
    private String testName;
    
    
    public Test(String testName,int Cahrge){
        this.testName = testName;
        this.Charge = Charge;
    }
    
    public Test(int testID){
        this.testId = testID;
    }
    /**
     * @return the Charge
     */
    public int getCharge() {
        return Charge;
    }
    

    
    /**
     * @return the testId
     */
    
    public int getTestId() {
        return testId;
    }

    

    /**
     * @return the testName
     */
    public String getTestName() {
        return testName;
    }
    
}
