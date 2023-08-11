package sw.assigement;

/**
 * this class represents an Account in bank that has three attributes: balance , accountNumber,result
 * @author Arwa Ahmed Walaa Eldin
 * 
 */
public class Account {
    double result;
    private double balance;
    private int accountNumber;
    private static int  counter=0;
    
   /**
    * this is a default constructor set account number automatically and initialize balance with zero 
    */ 
    public Account() {
        counter++;
        accountNumber=counter;
        balance=0.0;
        
    }
////    /**
////     * this is a parametrized constructor that takes  balance and accountNumber as parameters
////     * @param balance  balance represents the Client's balance
////     * @param accountNumber accountNumber represents the Client's accountNumber
////     */

//    public Account(double balance, int accountNumber) {
//        this.balance = balance;
//        this.accountNumber = accountNumber;
//        result=balance;
//    }
    /**
     * function to return current client's balance
     * @return result 
     */
    public double getBalance() {
        return result;
    }
 /**
  * function to return  client's Account number
  * @return accountNumber
  */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * function to set  client's balance
     * @param balance 
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * function to set  client's Account number
     * @param accountNumber 
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * function  to convert  account information to string and return it
     * @return Account information
     */
    public String toString() {
        return "balance=" + this.result + "|| account number :" + this.accountNumber;
    }
/**
 * function to allow client to withdraw money from his/her balance 
 * @param money
 */
    public void withdraw(double money) {
        if (money > result) {
            System.out.println("Your balance is not enough");
        } else {

            result -= money;

            System.out.println("You have withdrawn from your balance :" + money + " and the rest of your balance :" + result);
        }

    }
    /**
     * function to allow client to deposit  money to his/her balance 
     * @param money
     */
    public void deposit(double money ) {
        result +=money;
        System.out.println("You deposited : " + money + " and your current balance is : " + result);
    }
}