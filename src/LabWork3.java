public class LabWork3 {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        System.out.println(multiplyThis(array));
    }

    private static int multiplyThis(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }
}
