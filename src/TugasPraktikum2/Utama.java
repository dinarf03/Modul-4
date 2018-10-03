/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Dinar F V M
 */
public class Utama {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        kalkulator k = new kalkulator();

        //input
        System.out.print("Masukan Bilangan Pertama : ");
        double bil1 = Double.parseDouble(br.readLine());
        System.out.print("Masukan Bilangan Kedua : ");
        double bil2 = Double.parseDouble(br.readLine());

        k = new kalkulator(bil1, bil2);
        System.out.println("");

        //output
        System.out.println();
        System.out.print("Hasil Penjumlahan = ");
        k.penjumlahan();
        System.out.print("Hasil Pengurangan = ");
        k.pengurangan();
        System.out.print("Hasil Perkalian = ");
        k.perkalian();
        System.out.print("Hasil Pembagian = ");
        k.pembagian();
    }
}
