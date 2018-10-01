/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Hitung Lingkaran 
 *
 */
package pbo.pkg10117910.latihan22.hitunglingkaran;

/**
 *
 * @author rickyyudhaa
 */
import java.util.Scanner;

public class PBO10117910Latihan22Hitunglingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cek; //
        double diameter, spoke, wide, around;
        Scanner scn = new Scanner(System.in);

        System.out.println("======Perhitungan Lingkaran======");
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            cek = scn.nextLine();

            System.out.println((!cek.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");
        } while (!cek.matches("[0-9]*"));

        System.out.println("\n======Hasil Perhitungan Lingkaran======");

        diameter = Double.parseDouble(cek);

        spoke = diameter / 2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n", spoke);
        wide = Math.PI * spoke * spoke;
        System.out.printf("Luas Lingkaran = %.2f cm %n", wide);
        around = 2 * Math.PI * spoke;
        System.out.printf("Keliling Lingkaran = %.2f cm %n", around);
    }

}
