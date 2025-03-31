package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment {

	public static void main(String[] args) {
	
// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
		// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 int result = ages[ages.length - 1] - ages[0];
	        System.out.println("Result: " + result);
		
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
			//i. Make sure that there are 9 elements of type int in this new array.
			 
			
	        
	        int[] ages2;
	        ages2 = new int[9];
	        ages2[0] = 5;
	        ages2[1] = 4;
	        ages2[2] = 15;
	        ages2[3] = 20;
	        ages2[4] = 5;
	        ages2[5] = 6;
	        ages2[6] = 58;
	        ages2[7] = 90;
	        ages2[8] = 18;
	        
	     // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
	      //iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
	        int result2 = ages2[ages2.length - 1] - ages2[0];
	        System.out.println("Result ages 2: " + result2);
	        
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	       
	        int average;
	        int newTemp = 0;
	       for (int i=0 ; i < ages2.length; i++) { //example 10 spots in array - 0 - 9	    
	        	if(i < ages2.length - 1) { // spots 0-8 
	        		newTemp += ages2[i];	
	        	} else { //final loop
	        		newTemp += ages2[i];
	        		average = newTemp / ages2.length; //then gather average after total - average age going up to 2 decimal places
	        		System.out.println("Average age = " + average);
	        	}//end of IF statement
	        	
	        }//end of for loop
	        

// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	        // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	        // b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    
	    //a
	    double newTemp2 = 0;
	    for (String name : names) {//enhanced for loop to make it shorter/efficient
	    	newTemp2 += name.length();
        }//end of for loop
	    
	    double average2 = newTemp2 / names.length;
        System.out.println("Average number of letters per name = " + average2);
	    
        //b
        String result3 = "";
        for (String name : names) {
            result3 += name + " "; // Adds each name followed by a space
        }
        result3 = result3.trim();//removed the space at the end of the string, which was put in by the enhanced for loop
        System.out.println(result3);

// 3. How do you access the last element of any array?
//you can access the last element in any array by referencing last index in that array
        //example
        String lastElement = names[names.length - 1];//with the array, we would need to set up a reference for that last element 
        System.out.println("last array element example = " + lastElement);
        
// 4. How do you access the first element of any array?
//you can access the first element in an any array by referencing the first index in that array
        //example
        System.out.println("First array element example = " + names[0]);//since the first position will always be '0', we can type in the code without putting a reference

// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];//sets up the length of the int array to the size of the string array   
       
        
        
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); //adds the length of each string to each index of the new array
        }//end of for loop
        
        
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int sum = 0; //placeholder variable
        for (int length : nameLengths) {
            sum += length; // Add each length to the sum
        } //end of for loop
        
        System.out.println("Sum = " + sum);
        
        
        System.out.println("======================");
        System.out.println("======================\n");
        
        System.out.println("Method for string concatenation #7 = " + repeatWord("Hello", 3));
        
        System.out.println("======================");
        System.out.println("======================\n");
        
        String name1 = "sally";
        String name2 = "smith";
     System.out.println("method for full name #8 = " + getFullName(name1, name2));
        
     System.out.println("======================");
     System.out.println("======================\n");
     
     System.out.println("Method to check if sum is greater than 100 #9 = " + isGreaterThan100(nameLengths));
     
     System.out.println("======================");
     System.out.println("======================\n");
     
     double[] exampleDouble = new double[10];
     double testDouble = 0;//setting up the placeholder to populate array
     
     for (int i = 0 ; i<10;i++) { //loop to set up values
    	 
    	 
    	 if (i==0) {
    		 testDouble = 1.29;
    		 exampleDouble[i] = testDouble;
    		 //System.out.println(exampleDouble[i]); //used to check if the array was populating correctly
    	 } else {
    		 testDouble = testDouble * 2;
    		 exampleDouble[i] = testDouble;//doubles the value and inputs it into the array
    		 //System.out.println(exampleDouble[i]); //used to check if the array was populating correctly
    	 }//end of IF statement
    	 
     }//end of for loop
     
     
     System.out.println("#10: method for average of double array = " + doubleAverage(exampleDouble));
     
     System.out.println("======================");
     System.out.println("======================\n");
     
     double[] exampleDouble2 = new double[20];
     
     for (int i = 0 ; i < exampleDouble2.length ; i++) { //setting up again with the same steps as before
    	 if (i==0) {
    		 testDouble = 3.59;
    		 exampleDouble2[i] = testDouble;
    		// System.out.println(exampleDouble2[i]); //used to check if the array was populating correctly
    	 } else {
    		 testDouble = (testDouble * 2) + 0.59;
    		 exampleDouble2[i] = testDouble;
    		 // System.out.println(exampleDouble2[i]); //used to check if the array was populating correctly
    	 }//end of IF statement
    	 
     }//end of for loop
     
     System.out.println("method for average of double array #11 = " + doubleAverage(exampleDouble2)); //called a previous method to help with this problem
     System.out.println("method #11 Is the average of the first array greater than the second? " + isGreaterThanSecond(exampleDouble, exampleDouble2));
    
     System.out.println("======================");
     System.out.println("======================\n");
     
     
     
     /*
     public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && (moneyInPocket > 10.50);
	        // checks the temperature first, then checks the condition for money in pocket
	    }//end of method
      */
     
     double testDouble12 = 10.51;
     boolean test12 = true;
     
     
     System.out.println("#12: true or false for method 'willByDrink' is = " + willBuyDrink(test12, testDouble12));
     
     System.out.println("======================");
     System.out.println("======================\n");

     Map<String, Double> gradeBook = new HashMap<>();
     gradeBook.put("Week 1", 100.00);
     gradeBook.put("Week 2", 100.00);
     gradeBook.put("Week 3", 100.00);
     gradeBook.put("Week 4", 100.00);
     gradeBook.put("Week 5", 100.00);
     gradeBook.put("Week 6", 100.00);
     gradeBook.put("Week 7", 100.00);
     gradeBook.put("Week 8", 100.00);
     gradeBook.put("Week 9", 100.00);
     gradeBook.put("Week 10", 90.00); //only up to week 10, so we will see how the rest of the bootcamp goes 
     
     
     System.out.println("Method #13 to print out final grade for the bootcamp. Grade letter: " + gradeFinal(gradeBook));
     
        
	}//end of main body
        
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).\
	
	 public static String repeatWord (String word, int n) {
		 String result = "";

	        for (int i = 0; i < n; i++) {
	            result += word; // Concatenates the word
	        } //end of for loop

	        return result; 
	    }

// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	 public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName; // Concatenate first name, space, and last name
	    }//end of method
	 
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 public static boolean isGreaterThan100(int[] numbers) {
	        int sum = 0;

	        // Iterate over the array and calculate the sum
	        for (int i = 0; i < numbers.length ; i++) {
	            sum += numbers[i];
	        }

	        // Return true if the sum is greater than 100, otherwise false
	        return sum > 100;
	    }//end of method

//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 public static double doubleAverage(double[] numbers) {
	        double sum = 0.00; //have to set up a double for the placeholder so we can return it properly towards the end 
	       
	        for (double num : numbers) {
	            sum += num;
	        }//end of for loop
	        
	        return sum / numbers.length;//inputting code on one line for more efficiency and because it will line up with the requested double variable called by the method
	    }//end of method

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	    public static boolean isGreaterThanSecond(double[] array1, double[] array2) {
	    	 double sum1 = 0; //setting up 2 placeholders for the enhanced for loops to utilize
	    	 double sum2 = 0;
	    	 
	         for (double num : array1) {
	             sum1 += num;
	         }//end of for loop
	    	
	         for (double num : array2) {
	             sum2 += num;
	         }//end of for loop
	       
	        
	        
	        return sum1 > sum2;
	    }//end of method

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && (moneyInPocket > 10.50);// checks the temperature first, then checks the condition for money in pocket
	    }//end of method

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	    /*
public static char gradeFinal (double[] grades) {
	char gradeLetter = ' ';
	int value = 0;
	
	for (double grade : grades) {
		value += grade;
	}
	
	value /= grades.length;
	
	switch (value) {
	
	}//end of switch statement
	
	
	return gradeLetter; 
			
}
*/

public static double gradeFinal(Map<String, Double> grades) {
    if (grades == null || grades.isEmpty()) {
        System.out.println("The gradebook is null or empty");
         return 0.00;
    }

    double sum = 0.0;
    for (double value : grades.values()) {
        sum += value;
    }

    return sum / grades.size();
}
	

}//end of code
