public class Shell {
    
    public static void main(String[] args) {
        int[] arr = {55, 33, 77, 11, 38, 55, 58, 11, 2, 9};
        
        arr = shell(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] shell(int[] arr) {
        int len = arr.length;
        
        int h;
        for (h = 0; h < len; h = 3 * h + 1);
        for (;h > 0; h=h/3) {
            for (int i = h; i < len; i++) {
                int temp = arr[i];
                int j = i;
                
                while (j >= h && arr[j-h] > temp) {
                    arr[j] = arr[j-h];
                    j -= h;
                }
                
                arr[j] = temp;
            }
        }
        
        return arr;
    }
}