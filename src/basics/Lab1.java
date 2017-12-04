package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Write a function that takes a value n and returns the sum of 1 to n
		System.out.println(sum(5));
		
		// Write a function that computes factorial *hint: use recursion, n = n*(n-1)! = 
		System.out.println("Factorial: " + fact(5));
		
		// Write 3 functions that return the min, max, and avg of an array
		int[] numbers = {5,-2,0,234,-438,63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
	}
	
public static int findAvg(int[] array){
	// Take sum and divide by number of elements
	int sum = 0;
	for (int i = 0; i < array.length; i++){
		sum = sum + array[i];
	}
	System.out.println("Sum: " + sum);
	return sum/array.length;
}
	
	public static int findMin(int[] array){
		int min = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] array){
		int max = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	
	
	public static int sum(int n){
		int sum = 0;
		for (int i = 1 ; i <= n ; i++){
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	public static int fact(int n){
		if (n == 0){
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}

}
