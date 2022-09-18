import java.util.Random;
public class Diceroll {
    public static void main(String[] args) {
      Random random = new Random();
      int diceroll = (int)Math.floor(Math.random()*10%6+1);
        System.out.println("Number:"+ diceroll);

    }
}
