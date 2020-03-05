public class Insertion {
	
	public static void main(String[] args) {
        int[] arr = {55, 33, 77, 11, 38, 55, 58, 11, 2, 9};
        arr = insertion(arr);
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}
	
	public static int[] insertion(int[] arr) {
		int len = arr.length;
		
		for (int i = 1; i < len; i++) {
			int temp = arr[i];
			int curr = i - 1;
			while ((curr >= 0) && (arr[curr] > temp)) {
				arr[curr + 1] = arr[curr];
				curr--;
			}
			arr[curr+1] = temp;
		}
		
		return arr;
	}

}
