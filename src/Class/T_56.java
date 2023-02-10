package Class;

import Controler.Wepon;

import java.util.Random;

public class T_56 implements Wepon {
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
