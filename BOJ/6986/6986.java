import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		// input items
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		int k = scan.nextInt();
    		
    		// make an array
    		double[] arr = new double[n];
    		for (int i = 0; i < n; i++) {
    			arr[i] = scan.nextDouble() * 100000;
    		}
    		
    		// insertion sort
    		for (int i = 1; i < arr.length; i++) {
    			double temp = arr[i];
    			int aux = i - 1;
    			
    			while ((aux >= 0) && (arr[aux] >= temp)) {
    				arr[aux + 1] = arr[aux];
    				aux--;
    			}
    			arr[aux + 1] = temp;
    		}
    		
    		// sum
    		double sumOfNum = 0.0;
    		double sumOfNum2 = 0.0;
    		for (int i = 0; i < n; i++) {
    			if (i >= k && i < n - k) {
    				sumOfNum += arr[i];
    				sumOfNum2 += arr[i];
    			}
    			else if(i < k) {
    				sumOfNum2 += arr[k];
    			}
    			else if(i >= n - k) {
    				sumOfNum2 += arr[n - k - 1];
    			}
    		}
    		
    		// 절사평균
    		double avg = sumOfNum / (n - 2*k);
    		System.out.printf("%.2f\n", avg / 100000);
    		
    		// 보정평균
    		avg = sumOfNum2 / n;
    		System.out.printf("%.2f\n", avg / 100000);
    }        
    
}