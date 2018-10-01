/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Rata-Rata Nilai 
 *
 */
package pbo.pkg10117910.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan21Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int student;
        double average, totalGrade, grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        student = scan.nextInt();
        
        totalGrade = 0;
        for (int i = 1; i <= student; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            grade = scan.nextDouble();
            totalGrade += grade;
        }
            average = totalGrade / student;
            System.out.println("Maka, Rata-rata Nilainya adalah " + average );
    }
    
}
