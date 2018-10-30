/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marckus;
import java.util.*;
/**
 *
 * @author admin
 */
public class Marckus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ciudad;
        int cont=0;
        char letra;
        char seguir;
        
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        System.out.println("Anota la letra:");
        letra=sc.nextLine().charAt(0);
        letra=Character.toUpperCase(letra);//lee las letras en mayusculas
        
        do{
        
            System.out.println("anota ciudad");
            ciudad=sc.nextLine();
            ciudad= ciudad.toUpperCase();// lee las letras en mayusculas 
        
                            
            if(letra==ciudad.charAt(0) )
                cont++;
          
            System.out.println("Otra cidudad?");
            seguir=sc.nextLine().charAt(0);
        }while(seguir=='s');
        
         System.out.println("cuantas son "+cont);
        
        // TODO code application logic here
    }
    
}
