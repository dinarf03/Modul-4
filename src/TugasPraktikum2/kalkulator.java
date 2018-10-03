/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author Dinar F V M
 */
public class kalkulator implements operasi {

    //deklarasi variabel / atribut
    private double bil1, bil2;

    public kalkulator() {
    }

    public kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    @Override
    public void penjumlahan() {
        System.out.println(bil1 + bil2);
    }

    @Override
    public void pengurangan() {
        System.out.println(bil1 - bil2);
    }

    @Override
    public double perkalian() {
        System.out.println(bil1 * bil2);
        return 0;
    }

    @Override
    public double pembagian() {
        System.out.println(bil1 / bil2);
        return 0;
    }
}
