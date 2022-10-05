/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

/**
 *
 * @author Wapal
 */
import java.util.Scanner;

public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int a;
        int b;
        int c;
        int d;
        int e;
        int i;
        
        System.out.println("Entrez 5 valeurs : ");
        System.in.read(a);
        System.in.read(a);
        System.in.read(a);
        */
        
        int a, i;
        
        System.out.println("Entrez un nombre : ");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        //i = sc.nextInt();
        
        
        
        //System.in.read(a);
        
        /*System.out.println("\nEntrez le nombre de la multiplication : ");
        System.in.read(i);*/
        
        System.out.println("La table de multiplication est : \n");
        //System.in.read(m);
        for(i=0; i<=a; i++)
            {
               System.out.println(a + "x" + i + "=" + (a*i));
            }
        }
            
    }

