
public class Trial {

	public static void main(String[] args) {
		
		//This is a single comment
		/* This is a Multi-line
		 * comment and it'll close itself automatically
		 */
		
		//More Practice..
		System.out.println("Hello World");
		
		//Different types of variables..
		
	    String fruit = "bananas";
	    System.out.println(fruit);
	    System.out.println("The ** is " +fruit);
	    
	    int amount = 5000;
	    int size = 4000;
	    int total = amount + size;
	    System.out.println(amount);
	    System.out.println(total);
	    System.out.println(size + amount);
		
	    
	    int bookNum;
	    bookNum = 22; 
	    System.out.println(bookNum);
	    
		boolean meaning;
		meaning = true;
		System.out.println(meaning);
		System.out.println("Is there a lot of meaning in this world? " +meaning);
		
		boolean luck = false;
		System.out.println(luck);
		System.out.println("Is there luck in this world? " +luck);
		
		
		float monkey = 4.56f;
		double rhinestone = 556.200;
		System.out.println(monkey);
		System.out.println(rhinestone);
		
		//Type casting where we convert int to double (widening casting)
		
		int b = 9;
		double c = b; 
		System.out.println(b);
		System.out.println(c);
		
		char p = 'C';
		double z = 5.5;
		System.out.println(p);
		System.out.println(z);
		
		//using operators
		int x = 20;
		x += 5; 
		x -= 4;
		System.out.println(x);
		
		//Strings: finding the string length
		String fly = "ABCDEFGHJUYT";
		System.out.println("The string length is: " +fly.length());
		
		//concatenation (combine things)
		String ab = "Elina";
		String ba = "Johnny";
		System.out.println(ab + " " +ba);
		System.out.println(ab.concat(ba));
		
		int i = 4;
		double f = 5.4;
		System.out.println(i + " " + f + "\n");
		System.out.println("i="+i+" f="+f);
		System.out.println(Math.sqrt(25));
		
		/* Will show false/true without typing in boolean
		 
		 */
		
		int xy = 12;
		int yx = 15;
		System.out.println(xy > yx);
		System.out.println(xy == yx);
		
		//Getting into the loops now... 
		
		//First is the if statement
		int j = 100;
		int g = 50;
		
		if (j > g) {
			System.out.println("j is greater than g");
			
	
		}
		
		//else statement
		if (g > j ) {
			System.out.println("100 is greater than 50");
		} else {
			System.out.println("Yolo");
		}
		
		
		/* else if statement specifies a new condition if the 
		first condition is false */
		
		if (g > j) {
			System.out.println("Enter a value greater than 100");
		} else if (g < 30) {
			System.out.println("Pumpkin pie");
		} else {
			System.out.println("You can't see me");
		}
		
		
		//switch
		int weekend = 5;
		switch (weekend) {
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekends are awesome");		

		}
		
		
		//while loops, they run over and over again
		/*increase the variable used in the condition,
		 or else the loop will never end
         */
		int mx = 0;
		while (mx < 5) {
		  System.out.println("Bananas");
		  mx++;
		}
		
		/* do while loop, executes the code under "do" once
		 before it checks if the condition is true. As long as 
		 the condition is true, the loop will keep repeating.
		 */
		
		 int unicorn = 0;
		 do {
			 System.out.println(unicorn);
			 unicorn++;
		 }
		while (unicorn < 4);
		 
		 //for loops
		 
		 for (int iz = 0; iz < 6; iz++) {
			 
	     System.out.println(iz);
		 }
		
		 //For each loop using an array
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		 for (String iz : cars) {
		   System.out.println(iz);
		 }
		 
		/* break jumps out of the loop here,
		 and will read the condition in if
		 */
		
		for (int iz =0; iz < 10; iz++) {
			if (iz == 4) {
				break;
			}
			System.out.println(iz);
		}
		
		// here, continue will read the condition after for
		
		for (int iz =0; iz < 10; iz++) {
			if (iz == 4) {
				continue;
			}
			System.out.println(iz);
		}
		
		
		//Arrays. [0] displays the first element in lovely
		
		int[] lovely = {11, 12, 13, 14};
		System.out.println(lovely[0]);
		lovely[1] = 15; //will output 15 instead of 12 from lovely
		
		/*loop through an array (length property/counter
		 shows how many times the loop will run */
		
		for (int iz =0; iz < lovely.length; iz++) {
			System.out.println(lovely[iz]);
		}
		
		/* multidimensional arrays. [0][1] = [first array]
		 [2nd element]. We count from 0, 1, 2, etc. Each { } 
		 inside myNumbers specifies a range of elements.
		 
		 */
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int iz  = myNumbers[0][3];
		System.out.println(iz);
		
		/* using for loop inside another for loop to get
		 elements of a multi-dim. array 
		 */
	     int [][] digital = { {2, 3, 4, 5}, {7, 8, 10}};
	     for (int ib = 0; ib < digital.length; ++ib) {
	       for (int jx = 0; jx < digital[ib].length; ++jx) {
	    	  System.out.println(digital[ib][jx]); 
	     }
	    	 
	     }
	     
	     
		
		
	
		
		
		
		
		
		
		
		

	}

}
