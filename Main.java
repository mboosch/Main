public class Main {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;
        int valueSum = value1 + value2;
        boolean boleanValue = true;
        System.out.println("Summe: " + valueSum + " " + boleanValue);

        double value3 = 0.5;
        double value4 = 1.0;
        double floatSum = value3 / value4;
        System.out.println(floatSum);

        String[] array = new String[5];
        array[0] = "Hallo";
        System.out.println(array[0]);
        System.out.println(array.length);

        int[] arrayInt = new int[3];
        arrayInt[0] = 4;
        arrayInt[1] = 6;
        arrayInt[2] = 2;

        int sum = arrayInt[0] + arrayInt[2];
        System.out.println(sum);
        System.out.println(arrayInt.length);

    }
}
// HaLLo