/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Waktu Saat Ini
 *
 */
package pbo.pkg10117910.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan26Waktusaatini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamis","Jumat"};
         System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +time.format(cal.getTime()));
        
    }
    
}
