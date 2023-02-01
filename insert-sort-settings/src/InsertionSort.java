import java.util.Scanner;

public class InsertionSort {
    private static void inputArray(int[] A, int n) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ]: ");
            A[i] = scn.nextInt();
        }
    }

    private static void printArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("A[ " + i + " ]: " + A[i]);
        }
    }

    private static void insertSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int x = A[i];
            int y = i;
            while (y > 0 && A[y - 1] > x) {
                A[y] = A[y - 1];
                y--;
            }
            A[y] = x;
        }
    }

    public static void main(String[] args) {
        int[] array;
        int length;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        length = scn.nextInt();
        array = new int[length];
        System.out.println("Mảng ban đầu: ");
        inputArray(array, length);
        System.out.println("Mảng sau khi sắp xếp (Insertion Sort)");
        insertSort(array, length);
        printArray(array, length);
    }

}