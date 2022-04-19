import java.util.Scanner;

public class TaskPool {

    public static void main(String[] args) {

        int[] arguments = setParameters();
        Pool pool = new Pool(arguments[0], arguments[1], arguments[2]);
        System.out.println(pool.capacity());
    }

    public static int[] setParameters() {
        System.out.println("Input parameters of a pool");
        int[] arguments = new int[3];
        String[] words = {"length: ", "width: ", "height: "};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(words[i]);
            try {
                arguments[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong data. Try again");
                return setParameters();
            }
        }
        return arguments;
    }

    public static class Pool {

        private final int length;
        private final int width;
        private final int height;

        public Pool(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        public long capacity() {
            System.out.print("Capacity of a pool: ");
            return (long) length * width * height * 1000;
        }
    }
}