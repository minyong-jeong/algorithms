public class Bubble {

    public static void main(String[] args) {
        int[] arr = {55, 33, 77, 11, 38, 55, 58, 11, 2, 9};
        arr = bubble(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] bubble(int[] arr) {
        int len = arr.length;
        boolean loop = true;

        while (loop) {
            loop = false;
            for (int i = 1; i < len; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    loop = true;
                }
            }
            len--;
        }

        return arr;
    }

}
