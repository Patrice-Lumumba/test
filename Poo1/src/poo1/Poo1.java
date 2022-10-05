/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

/**
 *
 * @author Wapal
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        int i = 0;
        int j = 0;
        
        System.out.println("Entrez la taille du tableau : ");
        System.in.read(a);
        
        for(i=0; i<a; i++)
        {
            for(j=0; j>=a; j++)
            {
                System.out.println("*");
            }
        }
    }
    
}
