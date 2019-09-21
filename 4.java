/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dumbways;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class empat {
    public static void main (String[] args) {
        
        String drawLine = "DUMBWAYS";
//        Scanner sc = new Scanner (System.in);
        System.out.println("Drawline : "+drawLine);
//        drawLine = sc.next();
        System.out.println("");
        
        for (int i = 1; i <= drawLine.length(); i++) {
            for (int j = 1; j <= i; j++) {
                
                if (i >= 2 && j <= i-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(drawLine.charAt(i-1));
                }
            }
            
            System.out.println();
        }
    }
}