package dumbways;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class tiga {
    public static void main (String[] args) {
        int a = 500;
        int b = 1000;
        int c = 2000;
        int d = 5000;
        int e = 10000;
        int f = 20000;
        int g = 50000;
        
//        int totalBelanja, jumlahUang, kembalian;
//        Scanner sc = new Scanner (System.in);
        int totalBelanja = 110500;
        System.out.println("Total belanja : "+totalBelanja);
//        totalBelanja = sc.nextInt();
        
//        Scanner cs = new Scanner (System.in);
        int jumlahUang = 200000;
        System.out.println("Jumlah uang : "+jumlahUang);
//        jumlahUang = cs.nextInt();
        
        System.out.println("");
        
        int kembalian = jumlahUang-totalBelanja;
        System.out.println("Uang kembali : " + kembalian);
        
        int hitung = kembalian/g;
        int sisa = kembalian%g;
        
        int hitung2 = sisa/f;
        int sisa2 = sisa%f;
        
        int hitung3 = sisa2/e;
        int sisa3 = sisa2%e;
        
        int hitung4 = sisa3/d;
        int sisa4 = sisa3%d;
        
        int hitung5 = sisa4/c;
        int sisa5 = sisa4%c;
        
        int hitung6 = sisa5/b;
        int sisa6 = sisa5%b;
        
        int hitung7 = sisa6/a;
        int sisa7 = sisa6%a;
        
        System.out.println("Pecahan uang yang keluar : ");
        System.out.println(hitung + " x 50000");
        System.out.println(hitung2 + " x 20000");
        System.out.println(hitung3 + " x 10000");
        System.out.println(hitung4 + " x 5000");
        System.out.println(hitung5 + " x 2000");
        System.out.println(hitung6 + " x 1000");
        System.out.println(hitung7 + " x 500");
    }
}