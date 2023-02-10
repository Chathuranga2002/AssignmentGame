package Class;

import java.util.ArrayList;

public class PleyerAWeponStore {
  public static ArrayList<Integer> aplayer =new ArrayList<>();
    public static int tatal;

    public static void SetValus(int a){
        aplayer.add(a);

        System.out.println(aplayer);
    }

    public static int GetValus(){
        for (int tot:aplayer
             ) {
            tatal+=tot;

        }
        return tatal;
    }
}
