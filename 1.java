/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dumbways;

import java.util.Random;

/**
 *
 * @author Edwin
 */
public class satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 250; i++) {
            String tes = generateSN(4);
            String tes1 = generateSN(4);
            String tes2 = generateSN(4);
            String tes3 = generateSN(4);
            
            System.out.println("Serial number " + i + " = "+ tes + "-" + tes1 +  "-" + tes2 + "-" + tes3);
        }       
    }
    
    public static String generateSN(int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphanumeric = (letters + letters.toUpperCase() + "0123456789").toCharArray();        
        
        StringBuilder sn = new StringBuilder();

        for (int i = 0; i < length; i++) {
           sn.append(alphanumeric[new Random().nextInt(alphanumeric.length)]);
        }        
        return sn.toString();
    }
    
}
