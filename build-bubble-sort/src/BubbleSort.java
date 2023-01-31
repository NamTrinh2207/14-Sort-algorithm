public class BubbleSort {
    static int[] list = {13, 4, 7, 0, 6, 1, -9, -6, 25, 11};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) System.out.print(j + " ");
    }
}