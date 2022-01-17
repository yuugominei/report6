package jp.ac.uryukyu.ie.e215740;

/**
 * Mainクラス
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[]args){
        Baseball game = new Baseball();      
        do{
            game.zone();
            game.pitcher();
            game.batter();
            game.zone();
            if(game.homerun == true){
                System.out.println("Congratulations");
            }else if(game.strikeOut == true){
                System.out.println("You lose!");
            }
        }while(game.gameSet == false);
        System.out.println("ゲームセット!");
    }
}

