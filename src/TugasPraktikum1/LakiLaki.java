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
public class LakiLaki extends Manusia {

    //konstruktor
    public LakiLaki(double TB) {
        super(TB);
    }

    //method HtgBBI () merupakan method overidding dari superclass nya
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.9;
    }
}
