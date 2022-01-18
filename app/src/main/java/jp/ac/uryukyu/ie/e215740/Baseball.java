package jp.ac.uryukyu.ie.e215740;

import java.util.Random;
import java.util.Scanner;

/**
 * Baseballクラス
 */
public class Baseball{
    static String [][] strikezone = { { "・", "・", "・" }, { "・", "・", "・" }, { "・", "・", "・" } };
    int strikeCount = 0;
    boolean strikeOut = false;
    boolean homerun = false;
    static boolean aim = false;
    boolean gameSet = false;
    
    /**
     * ストライクゾーンを生み出すメソッド
     */
    public void zone(){
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                
                System.out.print(strikezone[a][b]);
            }
            System.out.println();
        }
    }

    /**
     * ピッチャーの動きを決定するメソッド
     */
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

    /**
     * バッターの動きを決定し、その後の結果によって終わり方を決めるメソッド
     */
    public void batter(){
        Scanner scanLength = new Scanner(System.in);
        Scanner scanWidth = new Scanner(System.in);
        aim = false;
       
        while(aim == false){
            System.out.println("高さの入力");
            int length = scanLength.nextInt();

            System.out.println("横の入力");
            int width = scanWidth.nextInt();

            if(strikezone[length -1][width - 1] == "✕"){
                System.out.println("そこじゃない!やり直し!");         
            }
            if (strikezone[length - 1][width - 1] == "・"){
                strikezone[length - 1][width - 1] = "✕";
                strikeCount += 1;
                System.out.println("ストライク!");
                         
                if(strikeCount == 3){
                    strikeOut = true;
                    System.out.println("バッターアウト");
                    gameSet = true;
                    if(gameSet = true){
                        break;
                    }
                }     
            }
            if (strikezone[length - 1][width - 1] == "○"){
                homerun = true;
                System.out.println("ホームラン!!");
                gameSet = true;
                if(gameSet = true){
                    break;
                }
            }
        }
        
        if (gameSet == true){
            scanLength.close();
            scanWidth.close();          
        }
    }
}
