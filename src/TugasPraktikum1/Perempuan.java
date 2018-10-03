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
public class Perempuan extends Manusia {

    //konstruktor
    public Perempuan(double TB) {
        super(TB);
    }

    //Method HtgBBI merupakan method overidding dari superclass nya
    public final double HtgBBI() {
        return (super.getTB() - 100) * 0.8;
    }
}
