/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.Scanner;

/**<h3>Bank Class</h3>
 * @param name this for bank name
 * @param adress this for bank address
 * @param phone this for bank tel-pgone
 * @param accounts for list 0f all bank accounts
 * @param clients for list of all bank clients
 * @author ALI
 */
public class Bank { 
    private String name;
    private String adress;
    private String phone ;
    ArrayList<Account>accounts = new ArrayList<Account>();
    ArrayList<Client>clients = new ArrayList<Client>();
    
   /**
    * <h3>default constractor</h3>
    * set all bank class attribute to empty string
    */ 
    public Bank(){
        name = ""; 
        adress = ""; 
        phone = ""; 
    }
    /**
     * <h3>parametrize constractor</h3>
     * @param n
     * @param a
     * @param p 
     */
    public Bank(String n, String a, String p){
        name = n; 
        adress = a; 
        phone = p; 
    }
    
    /**
     * <h3>to add anew client and his account</h3>
     */
    public void addClient(){
        System.out.println("Enter Client info\nName, Address, NationalId, Phone");
        Scanner obj = new Scanner(System.in);
        String name  = obj.nextLine();
        String ddress  = obj.nextLine();
        String nationalId  = obj.nextLine();
        String phone  = obj.nextLine();
        
        Client client = new Client(name, nationalId, ddress ,phone);
        clients.add(client);
        
        System.out.println("Enter Client Account info\nAccountNumber, AccountBalance");
        String account_num = obj.nextLine();
        int account_bal = obj.nextInt();
        
        Account account = new Account(account_num, account_bal);
        accounts.add(account);
        
        client.setAccount(account);
  
    }
    /**
     * 
     * <h3>to list all bank clients</h3>
     * <p>printing there accounts if founded</p>
     */
    public void displayAllClientInfo(){
        int len = clients.size() ;
        if( len == 0 ){
            System.out.println("This Bank Is Empty, Does not Have any Clients or Accounts");
        }else{
            System.out.println("All Clients and Accounts Are");
            for (int i = 0 ; i < len; i++) {
                System.out.println("Client Name is\t" + clients.get(i).getName() + "\nAddress is\t"+ clients.get(i).getAddress()+ "\nNational ID is\t" + clients.get(i).getNationalID() + "\nPhone is\t" + clients.get(i).getPhone());
                clients.get(i).displayClientAccount();
                System.out.println("--------------------------------------------");
            }
        }
    }
    /**
     * 
     * <h3>list only all account</h3>
     */
    public void displayAccounttInfo(){
        
        for (int i = 0 ; i < accounts.size(); i++) {
            accounts.get(i).displayAccountInfo();
            System.out.println("--------------------------------------------");
        }
    }
    /**
     * 
     * <h3>to search about specific account by it's number</h3>
     * <p>if founded will return it's index at accounts array list</p>
     * <p>if not founded will return -1</p>
     * @param n
     * @return 
     */
    public int searchAccount(String n){
        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getaccno().equals(n))
                return i ; 
        }
        return -1 ; 
    }
    /**
     * set value for name attribute of class
     * @param n 
     */
    public void setName(String n){
        name = n;
    }
    /**
     * get the value of name attribute of class
     * @return 
     */
    public String getName(){
        return name ; 
    }
    /**
     * set value for address attribute of class
     * @param a
     */
    public void setAdress(String a){
        adress = a;
    }
    /**
     * get the value of address attribute of class
     * @return 
     */
    public String getAdresss(){
        return adress ; 
    }
    /**
     * set value for phone attribute of class
     * @param n 
     */
    public void setPhone(String p){
        phone = p;
    }
    /**
     * get the value of phone attribute of class
     * @return 
     */
    public String getPhone(){
        return phone ; 
    }
}
