package Class;

import Controler.Wepon;

import java.util.Random;

public class Tank implements Wepon {
    static int shurt;
    @Override
    public void shoot() {
        Random random=new Random();
        shurt=random.nextInt(11);


    }

    @Override
    public int getScore() {
        return shurt;
    }
}
