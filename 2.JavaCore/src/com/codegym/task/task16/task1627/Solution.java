package com.codegym.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;
//
//Three people play the game. Each player (Gamer) is characterized by two parameters: last name (name) and the actions-per-second (rating).
//        Display the actions taken and determine the winner and the losers.
//        Let's begin...
//        1. Figure out what the program does.
//        1.1. List<String> actions stores the sequence of actions performed by each player from 0 to the last.
//        1.2. isWinnerFound indicates whether the winner has been found.
//        1.3. The sleep method throws an InterruptedException and takes a long argument.
//        1.4. The players play independently of each other.
//        2. Implement the run method so that for each player:
//        2.1. At regular intervals (1000ms/rating), the actions specified in the actions list are displayed.
//        2.2. All text begins with the player's name (getName()), followed by a colon, and then the text itself.
//
//        Example:[Smith:Game start].
//
//        2.3. When a player has performed all of the actions in the actions list, he or she wins. Display [getName() + ":won!"].
//        2.4. When the winner is found, the game ends, and the remaining players have lost. For these players, display [getName() + ":lost"].
//
//        Don't display the square brackets ("[]").
//
//
//        Requirements:
//        1. At regular intervals (1000ms/rating), the Gamer class's run method should display the player's last name (getName()),
//        followed by a colon, and then the text in OnlineGame.actions. Example: [Smith:Game start].
//        2. When all the game actions have been completed and the winner has not yet been found, the run method must set the flag OnlineGame.isWinnerFound to true
//        (to inform the others that it is the winner).
//        3. If a player wins, his or her run method should display [getName() + ":won!"]. For example: [Jones:won!].
//        4. The run methods of all players who did not win (those who were interrupted) should display [getName() + ":lost"]. For example: [Gates:lost]
//        5. The run method must not throw an exception when it is interrupted.



public class Solution {


    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {

        public static volatile boolean isWinnerFound = false;

        public static List<String> actions = new ArrayList<>();

        static {
            actions.add("Start game");
            actions.add("Gather resources");
            actions.add("Grow economy");
            actions.add("Kill enemies");
        }

        protected Gamer gamer1 = new Gamer("Smith", 3);
        protected Gamer gamer2 = new Gamer("Jones", 1);
        protected Gamer gamer3 = new Gamer("Gates", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
           // System.out.println("dado por enterado");
            gamer1.interrupt();
            //System.out.println("Smith interrupt");
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //write your code here

            for(String ac:OnlineGame.actions){
                try {
                    Thread.sleep(1000/rating);
                }catch (InterruptedException e){
                    System.out.println(getName() + ":lost");
                    //break;
                }
                if(!OnlineGame.isWinnerFound){
                    System.out.println(getName()+":" + ac);
                    if(OnlineGame.actions.indexOf(ac)==(OnlineGame.actions.size()-1)){
                        System.out.println(getName() + ":won!");
                        OnlineGame.isWinnerFound=true;
                    }
                }
            }


        }
    }
}
