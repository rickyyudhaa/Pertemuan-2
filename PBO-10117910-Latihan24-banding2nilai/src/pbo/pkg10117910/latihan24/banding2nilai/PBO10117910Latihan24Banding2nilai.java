/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Perbandingan 2 nilai
 *
 */
package pbo.pkg10117910.latihan24.banding2nilai;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan24Banding2nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstValue,secondValue;
        String lagi;
        Scanner scn = new Scanner(System.in);
        System.out.println("========Program Perbandingan Nilai========");
        
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai pertama : ");
            firstValue = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            secondValue = scn.nextInt();
            
//            rumus perbandingan
            if (firstValue > secondValue) {
                System.out.println("Hasil : "+firstValue+" Lebih besar dari "+secondValue+"\n");
            }else if(firstValue < secondValue){
                System.out.println("Hasil : "+firstValue+" Lebih kecil dari "+secondValue+"\n");
            }else
                System.out.println("Hasil : "+firstValue+" sama dengan "+secondValue+"\n");
                
//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (ya/tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("tidak"));
    }
    
}
