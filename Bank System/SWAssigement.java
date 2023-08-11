
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.assigement;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */

public class SWAssigement {
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // bank information
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the bank name and the address and the number");
        String BankName=input.nextLine();
        String BankAddress=input.nextLine(); 
        int BankPhone=input.nextInt();
        Bank bank=new Bank(BankName,BankAddress,BankPhone);
        
        // MAIN MENU
        
        while(true){
        System.out.println("MAIN MENU");
        System.out.println("Choose one of the following options");
        System.out.println("1.Create Account");
        System.out.println("2.Log in");
        System.out.println("3.Display all clients and their accounts");
        //System.out.println("4.Exit");
        int choise=input.nextInt();
        
        // CREAT ACCOUNT 
        if(choise==1){
            System.out.println("Do you want to create account or special account");
            System.out.println("1. Account");
            System.out.println("2. Special Account");
            while (true) {
             int choise2=input.nextInt(); 
              //Normal Account 
              if (choise2 ==1)
              {
                  Account account= new Account();
                  bank.add(creatClient(account));
                  System.out.println("Registered successfully");
                  System.out.println("Back to main menu");
                  break;
              }
              // Special Account
              else if (choise2==2)
              {
                SpecialAccount account=new SpecialAccount();
                bank.add(creatClient(account));
                System.out.println("Registered successfully");
                System.out.println("Back to main menu");
                break;
              }
              else 
              {
                System.out.println("invalid input.. please enter 1 or 2");
               }
            }
            
            
        }
        //Log in
        else if (choise == 2) {
            while(true){
            System.out.println("Please enter your account number");
            int accountNum = input.nextInt();
            boolean check=false;
            for (int i = 0; i < bank.accounts.size(); i++) {
                if (bank.accounts.get(i).getAccountNumber() == accountNum) {
                    check=true;
                    break;
                }
                else
                {
                    check=false;
                }
            }
            if(check==false)
            {
               System.out.println("Couldn't find account with this number");
               continue;
            }
            else
            {
               while(true){
               System.out.println("1.Withdraw");
               System.out.println("2.Deposite");
               System.out.println("3.Check balance");
               System.out.println("4.Log out/Exit");
               int choice2=input.nextInt();
               
               if(choice2==1)
               {
                   System.out.println("How much do you want to withdraw?");
                   int money=input.nextInt();
                   bank.accounts.get(accountNum-1).withdraw(money);
                   
                   
               }
               
               else if(choice2==2)
               {
                   System.out.println("How much do you want to deposite?");
                   int money=input.nextInt();
                   bank.accounts.get(accountNum-1).deposit(money);
                   
               }
               else if(choice2==3)
               {
                   System.out.println("Your balance is "+bank.accounts.get(accountNum-1).getBalance());
                   
               }
               else if(choice2==4)
               {
                   break;
               }
               else
               {
                   System.out.println("invalid input.. please enter 1 or 2 or 3 or 4");
               }
               
               }
                
            }
        break;
            }
        }
        else if(choise==3)
        {
            bank.display();
        }
        else{ 
            System.out.println("invalid input.. please enter 1 or 2 or 3");
        }
        
        
        }
        
       
    }

    public  static Client creatClient(Account account)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Is this account for personal or commerical use?");
    System.out.println("1. Personal");
    System.out.println("2. Commercial");
    int choise=input.nextInt();
    while (true) {
       // Client 
        if (choise ==1)
          {
                System.out.println("Please enter client information");
                System.out.println("Name: ");
                String name = input.next();
                System.out.println("National ID: ");
                String nationalID = input.next();
                System.out.println("Address: ");
                String address = input.next();
                System.out.println("PhoneNum: ");
                int phone = input.nextInt();
                Client client=new Client(name, nationalID,address, phone,account);
               return client;
           }
        // CommercialClient
        else if (choise==2)
         {
                System.out.println("Please enter company information");
                System.out.println("Name: ");
                String name = input.next();
                System.out.println("Commerical ID: ");
                int commericalID = input.nextInt();
                System.out.println("Address: ");
                String address = input.next();
                System.out.println("PhoneNum: ");
                int phone = input.nextInt();
                CommercialClient client=new CommercialClient(commericalID, name,"00000000000000", address,  phone, account);
                return client;
          }
          else 
         {
           System.out.println("invalid input.. please enter 1 or 2");
         }
      }
  }
    
  }