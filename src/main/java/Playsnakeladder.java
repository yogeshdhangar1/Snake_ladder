import java.util.Random;
public class Playsnakeladder {
   public static final int noplay = 1;
    public static final int snake = 2;
     public static final int ladder = 3;

    public static void main(String[] args) {
        int start = 0;
        while(start<=100){
            if(start==100){
                break;
            }
            int dice = (int)Math.floor(Math.random()*10%6+1);
            int option = (int)Math.floor(Math.random()*10%3+1);

            // case statement
            switch(option){
                case noplay:
                    start = start=0;
                    break;
                case ladder:
                    start = start+dice;
                    break;
                case snake:
                    start = start-dice;
                    break;
            }
            System.out.println("Postion of player:" + start);
        }
    }
}
