package main;
import java.util.Scanner;
// Abstract class

class Main {
    static void menu(){
        System.out.println("1- Add New Client");
        System.out.println("2- List All Accounts / ClientS");
        System.out.println("3- Withdraw / Deposit");
        System.out.println("4- Exit");
    }
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        //public Bank(String n, String a, String p)
        System.out.println("Enter The Bank Information\nName, Address, Phone");
        String name = obj.nextLine();
        String addres = obj.nextLine();
        String phone = obj.nextLine();
        Bank bank = new Bank(name, addres, phone) ; 
        while(true){
            boolean exit = false ; 
            menu();
            Scanner obj2 = new Scanner(System.in);
            int choose = obj2.nextInt();
            switch(choose){
                case 1:
                    bank.addClient();
                    break;
                case 2:
                    bank.displayAllClientInfo();
                    break;
                case 3:
                    System.out.println("Enter the Account Number");
                    String accountNumber = obj.nextLine();
                    int accountIndex = bank.searchAccount(accountNumber);
                    if(accountIndex >= 0){
                        float val ; 
                        while(true){
                            System.out.println("1- Withdraw\n2- Deposit\n3- exit");
                            boolean out = false ;             
                            choose = obj2.nextInt();
                            switch(choose){
                                case 1:
                                    System.out.println("Enter the value you want to withdraw");
                                    val = obj.nextFloat();
                                    bank.accounts.get(accountIndex).withdraw(val);
                                    break;
                                case 2:
                                    System.out.println("Enter the value you want to deposit");
                                    val = obj.nextFloat();
                                    bank.accounts.get(accountIndex).deposit(val);
                                    break;
                                case 3:
                                    out = true;
                                    break;
                                default:
                                    System.out.println("Wrong Choose!!!");
                                    break;
                            }
                            if(out)
                                break;
                        }
                    }else{
                        System.out.println("This Account is not Exist");
                    }
                    break;
                case 4:
                    System.out.println("Bye Bye :D");
                    exit = true ; 
                    break;
            }
            if(exit)
                break;
        } 
    }
}