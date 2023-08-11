/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.assigement;

/**
 * class SpecialAccount inherits from class Account and allows over drafting with maximum limit of 1000 LE 
 * @author Arwa Ahmed Walaa Eldin
 */
public class SpecialAccount extends Account {

//    public SpecialAccount() {
//    }
    
///**
// * this is a parametrized constructor that takes  balance and accountNumber as parameters
// * @param balance  balance represents the Client's balance
// * @param accountNumber accountNumber represents the Client's accountNumber
// */
//    public SpecialAccount(double balance, int accountNumber) {
//        super(balance, accountNumber);
//       
//    }
    

    /**
     * this function override the withdraw function in class Account to allow over drafting with maximum limit of 1000 LE  
     * @param monye 
     */
    public void withdraw(double monye) {
        if (monye > (result+ 1000)) {
            System.out.println("Your balance is not enough");
        } else {

            result -= monye;

            System.out.println("You have withdrawn from your balance :" + monye + " and the rest of your balance :" + result);
        }
    }
}
