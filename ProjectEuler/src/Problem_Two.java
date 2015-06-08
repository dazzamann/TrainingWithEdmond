
public class Problem_Two {
	
	
	  public static void main(String[] args) // METHOD
	  {
		 
	  }
	  
	  public static int ProblemTwo() {
		    int sum = 0; // Variable representing even numbers
		    
		    
		    int firstNum = 1; // first number in sequence
		    int secNum = 2; // second number in sequence
		    
		    boolean toContinue = true; // boolean to carry on loop
		    
		    while(toContinue) // beginning of loop
		    {
		      if(firstNum > 4000000) // carries out if until condition is met
		      {
		        toContinue = false; // turns variable to false
		        break; // breaks if statement
		      }
		      
		      if(firstNum % 2 == 0) // if first number in sequence multiplied by 2 = 0 then add variable (firstNum) to total sum
		        sum += firstNum;
		      
		      
		      int temp = firstNum + secNum;
		      firstNum = secNum;
		      secNum = temp;
		    }
		    
		    return sum;
		  
	  }
}

