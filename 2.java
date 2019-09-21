/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dumbways;

/**
 *
 * @author Edwin
 */
public class dua {
    
    public static void main (String[] args) {
        String[] dataKey = {"dumb", "ways", "the", "best"};
        String word = "dumbways";
        
        for (int i = 0; i < dataKey.length; i++) {
            if ( word.toLowerCase().indexOf(dataKey[i].toLowerCase()) != -1 ) {

            System.out.println(dataKey[i]+" => true");

         } else {

            System.out.println(dataKey[i]+" => false");

         }
        }
    }
}
