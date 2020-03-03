import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		int[] score = new int[n];
    		int max = 0;
    		double sum = 0;
    		for (int i = 0; i < n; i++) {
    			score[i] = scan.nextInt();
    			sum += score[i];
    			if (score[i] > max) {
    				max = score[i];
    			}
    		}
    		
    		double result = (sum / max * 100) / n;
    		System.out.printf("%.2f\n", result);
    }        
    
}