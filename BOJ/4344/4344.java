import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		for (int i = 0; i < n; i++) {
    			int total = scan.nextInt();
    			int[] score = new int[total];
    			int sum = 0;
    			for (int j = 0; j < total; j++) {
    				score[j] = scan.nextInt();
    				sum += score[j];
    			}
    			double avg = sum / total;
    			
    			double result = 0;
    			for (int j = 0; j < total; j++) {
    				if (avg < score[j])
    					result++;
    			}
    			
    			double percent = result / total * 100;
    			System.out.printf("%.3f%%\n", percent);
    		}
    }        
    
}