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
public class Commerialclient  extends  Client {
    private String commercialID ;

    Commerialclient(){
        commercialID = "" ; 
    }    
     /*constructor that take name , nationalID , address , phone , account , comecialID as paramaters int intialize them
   * @param name the name of commerialclient
   * @param nationaID the nationnalid of the comerialclient
   * @param address the address of the comrialclient
   * @param phone the phone of the comrialclient
   * @param account the account of the commerialclient
   */
    Commerialclient(String name, String nationalID, String address, String phone, String commercialID) {
        super(name, nationalID, address, phone);
        nationalID = "" ;
        this.commercialID= commercialID ;
    }/**
     * 
     * @param name
     * @param nationalID
     * @param address
     * @param phone
     * @param account
     * @param commercialID 
     */
    Commerialclient(String name, String nationalID, String address, String phone, Account account ,String commercialID) {
        super(name, nationalID, address, phone, account);
        nationalID = "" ;
        this.commercialID= commercialID ;
    }
/**
 * to set commercial id for client
 * @param commercialID 
 */
    public void setcommercialID(String commercialID){
        this.commercialID = commercialID ;
    }
/**
 * to get commercial id for client
 * @param commercialID 
 */
    String getCommercialID(){
        return commercialID ;
    }/**
     * 
     * @return 
     */
    public String toString(){
        return String.format("the commrcialiD is "+commercialID) ;
    }
}

