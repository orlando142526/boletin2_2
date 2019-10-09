/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

/**
 *
 * @author oyagualendara
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Cantos grados centigrados fai hoxe?");
      float celsius= sc.nextFloat();
      float fahrenheit=((celsius*1.8f)+32f);
      float kelvin=(celsius+273.15f);
      System.out.println(celsius+"ºC son "+fahrenheit+"ºf y "+kelvin+" K");

        
        
        // TODO code application logic here
    }
    
}
