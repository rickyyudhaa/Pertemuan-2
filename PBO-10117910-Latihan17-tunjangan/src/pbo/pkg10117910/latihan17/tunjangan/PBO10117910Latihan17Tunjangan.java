/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Tunjangan
 *
 */
package pbo.pkg10117910.latihan17.tunjangan;

/**
 *
 * @author rickyyudhaa
 */
import java.util.Scanner;

public class PBO10117910Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String status, vStatus;
        double allowance, salary, totalSalary;
        vStatus = "menikah";
        Scanner scan = new Scanner(System.in);
        System.out.println("=================Program Tunjangan=================");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        salary = scan.nextDouble();
        System.out.print("Status Anda? (menikah/belum)     : ");
        status = scan.next();

        if (status.equals(vStatus)) {
            allowance = 0.35 * salary;
        } else {
            allowance = 0;
        }
        totalSalary = salary + allowance;
        
        System.out.println("============Hasil Perhitungan Gaji Anda============");
        System.out.println("Gaji Pokok      : " + salary);
        System.out.println("Tunjangan       : " + allowance);
        System.out.println("Total Gaji      : " + totalSalary);
    }

}
