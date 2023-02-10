package Class;

import java.util.ArrayList;

public class PlyerBWeponStore {

               public static   ArrayList<Integer> bplayer =new ArrayList<>();
              public static int tatal;

                public static void SetValus(int a){
                        bplayer.add(a);
                    System.out.println(bplayer);

                }

                public static int GetValus(){
                        for (int tot:bplayer
                        ) {
                                tatal+=tot;

                        }
                        return tatal;
                }


}
