package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        //Initialize the deck of cards
        String[] suit = {"Clubs", "Daimonds", "Hearts", "Daimonds"};
        String[] rank =  {"2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K", "A"};

        String [] deck = new String[52];

        for (int i = 0; i < 52; i++){
            deck[i] = rank[i%13] +" " + " " + suit[i/13];
            System.out.println(deck[i]);

        }//End for loop
        //Shuffle the deck
        for (int i = 0; i < 52; i++){
            int index = (int) (Math.random() * 52);

            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }//End this for loop
        //Print the shuffle deck
        for (String u : deck) {
            System.out.print(u);
        }//End print for loop
        //Distribute 9 cards to 4 players
        int currentDeckCard = 0;
        for (int player=1; player<=4; player++){
            System.out.println("currentplayer: "+player);
            for (int card=1; card<=9; card++){
                //System.out.println("currentplayer: "+player);
                System.out.println(deck[currentDeckCard]);
                currentDeckCard++;
            }
            System.out.println();
        }//End this for loop

    }//End Main
}//End Class
