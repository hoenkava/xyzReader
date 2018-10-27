/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond;

import java.util.Scanner;

/**
 *
 * @author Assassin
 */
public class Diamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner heera = new Scanner(System.in);
        int i,j,k,space;
        System.out.print("Enter no of Rows: ");
        i = heera.nextInt();
        space = i - 1;
        for(k = 1;k <= i; k++)
            {
            for(j = 1;j <= space; j++)
            {
                System.out.print(" ");
            }
            space--;
            for(j = 1; j <= 2 * k - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            }
        space = 1;
        for(k = 1; k <= i - 1; k++)
            {
            for(j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            space++;
            for(j = 1; j <= 2 * (i - k)-1; j++)
            {
            System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}