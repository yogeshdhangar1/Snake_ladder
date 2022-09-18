public class Playtwoplayer {
    public static final int noplay = 1;
    public static final int snake = 2;
    public static final int ladder = 3;

    public static void main(String[] args) {
        int p1 = 0, p2 = 0;
        int start = 0;
        int count = 0;
        int option2 = 0;
        int option1 = 0;
        while (p1 <= 100 && p2 <= 100) {
            count++;
            if (p1 == 100 || p2 == 100) {
                if (p1 == 100) {
                    System.out.println("player1 won the game");
                } else {
                    System.out.println("player2 won the game");
                }
                break;
            }
            option1 = (int) Math.floor(Math.random() * 10 % 6 + 1);
            if (option2 != ladder) {
                int dicep1 = (int) Math.floor(Math.random() * 10 % 6 + 1);
                    System.out.println("p1:option1:" + option1 + "dice:" + dicep1 + "Dice count" + count + "time");
                    switch (option1) {
                        case ladder:
                            if (p1 + dicep1 > 100) {
                                break;
                            } else {
                                p1 = p1 + dicep1;
                            }
                            System.out.println("position of the player:" + p1);
                            continue;
                        case snake:
                            if (p1 - dicep1 < 0) {
                                break;
                            } else {
                                p1 = p1 - dicep1;
                            }
                            break;
                        case noplay:
                            p1 = p1 + 0;
                            break;
                    }
                    System.out.println("Postion of the player1 is:" + p1);
                }
                if (option1 != ladder) {
                    option2 = (int) Math.floor(Math.random() * 10 % 6 + 1);
                    int dicep2 = (int) Math.floor(Math.random() * 10 % 6 + 1);
                    System.out.println("P2:Option2" + option2 + "Dice:" + dicep2 + "Dice Count:" + count + "time");
                    switch (option2) {
                        case ladder:
                            if (p2 + dicep2 > 100) {
                                break;
                            } else {
                                p2 = p2 + dicep2;
                            }
                            System.out.println("Position player2 is :" + p2);
                            continue;
                        case snake:
                            if (p2 - dicep2 < 0) {
                                break;
                            } else {
                                p2 = p2 - dicep2;
                            }
                            break;
                        case noplay:
                            p2 = p2 + 0;
                            break;
                    }
                    start++;
                    System.out.println("position of player2 is :" + p2);
                }
            }
        }

    }

