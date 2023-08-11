/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.assigement;

/**
 *<p> This class inherits from class Client and it is a company not a person It has an extra attribute commercialID 
and setter and getter for it. Its NationalID is set to 00000000000000</p>
 * @author Sara Mohamed Ali
 */
public class CommercialClient extends Client {
    private int  commercialID ;
    /**
     * This a parameterized  constructor that takes commercialID , name, nationalID, address , phone , account as parameters 
     * @param commercialID company's commercialID
     * @param name company's name
     * @param nationalID nationalID is set to 0000000000000
     * @param address company's address
     * @param phone company's phone 
     * @param account company's account
     */
    public CommercialClient(int commercialID, String name, String nationalID, String address, int phone, Account account) {
        super(name, nationalID, address, phone, account);
        this.commercialID = commercialID;
    }
    /**
     * function to return commercialID
     * @return commercialID
     */
    public int getCommercialID() {
        return commercialID;
    }
    /**
     * function to set commercialID
     * @param commercialID 
     */
    public void setCommercialID(int commercialID) {
        this.commercialID = commercialID;
    }
    /**
     * this function override the to string function in class client to return the Commercial ID instead of nationalID 
     * @return 
     */
    public String toString() {
        
        return "Client information : Name : "+this.getName()+ "|| Commercial ID : "+this.commercialID +"||  Address : "
                +this.getAddress()+"||   phone : "+ this.getPhone() +"||   Account : "+this.getAccount();
               
    }
    
}
