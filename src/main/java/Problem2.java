public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        // From smallest to largest
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    sorted = false;
                }
            }
        }
         // I copied the code from this website: https://stackabuse.com/bubble-sort-in-java/
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
            /* if (i == 0) {
                System.out.print("{" + data[i]);
            } else {
                System.out.print(", " + data[i]);
            }
        }
        System.out.print("}");
       */
    }
}
