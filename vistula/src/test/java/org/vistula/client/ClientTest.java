package org.vistula.client;

import org.junit.Test;

public class ClientTest {

    @Test
    public void store(){
        Client joanna = new Client("Sara",25, 175, 80,true );
        assert joanna.getName() == "Sara";
        assert joanna.getAge() == 25;
        assert joanna.getHeight() == 175;
        assert joanna.getWeight() == 80;
        assert joanna.getIsWoman() == true;


    }

    @Test
    public void clientisNotTall() {
        Client person = new Client("John", 45, 185, 76,false);
        person.setHeight(185);
        assert person.isShort() == false;

    }
}
