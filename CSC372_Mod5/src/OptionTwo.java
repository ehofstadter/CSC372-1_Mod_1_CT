import java.util.Scanner;

public class OptionTwo {

	public static void main (String[]args) {
		
		//instantiate scanner to receive input
		Scanner s = new Scanner(System.in);
		int[] inputs = new int[5];
		int sumOfInputs = 0; 
	
		//for loop iterates prompt for integers, 
		//which are stored at position 'i' of the 'inputs' array
		for (int i = 0; i < 5; i++) {
		
			System.out.println("Please enter an integer");
			int inputNumber = s.nextInt();
			inputs[i] = inputNumber;
		}
	
		//the next two for statements are to read back inputs  
		//and produce the product through a for loop rather than
		//recursion; this was used to verify accuracy
		for (int i = 0; i < 5; i++) {
			System.out.println(inputs[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			sumOfInputs += inputs[i];
		}
		
		//the final two lines of output should match
		//if recursion works appropriately
		System.out.println(sumOfInputs); 
		
		System.out.println(getSum(inputs,0));
		
	}
	
	//recursive method getProd utilizes input list from main
	//and 0 as arguments
	//0 is used as an initial check to make sure nums array is not empty
	static int getSum (int[] nums, int n) {	
		if(nums.length <= n) return 0;
		
		return nums[n]+getSum(nums, n+1);
	}
}
