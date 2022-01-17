package jp.ac.uryukyu.ie.e215740;

public class Baseball{
    static String [][] strikezone = { { "・", "・", "・" }, { "・", "・", "・" }, { "・", "・", "・" } };
    
    public void zone(){
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                
                System.out.print(strikezone[a][b]);
            }
            System.out.println();
        }
    }
}
