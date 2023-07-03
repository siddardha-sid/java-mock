package Problems;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fibonacci(10);
	}
	public static void fibonacci(int n) {
		int i=0;
		int j=1;
		
		System.out.print(i+" "+j+" ");
		for(int k=1;k<n;k++) {		}
		int k=i+j;
		System.out.print(k+" ");
		i=j;
		j=k;
		
		
		
	}

}
