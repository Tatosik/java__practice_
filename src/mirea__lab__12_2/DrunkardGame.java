package mirea__lab__12_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        Queue<Integer> player1Deck = parseInput(input1);
        Queue<Integer> player2Deck = parseInput(input2);

        int moves = 0;
        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            if (card1 == 0 && card2 == 9) {

                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else if (card1 == 9 && card2 == 0) {

                player2Deck.offer(card1);
                player2Deck.offer(card2);
            } else if (card1 > card2) {

                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else {

                player2Deck.offer(card1);
                player2Deck.offer(card2);
            }

            moves++;
        }

        if (player1Deck.isEmpty()) {
            System.out.println("second " + moves);
        } else if (player2Deck.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }

    private static Queue<Integer> parseInput(String input) {
        Queue<Integer> deck = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            int cardValue = Character.getNumericValue(input.charAt(i));
            deck.offer(cardValue);
        }
        return deck;
    }
}

