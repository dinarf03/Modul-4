/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanInterface;

/**
 *
 * @author Dinar F V M
 */
public class InterfaceBujurSangkar implements InterfaceBangunDatar {

    private double sisi;

    public InterfaceBujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 4;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}
