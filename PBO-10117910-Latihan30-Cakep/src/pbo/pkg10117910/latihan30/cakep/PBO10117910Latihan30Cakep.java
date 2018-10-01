/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Cakep
 *
 */
package pbo.pkg10117910.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan30Cakep {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        String answers;
        Scanner scn = new Scanner(System.in);

        System.out.print(ANSI_RED + "Kamu " + ANSI_RESET);
        System.out.print(ANSI_GREEN + "ngerjain sendiri " + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "latihan 17 sampe " + ANSI_RESET);
        System.out.print(ANSI_BLUE + "latihan 30 ini? \n" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "answers " + ANSI_RESET);
        System.out.print(ANSI_RED + "(Yoi/Enggak) : " + ANSI_RESET);
        answers = scn.next();

        String finalAnswers = answers.toUpperCase();
        if (finalAnswers.equals("YOI")) {
            System.out.print(ANSI_RED + "\nCakep Bener. " + ANSI_RESET);
            System.out.print(ANSI_PURPLE + "Good Job \n" + ANSI_RESET);
        } else {
            System.out.print(ANSI_RED + "\nTetep cakep sih. " + ANSI_RESET);
            System.out.print(ANSI_CYAN + "\nSing penting paham konsep nya yee. "
                    + ANSI_RESET);
            System.out.print(ANSI_BLACK + "\nKeep the code works dude." + ANSI_RESET);
        }
    }

}
