import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("counting Sort");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj najwieksza wartosc ciagu");
        int max = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ile liczb bedzie mial ciag");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Podaj kolejno %d liczb:\n", size);
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            numberArray[i] = readNumber(max);
        }

        System.out.println("tablica nieposortowana");
        for (int element : numberArray) System.out.print(element + ", ");
        System.out.println();

        countingSortArray(numberArray, max);

        System.out.println("tablica posortowana");
        for (int element : numberArray) System.out.print(element + ", ");

    }

    public static void countingSortArray(int[] numberArray, int max) {
        int[] temp = new int[max + 1];
        int size = numberArray.length;
        for (int i = 0; i < max + 1; i++) temp[1] = 0;
        for (int i = 0; i < size; i++) temp[numberArray[i]]++;
        int k = 0;
        for (int i = 0; i < max; i++) {
            for (int j = temp[i]; j >= 1; j--) {
                numberArray[k] = i;
                k++;
            }
        }
    }

    public static int readNumber(int max) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= max) return number;
        else{
            System.out.printf("wprowadz liczbe nie wieksza niz %d\n", max);
            return readNumber(max);
        }
    }

}