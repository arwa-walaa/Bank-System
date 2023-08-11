/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.assigement;

/**
 * This class represents the personal information of the client and his/her account information
 * @author Sara Mohamed Ali
 */
public class Client {
    private String name, nationalID, address;
    private int phone;
    private Account account;
    /**
     * This a parameterized  constructor that takes name, nationalID, address , phone , account as parameters 
     * @param name  client's name
     * @param nationalID client's nationalID
     * @param address client's address
     * @param phone client's phone 
     * @param account client's account
     */
    public Client(String name, String nationalID, String address, int phone, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }
    /**
     * this function to set client's name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * this function to set client's nationalID
     * @param nationalID 
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    /**
     * this function to set client's address
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * this function to set client's phone
     * @param phone 
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    /**
     * this function to set client's account
     * @param account 
     */
    public void setAccount(Account account) {
        this.account = account;
    }
    /**
     * this function to get client's name

     * @return  name 
     */
    public String getName() {
        return name;
    }
    /**
     * this function to get client's NationalID
     * @return NationalID
     */
    public String getNationalID() {
        return nationalID;
    }
    /**
     * this function to get client's address
     * @return address
     */
    public String getAddress() {
        return address;
    }
    /**
     * this function to get client's phone
     * @return phone
     */
    public int getPhone() {
        return phone;
    }
    /**
     * this function to get client's account
     * @return account
     */
    public Account getAccount() {
        return account;
    }
    /**
     * this function to convert client information to sting and return it
     * @return Client information
     */
    public String toString() {
        
        return "Client information : Name : "+this.name+ "|| national ID : "+this.nationalID +"|| Address : "
                +this.address+"|| phone : "+ this.phone +"|| Account : "+this.account.toString();
               
    }
    
    
}