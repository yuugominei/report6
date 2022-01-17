package jp.ac.uryukyu.ie.e215740;

import java.util.Random;

public class Baseball{
    static String [][] strikezone = { { "・", "・", "・" }, { "・", "・", "・" }, { "・", "・", "・" } };
    int strikeCount = 0;
    
    public void zone(){
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                
                System.out.print(strikezone[a][b]);
            }
            System.out.println();
        }
    }
    public void pitcher(){
        
        if(strikeCount < 3){
            Random pitcher = new Random();
            int lengthCourse = pitcher.nextInt(3);
            int widthCourse = pitcher.nextInt(3);
            if(strikezone[lengthCourse][widthCourse] == "・"){
                strikezone[lengthCourse][widthCourse] = "○";
            }
        }
        
        System.out.println("ピッチャー構えます");
    }

}
