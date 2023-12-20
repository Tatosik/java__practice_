package mirea__lab__12_3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        Deque<Integer> player1Deck = parseInput(input1);
        Deque<Integer> player2Deck = parseInput(input2);

        int moves = 0;
        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int card1 = player1Deck.pollFirst();
            int card2 = player2Deck.pollFirst();

            if (card1 == 0 && card2 == 9) {
                player1Deck.offerLast(card1);
                player1Deck.offerLast(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Deck.offerLast(card1);
                player2Deck.offerLast(card2);
            } else if (card1 > card2) {
                player1Deck.offerLast(card1);
                player1Deck.offerLast(card2);
            } else {
                player2Deck.offerLast(card1);
                player2Deck.offerLast(card2);
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

    private static Deque<Integer> parseInput(String input) {
        Deque<Integer> deck = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            int cardValue = Character.getNumericValue(input.charAt(i));
            deck.offerLast(cardValue);
        }
        return deck;
    }
}

