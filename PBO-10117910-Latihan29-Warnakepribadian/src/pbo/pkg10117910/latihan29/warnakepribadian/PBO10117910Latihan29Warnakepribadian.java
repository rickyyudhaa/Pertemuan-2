/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Warna kepribadian
 *
 */
package pbo.pkg10117910.latihan29.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan29Warnakepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";   
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    public static void hasil(String colorPilih) {
        String warna = colorPilih.toUpperCase();
        switch (warna) {
            case "KUNING":
                System.out.println(ANSI_YELLOW + " KUNING \n" + ANSI_RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul, \n"
                        + "3. Periang, \n"
                        + "4. Senang menolong, \n"
                        + "5. Lincah dan aktif, \n"
                        + "6. Tidak suka meremehkan kekurangan orang lain, \n"
                        + "7. Loyal, \n"
                        + "8. Hangat, \n"
                        + "9. Meskipun karakternya optimis dan idealis, "
                        + "seringkali goyah dan tidak stabil, \n"
                        + "10. Cenderung penakut."
                );
                break;
            case "HIJAU":
                System.out.println(ANSI_GREEN + " HIJAU \n" + ANSI_RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan, \n"
                        + "3. Teguh pada prinsip, \n"
                        + "4. Menginginkan kesempurnaan, \n"
                        + "5. Mudah cemburu, \n"
                        + "6. Mudah merasa, \n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan "
                        + "kepercayaan."
                );
                break;
            case "BIRU":
                System.out.println(ANSI_BLUE + " BIRU \n" + ANSI_RESET);
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana, \n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah, \n"
                        + "4. Dinamis, \n"
                        + "5. Senang Berbagi, \n"
                        + "6. Bersahabat, \n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"
                        + "8. Menyembunyikan perasaan karena karakternya yang"
                        + " cenderung mencari jalan damai, \n "
                );
                break;
            case "MERAH":
                System.out.print(ANSI_RED + " MERAH \n" + ANSI_RESET);
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil resiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat  menahan marah namun jika sudah tahap puncak "
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "UNGU":
                System.out.println(ANSI_PURPLE + " UNGU \n" + ANSI_RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Tidak pernah ragu, \n"
                        + "3. Menurut pasangannya yang ideal adalah yang"
                        + "memiliki mental yang kuat, \n"
                        + "4. Memiliki ambisi yang besar, \n"
                        + "5. Memiliki empati yang besar, \n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi"
                        + "perasaannya, \n"
                        + "7. Terkadang bersikap keras kepala dan angkuh, \n"
                );
                break;
            default:
                System.out.println("Maaf Belum Terdefinisikan");
                break;
              
        }
    }

    public static void main(String[] args) {
        String colorPilih;
        String nama;
        Scanner berwarna = new Scanner(System.in);
        
        System.out.print(ANSI_RED + "YUK " + ANSI_RESET);
        System.out.print(ANSI_GREEN + "CEK " + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "KEPRIBADIANMU " + ANSI_RESET);
        System.out.print(ANSI_CYAN + "DARI " + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "WARNA " + ANSI_RESET);
        System.out.print(ANSI_BLUE + "FAVORITMU" + ANSI_RESET);
        
        System.out.print("\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + 
                "\t MERAH \t\t" + ANSI_RESET);
        System.out.print("\n" + ANSI_GREEN_BACKGROUND + ANSI_WHITE + 
                "\t HIJAU \t\t" + ANSI_RESET);
        System.out.print("\n" + ANSI_YELLOW_BACKGROUND + ANSI_WHITE + 
                "\t KUNING \t" + ANSI_RESET);
        System.out.print("\n" + ANSI_BLUE_BACKGROUND + ANSI_WHITE + 
                "\t BIRU \t\t" + ANSI_RESET);
        System.out.print("\n" + ANSI_PURPLE_BACKGROUND + ANSI_WHITE + 
                "\t UNGU \t\t\n\n" + ANSI_RESET);
        
        System.out.print("PILIH WARNA FAVORITMU         : ");
        colorPilih = berwarna.next();
        System.out.print("NAMA KAMU                     : ");
        nama = berwarna.next();
        
        System.out.println("\n====HASIL TES KEPRIBADIAN " 
                + nama.toUpperCase() + "====");
        hasil(colorPilih);
       
    }
}
