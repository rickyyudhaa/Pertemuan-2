/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Ganti Kata
 *
 */
package pbo.pkg10117910.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence, changeWord, newWord;
        Scanner kata = new Scanner(System.in);

        System.out.println("===== Program Mengganti Nama =====");
        System.out.println("");

        System.out.print("Masukkan Kalimat      : ");
        sentence = kata.nextLine();
        System.out.print("Ganti Kata            : ");
        changeWord = kata.next();
        System.out.print("Menjadi Kata          : ");
        newWord = kata.next();
        System.out.println("");

        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal        : " + sentence);
        String kataAkhir = sentence.replace(changeWord, newWord);
        System.out.println("Kalimat Baru        : " + kataAkhir);
    }
    
}