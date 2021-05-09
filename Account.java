/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ABDO
 */public class Account {
    protected float balance ;
    protected String accno ;
    
    
    
    /**
     *default constructor to initialize the atributes.
     */
    public Account()
    {
        accno = "";
        balance =0;
    }

    /**
     *parametarize constructor to get the atributes a real values.
     * @param acc
     * @param bal
     */
    public Account(String acc ,int bal)
    {
        accno = acc;
        balance =bal;
    }
    
    
    /**
     *function to set values in the balance atributes.
     * @param b
     */
    public void setbalance(float b)
    {
        balance = b ;
    }

    /**
     *function to get the value of the balance
     * @return
     */
     public float getbalance()
    {
        return balance ;
    }

    /**
     *function to set values in the account no. atributes.
     * @param acc
     */
      public void setaccno(String acc)
    {
        accno =acc;
    }
    /**
     *function to get the value of the account no.
     * @return
     */
       public String getaccno()
    {
        return accno ;
    }
    /**
     *function bult just for print the values of balance and acc.no.
     */
       
      public void displayAccountInfo(){
        System.out.println("Account Number is\t" + getaccno() + "\nAccount Balance is\t"+ getbalance());
        System.out.println("--------------------------------------------");
    }
      
    /**
     *ovveriding function from the base class.
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
    /**
     *function to return or print the value of the balance after the clint add some money.
     * @param am
     */
    public void deposit(float am)
    {
        float newBalance;
        newBalance = balance + am;
        balance = newBalance;			
    }
    /**
     *function to return the value of the balance after the clint subtract or withdraw some money.
     * @param amount
     */
    public void withdraw(float amount)
    {
        if(balance>=amount)
        {
        float newBalance = balance - amount;
        balance = newBalance ;
    }
    }
    
}