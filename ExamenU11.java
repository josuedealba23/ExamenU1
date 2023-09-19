/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenU11 ;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExamenU11 {

    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("ingresa nombre del juego1");
        
        System.out.println("ingresa precio del juego1");
        int juego1 = scanner.nextInt() ;
        
        scanner.nextLine();
        System.out.println("ingresa nombre del juego2");
        
        System.out.println("ingresa precio del juego2");
        int juego2 = scanner.nextInt() ;
        
        scanner.nextLine();
        System.out.println("ingresa nombre del juego3");
       
        System.out.println("ingresa precio del juego3");
        int juego3 = scanner.nextInt() ;
        
        double porcentaje1 = (juego1*30)/100;
        double porcentaje2 = (juego2*65)/100;
        double porcentaje3 = (juego3*15)/100;
        
       System.out.println("el precio del juego1 es:" + porcentaje1);
       System.out.println("el precio del juego2 es:" + porcentaje2);
       System.out.println("el precio del juego3 es:" + porcentaje3);
}
}
