/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author Dinar F V M
 */
import java.util.Scanner;

public class BeratBadanIdeal {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //instance of class
        Manusia[] m = new Manusia[2];
        //deklarasi variable
        int x = 0;
        do {
            //input
            System.out.println("User" + (x + 1));
            System.out.print("Masukan tinggi badan anda (cm) = ");
            double t = input.nextDouble();
            System.out.print("Masukan jenis kelamin anda (L/P) = ");
            String jk = input.next();
            //proses + output
            if (jk.toUpperCase().equals("L")) {
                m[x] = new LakiLaki(t);
                System.out.print("Berat badan ideal Laki-Laki ini adalah" + m[x].HtgBBI());
                System.out.println();
            } else {
                m[x] = new Perempuan(t);
                System.out.print("Berat badan Perempuan ini adalah" + m[x].HtgBBI());
                System.out.println();
            }
            x++;
        } while (x < 2);
    }

}
