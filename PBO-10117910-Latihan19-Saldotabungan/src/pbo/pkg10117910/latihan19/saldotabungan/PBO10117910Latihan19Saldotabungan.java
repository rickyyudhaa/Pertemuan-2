/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Saldo Tabungan
 *
 */
package pbo.pkg10117910.latihan19.saldotabungan;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan19Saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Balance, currentBalance, interest;
        Balance = 2500000;
        interest = 0.15;
        int i = 1;
        while (i <= 6){
            Balance = Balance + (Balance * interest);
            System.out.printf("Saldo di bulan ke-" + i + "= Rp. %,12.0f%n", Balance);
            i = i + 1;
        }
    }
}
