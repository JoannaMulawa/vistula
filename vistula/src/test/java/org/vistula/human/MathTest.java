package org.vistula.human;

import org.junit.Test;
import org.vistula.math.Math;

public class MathTest {

    @Test
    public void shouldCorrectlyMultiply() {
        Math multiplication = new Math(5,6);
        assert multiplication.multiply() == 30;

    }

    @Test
    public void shouldCorrectlyMuliply2() {
        Math multi = new Math();
        multi.setNumberOne(3);
        multi.setNumberTwo(4);
        assert multi.multiply () == 12;
    }

    @Test
    public void shouldCorrectlyAdd() {
        Math add =  new Math(5,6);
        assert add.add() == 11;
    }

    @Test
    public void shouldCorecctlySubstrac() {
        Math substraction = new Math(5, 6);
        assert substraction.substraction() == 1;
    }

    @Test
    public void multiplyMethodTest() {
        Math mulipla = new Math();
        assert mulipla.multiply(2,5) == 10;
        }

}
