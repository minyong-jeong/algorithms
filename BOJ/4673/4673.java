class Main {

    public static void main(String[] args) {
    		int[] result = new int[10000];
    		int num = 1;
    		
    		for(int i = 1; i <= 10000; i++) {
    			num = d(i);
    			if (num <= 10000)
    				result[num - 1] = 1;
    		}
    		
    		for (int i = 0; i < 10000; i++) {
    			if(result[i] != 1)
    				System.out.println(i + 1);
    		}
    }    
    
    public static int d(int n) {
    		int sum = n;
    		while(n != 0) {
    			sum += (n % 10);
    			n = n / 10;
    		}
    		return sum;
    }
    
}