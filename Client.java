/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author TAREK
 */
 

public class Client {
    protected String  name,address   ;
    protected String nationalID ,  phone  ;
    Account account  ;
    /**
     * default constractor
     */
    Client(){
        name = "";
        address = "";
        nationalID = "";
        phone = "";
        account = null;
    };/**
     * 
     * @param name
     * @param nationalID
     * @param address
     * @param phone 
     */
    Client(String  name , String nationalID , String  address , String phone){
        this.name = name ;
        this.nationalID = nationalID ;
        this.address = address ;
        this.phone = phone ;

    }
   /*
   * Constructor that Sets the Client’s data
   * @param name
   * @param nationalID
   * @param address
   * @param phone
   * @param account
   */
    Client(String  name , String nationalID , String  address , String phone , Account  account ){
        this.name = name ;
        this.nationalID = nationalID ;
        this.address = address ;
        this.account= account   ;
        this.phone = phone ;

    }
    /**
     * to set the client name
     * @param name 
     */
    public  void setName(String name){
        this.name = name ;

    }/**
     *to get the client name

     * @return 
     */
    public  String getName(){
        return name ;
    }/**
     * to set the client address

     * @param address 
     */
    public void setAddress (String address){
        this.address = address ;
    }/**
     * to get the client address
     * @return 
     */
    public  String getAddress(){
        return address ;
    }/**
     * to set the client getNationalID
     * @param nationalID 
     */
    public void setNationalID(String nationalID){
        this.nationalID = nationalID ;
    }/**
     * to get the client getNationalID
     * @return 
     */
    public String getNationalID(){
        return nationalID ;
    }/**
     * to set the client phone
     * @param phone 
     */
    public void setPhone(String phone ){
        this.phone = phone ;
    }/**
     * to get the client phone
     * @return 
     */
    public String getPhone(){
        return  phone ;
    }/**
     * to set account to the client
     * @param account 
     */
    public void setAccount(Account account) {
        this.account = account;
    }/**
     * to get the client account info
     * @return 
     */
    public Account getAccount() {
        return account;
    }
   /**
    * function to display all clients information
    */
    public void displayClientAccount(){
        if(account != null){
            System.out.println("Account Number is\t" + account.getaccno() + "\nAccount Balance is\t"+ account.getbalance());
            System.out.println("--------------------------------------------");
        }else
            System.out.println("This Client Does Not Have Account Yet!!");
    }
    
    @Override
    public String toString() {
        return String.format("The name of the client is %s\nThe national ID of the client is %d\n" +
                "The account of the client is %s\nThe phone of the client is %d\n" +
                "The address of the client is %s", name, (Object) account, phone, address);


    }
}


