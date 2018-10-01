/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Ejaan Nama
 *
 */
package pbo.pkg10117910.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan25Ejaannama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length;
        char alphabet;
        String frontName;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        frontName = scn.next();
        length = frontName.length();
        System.out.println("\nEjaan untuk " + " \"" + frontName + "\" adalah : ");

        for (int i = 0; i < length; i++) {
            System.out.println("alphabet ke-" + (i + 1) + " : " + frontName.charAt(i));
        }
     
    }

}
