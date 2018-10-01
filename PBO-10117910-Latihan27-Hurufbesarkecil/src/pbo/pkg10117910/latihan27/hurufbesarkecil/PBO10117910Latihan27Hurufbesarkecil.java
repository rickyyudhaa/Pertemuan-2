/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Huruf Besar dan Kecil
 *
 */
package pbo.pkg10117910.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence, upperCase, lowerCase;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan sentence : ");
        sentence = scn.nextLine();

        upperCase = sentence.toUpperCase();
        lowerCase = sentence.toLowerCase();
        System.out.println("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + upperCase);
        System.out.println("Huruf Kecil : " + lowerCase);
    }

}
