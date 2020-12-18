public class Selection {
    
    public static void main(String[] args) {
        int[] arr = {55, 33, 77, 11, 38, 55, 58, 11, 2, 9};
        arr = selection(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] selection(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
    
}
