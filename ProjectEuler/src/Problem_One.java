
public class Problem_One {
	 
	public static void main(String args[]) {
		
		
		
	}
	
	public static int ProblemOne(int upTo, int multipleOne, int multipleTwo) {
		int sum = 0; // variable called sum set to 0;
		
		for(int i = 0; i < upTo; i++){ // for loop that counts up to 1000
			if(( i%3 == 0) || (i%5 == 0)){ // finds any number dividable by 3 or 5
				sum += i; // adds each dividable onto the variable
			}
		}
		 return sum; // prints out final value once loop has finished.

	}
	
	
	
}
