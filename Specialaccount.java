/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


/**
 *class inherts protected and public atributes and methodes in the base class to use it again instead of rewrite it .
 * @author ABDO
 */
public class Specialaccount extends Account {
       

    boolean special;
        
    /**
     *default constructor used to initialize the atribute special. 
     */
    public Specialaccount()
    {
        special = true ; 
    }
    
    /**
     *polymerization ovveride methode make the client withdraw money utill it will be -1000. 
     * @param amount
     */
    @Override
    public void withdraw(float amount) {
        if((balance - amount)>= -1000)
        super.withdraw(amount);
        //To change body of generated methods, choose Tools | Templates.
    }

}
