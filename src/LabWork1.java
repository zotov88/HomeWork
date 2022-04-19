import java.util.Random;
import java.util.Scanner;

public class LabWork1 {

    public static void main(String[] args) {

        System.out.println("Input three numbers");
        System.out.println("Sum of entered numbers is " + sumOfThree());
    }

    private static int sumOfThree() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("First: ");
            int a = sc.nextInt();
            System.out.println("Second: ");
            int b = sc.nextInt();
            System.out.println("Third: ");
            int c = sc.nextInt();
            return a + b + c;
        } catch (Exception e) {
            System.out.println("It's not a number " + emoutes() + "\nTry again\n");
            return sumOfThree();
        }
    }

    private static String emoutes() {
        String[] array = {"¯\\_(ツ)_/¯", "(＃＞＜)", "(￢_￢;)"};
        return array[new Random().nextInt(3)];
    }
}