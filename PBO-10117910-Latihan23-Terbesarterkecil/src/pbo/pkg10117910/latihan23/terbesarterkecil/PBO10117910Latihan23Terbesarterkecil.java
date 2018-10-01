/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Nilai Terbesar dan Terkecil
 *
 */
package pbo.pkg10117910.latihan23.terbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan23Terbesarterkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String staff;
        int student, Biggest, smallest, Grade;
        Scanner scn = new Scanner(System.in);
        Biggest = 0;
        smallest = 100;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa=====");

        System.out.print("Masukkan Nama staff : ");
        staff = scn.next();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        student = scn.nextInt();

        for (int i = 1; i <= student; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            Grade = scn.nextInt();

            Biggest = ((Biggest <= Grade) ? Grade : Biggest);
            smallest = ((smallest >= Grade) ? Grade : smallest);
        }

        System.out.print("\nNilai Terbesar adalah : " + Biggest);
        System.out.println("\nNilai Terkecil adalah : " + smallest);
    }

}
