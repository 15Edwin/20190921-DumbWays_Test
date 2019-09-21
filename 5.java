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
public class lima {
    public static void main (String[] args) {
        
        int hargaTelur = 2500;
        int tanggalBeli = 13;
        int jumlahUang = 60000;
        int telurAwal, telurBonus, totalTelur, brpLusin;
        
        boolean status_prima = true;
        for (int i = 2; i < tanggalBeli; i++) {
            if ((tanggalBeli % i) == 0) {
                status_prima = false;
                break;
            }
        }
        
//        Tanggal kelipatan lima dan prima
        if (status_prima == true && tanggalBeli % 5 == 0) {
            System.out.println("Tanggal " + tanggalBeli + " merupakan bilangan prima dan kelipatan 5.");
            
            telurAwal = jumlahUang/hargaTelur;
            System.out.println("Telur awal : "+telurAwal);
            
//            Telur lebih dari 1 lusin, mendapat bonus
            if (telurAwal > 12) {
                brpLusin = telurAwal/12;
//                System.out.println(brpLusin + " lusin");
                telurBonus = brpLusin * 2;
//                jika jumlah bonus telur ganjil atau tidak
                if (telurBonus % 2 == 1) {
                    telurBonus = telurBonus * 5;
                } else {
                    telurBonus = telurBonus * 10;
                }                
                totalTelur = telurAwal + telurBonus;
                System.out.println("Total telur : " + totalTelur);              
            }
            
//            Telur tidak mencapai satu lusin, tidak ada bonus
            else {
                System.out.println("Total telur : " + telurAwal);
            }
        }
        
//        Tanggal prima
        else if (status_prima == true) {
            System.out.println("Tanggal " + tanggalBeli + " merupakan bilangan prima");
            
            telurAwal = jumlahUang/hargaTelur;
            System.out.println("Telur awal : "+telurAwal);
//            Telur lebih dari 1 lusin, dapat bonus
            if (telurAwal > 12) {
                brpLusin = telurAwal/12;
//                System.out.println(brpLusin + " lusin");
                telurBonus = brpLusin * 2;                
                totalTelur = telurAwal + telurBonus;
                System.out.println("Total telur : " + totalTelur);              
            }
//            Tidak mendapat bonus
            else {
                System.out.println("Total telur : " + telurAwal);
            }
        } 
        
        
        else {
            System.out.println("Tanggal " + tanggalBeli + " bukan bilangan prima");
            
            telurAwal = jumlahUang/hargaTelur;
            System.out.println("Telur awal " + telurAwal);
            
            if (tanggalBeli % 2 == 1) {
                
                brpLusin = telurAwal/12;
                System.out.println(brpLusin + " lusin");
                telurBonus = brpLusin * 3;
                
                if (tanggalBeli % 5 == 0) {
                    if (telurBonus % 2 == 1) {
                        telurBonus = telurBonus * 5;
                    } else {
                        telurBonus = telurBonus * 10;
                    }
                }
                
                else {
                    System.out.println("Tanggal ganjil bukan prima");
                    brpLusin = telurAwal/12;
                    System.out.println(brpLusin + " lusin");
                    telurBonus = brpLusin * 3;
                    totalTelur = telurAwal + telurBonus;
                    System.out.println("Total telur : " + totalTelur);
                }
            }
            
//            else if (tanggalBeli % 5 == 0) {
//                System.out.println("Tanggal kelipatan 5 bukan prima");
//                telurAwal = jumlahUang/hargaTelur;
//                System.out.println("Telur awal : " + telurAwal);
//                
//            }
            
            else {
                System.out.println("Tanggal "+tanggalBeli+ " adalah genap, bukan bilangan prima dan bukan kelipatan 5");
                System.out.println("Total telur : " + telurAwal);
            }
        }
        
    }
}
