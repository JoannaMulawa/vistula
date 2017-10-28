package org.vistula.human;

import org.junit.Test;

public class HumanTest {

    @Test
    public void myFirstTest() {
        Human joanna = new Human(19, "Joanna","Mulawa");
        assert joanna.getAge() == 19;
    }

    @Test
    public void testEmptyConstructor() {
        Human jessica = new Human();
        jessica.setAge(19);
        assert jessica.getAge() == 19;

    }

    @Test
    public void testParameterlessConstructor() {
        Human john = new Human();
        assert john.getAge() == 35;
        assert john.getName() == "John";
        assert john.getLastName() == "Milton";
    }

    @Test
    public void verifyName() {
        Human cyprian = new Human(8, "Cyprian", "Kowalski");
        assert cyprian.getName() == "Cyprian";
    }
    @Test
    public void verifyName2() {
        Human jessica = new Human();
        jessica.setName("Jessica");
        assert jessica.getName() == "Jessica";
        jessica.setAge(21);
        assert jessica.getAge() == 21;
        jessica.setLastName("Rainbow");
        assert jessica.getLastName() == "Rainbow";
    }

    @Test
    public void verifyLastName() {
        Human bianka = new Human(6, "Bianka", "Nowak");
        bianka.setLastName("Kowalska");
        assert bianka.getLastName() == "Kowalska";
    }

    @Test
    public void verifyLastNameGetter() {
        Human borsuk = new Human(56, "Borsuk", "Turban");
        assert borsuk.getLastName() == "Turban";


    }

}
