/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import newpackage.Anotimp;

/**
 *
 * @author Andrei
 */
public class myclass {
public static void main(String[] args){
    
   Anotimp a1 = Anotimp.IARNA;
   
   switch (a1){
       case PRIMAVARA:
       case TOAMNA: System.out.println("Ploua!"); break;
       case VARA: System.out.println("Este cald!"); break;
       case IARNA: System.out.println("Este frig!"); break;
       default: System.out.println("Nu exista acest anotimp.");
   }
   
    
}
    
    
}
