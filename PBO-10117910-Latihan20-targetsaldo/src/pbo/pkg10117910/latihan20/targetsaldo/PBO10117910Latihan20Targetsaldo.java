/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Target Saldo Tabungan
 *
 */
package pbo.pkg10117910.latihan20.targetsaldo;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan20Targetsaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Balance, currentBalance, interest;
        Balance = 3500000;
        interest = 0.08;
        do {            
            for (int i = 1; i <= 8; i++) {
            Balance = Balance + (Balance * interest);
            System.out.printf("Saldo di bulan ke-" + i + "= Rp. %,12.0f%n", Balance);
        }
        } while (Balance <= 6000000);
    }

}
