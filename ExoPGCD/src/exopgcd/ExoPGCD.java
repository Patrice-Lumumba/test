/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exopgcd;

/**
 *
 * @author Wapal
 */
public class ExoPGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner();
        int a=25, b=75, PGCD=0;
        /*System.out.println("Entrez le premier nombre : ");
        System.in.read(a);
        System.out.println("Entrez le deuxieme nombre : ");
        System.in.read(b);*/
        
        for(int i=1; i<= a && i<= b; i++)
        {
            if(a% i==0 && b%i==0)
                PGCD = i;
        }
        System.out.printf("Le PGCD de %d et %d est : %d", a,b,PGCD);
        //Copyright by Patrice Lumumba 26/09/22
    }
    
}
