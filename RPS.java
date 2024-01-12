import java.util.Scanner;



public class RPS {
    public static void main(String[] args) {

        /*
        1. Let's play Rock Paper Scissors against a computer! You can play by typing r for rock, p for paper, s for scissor
        2. Make your choice:
        3. record user input
        4. You picked [blank] and the computer picked [blank]. You [win/lose]!
        5. Type a to play again!
        6. record user input
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors against a computer! You can play by typing r for rock, p for paper, s for scissor");
        System.out.println("Make your choice: ");
        String userinput = scanner.next();
        double randomnum = Math.random();
        boolean ur = false;
        boolean up = false;
        boolean us = false;
        boolean cr = false;
        boolean cp = false;
        boolean cs = false;
        String userchoice = "nothing";
        String comchoice = "nothing";
        if (randomnum < ((double)(1)/3)) {
            cr = true;
            comchoice = "rock";
        } else if (randomnum > ((double)(2)/3)) {
            cp = true;
            comchoice = "paper";
        }
        else {
            cs = true;
            comchoice = "scissors";
        };
        //System.out.println(cr);
        //System.out.println(cp);
        //System.out.println(cs);
        if (userinput.equals("r")) {
            ur = true;
            up = false;
            us = false;
            userchoice = "rock";
        } else if (userinput.equals("p")) {
            up = true;
            ur = false;
            us = false;
            userchoice = "paper";
        }
        else {
            us = true;
            up = false;
            ur = false;
            userchoice = "scissors";
        };
        //System.out.println(ur);
        //System.out.println(up);
        //System.out.println(us);
        boolean hasWon = ur&&cs||up&&cr||us&&cp;
        boolean hasTied = ur&&cr||up&&cp||us&&cs;


        String result = "didn't play";
        if(hasWon&&(!hasTied)) {
            result = "win";
        }else if (!hasWon) {
            if (hasTied) {
                result = "tied";
            } else if (!hasWon&&!hasTied) {
                result = "lose";
            };
        };

        System.out.println("You picked " + userchoice + " and the computer picked " + comchoice + ". You " + result + "!");
        //System.out.println("Type a to play again: ");
        //String playagain = scanner.next();

    }
}
