package LabWork2;

import java.util.Random;
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.setCountOfTry();
        int count = game.countOfTry + 1;
        game.setHumanNumber();
        while (game.countOfTry > 0) {
            if (game.isWinner()) {
                break;
            }
            System.out.println("Не угадали. У вас " + (game.countOfTry) + " попыток.");
            game.setHumanNumber();
            game.countOfTry--;
        }
        System.out.println(game.isWinner() ? "Вы угадали c " + (count - game.countOfTry) + " попыток!" :
                "Вы проиграли. Компьютер загадывал число " + game.compNumber);
    }

    static final class Game {

        private int humanNumber;
        private final int compNumber;
        private int countOfTry;

        public Game() {
            System.out.println("Компьютер загадал число от 1 до 10 включительно.");
            this.compNumber = new Random().nextInt(10) + 1;
        }

        public void setCountOfTry() {
            System.out.println("Какое количество попыток вам потребуется, чтобы отгадать его?");
            countOfTry = checkAvailableNumber();
            if (countOfTry < 1) {
                System.out.println("Попыток должно быть больше 0");
                setCountOfTry();
            } else {
                countOfTry--;
            }
        }

        public void setHumanNumber() {
            System.out.println("Введите число: ");
            humanNumber = checkAvailableNumber();
        }

        private int checkAvailableNumber() {
            Scanner scanner = new Scanner(System.in);
            int val = 0;
            try {
                val = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Это не число");
            }
            return val;
        }

        public boolean isWinner() {
            return humanNumber == compNumber;
        }
    }
}
