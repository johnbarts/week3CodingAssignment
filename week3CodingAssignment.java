package homework;

public class week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		PLEASE NOTE: The methods are written at the bottom. This was not obvious to me at first and I made quite a mess. =)
		
		
//		Question 1.
		
		System.out.println("Question 1 (a, b, and c):");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//		a.
		
		int firstMinusLastA = ages[0] - ages[ages.length - 1];
		 
		System.out.println(firstMinusLastA);
		 
//		b.
		 
		ages[ages.length - 1] = 35;
		 
		int firstMinusLastB = ages[0] - ages[ages.length - 1];
		 
		System.out.println(firstMinusLastB);
		 
//		c.
		 
		double sumA = 0;
		 
		for (int elm : ages) {
			 sumA += elm;
		}
		System.out.println(sumA / ages.length);
		
		System.out.println("\nQuestion 2 (a and b):");
		
//		Question 2.
		 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
//		a. 
		
		double sumB = 0;
		 
		for (String str : names) {
			 sumB += str.length();
		}
		 
		System.out.println(sumB / names.length);
		 
//		b.
		
		String allNames = "";
		
		for (String elm : names) {
			allNames += elm + " ";
		} 
		System.out.println(allNames);

//		Question 3.
		
		System.out.println("\nQuestion 3:");
		
		System.out.println("You can show the value of the last index in any array by printing this to the console: "
		+ "anyArray[anyArray.length - 1]");
		 
//		Question 4.
		 
		System.out.println("\nQuestion 4:");
		
		System.out.println("You can show the value of the first index in any array by printing this to the console: "
		+ "anyArray[0]");	
		 
//		Question 5.
		
		System.out.println("\nQuestion 5 (showing the elements of int[] namesLength):");
		 
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			}
		
		for (int elm : nameLengths) {
			System.out.println(elm);
		}

//		Question 6.
		
		System.out.println("\nQuestion 6:");
		
		int sumC = 0;
		
		for (int elm : nameLengths) {
			sumC += elm;
		}
		System.out.println(sumC);
		
//		Question 7.
		
		System.out.println("\nQuestion 7:");
		
		System.out.println(stringRepeat("Alright", 3));
		
//		Question 8.
		
		System.out.println("\nQuestion 8:");
		
		System.out.println(fullName("Matthew", "McConaughey"));
		
//		Question 9.
		
		System.out.println("\nQuestion 9:");
		
		System.out.println(sumGreater100(ages));
		
//		Question 10.
		
		System.out.println("\nQuestion 10:");
		
		double[] doubleArr1 = {5.43, 8.23, 9.43, 15.2, 7.09, 0.32};
		
		System.out.println(averageDouble(doubleArr1));
		
//		Question 11.
		
		System.out.println("\nQuestion 11:");
		
		double[] doubleArr2 = {6.98, 1.45, 2.02, 20.3, 0.09, 0.32};
	
		System.out.println(firstGreaterOrFalse(doubleArr1, doubleArr2));
		
//		Question 12.
		
		System.out.println("\nQuestion 12:");
		
		boolean isHotOutside = true;
		double moneyInPocket = 11.00;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
//		Question 13.
		
		System.out.println("\nQuestion 13:");
		
		double accountBal = 300.00;
		double costOfItem = 125.50;
		
		costCheck(accountBal, costOfItem);

/*		Comments on my method:
 * 		
 * 		I wrote a method that will help a person to see if they can afford an item while still having 
 * 		at least 100 dollars in their bank account. 
 * 		
 * 		It will either return a message telling them they can afford the item and their account balance remaining or 
 * 		it will tell them they can't afford the item at this time.
 */


 
				
	
	
//		Methods below this line.	
	}


	
//		Question 7 Method.
	
		public static String stringRepeat(String word, int n) {
		
		return word.repeat(n);
		}
	
//		Question 8 Method.	
	
		public static String fullName(String firstName, String lastName) {
		
			String fullName = firstName + " " + lastName;
			return fullName;
		}
	
//		Question 9 Method.
	
		public static boolean sumGreater100(int[] arr) {
			int sum = 0;
			
			for (int elm : arr) {
				sum += elm;
			} if (sum > 100) {
				return true;
			}
			return false;
		}
		
//		Question 10 Method.
		
		public static double averageDouble(double[] arr) {
			double sum = 0;
			
			for (double elm : arr) {
				sum += elm;
			}
			return sum / arr.length;
		}
	
//		Question 11 Method.
		
		public static boolean firstGreaterOrFalse(double[] arr1, double[] arr2) {
			double sum1 = 0;
			double sum2 = 0;
			for (double elm1 : arr1) {
				sum1 += elm1;
			}
			for (double elm2 : arr2) {
				sum2 += elm2;
			}
			if ((sum1 / arr1.length) > (sum2 / arr2.length)) {
				return true;
			}
			return false;
		}
		
//		Question 12 Method.
	
		public static boolean willBuyDrink(boolean arg, double num) {
			if (arg == true && num > 10.50) {
				return true;
			} 
			return false;
		}
		
//		Question 13 Method.
		
		public static void costCheck(double num1, double num2) {
			double remains = num1 - num2;
			if (remains >= 100) {
				System.out.println("You can get this item and still have $" + remains + " left in your bank account.");
			} else {
				System.out.println("You can't afford this right now.");
			}
		}

/*		Comments on this method:
 * 		
 * 		I wrote this method that will help a person to see if they can afford an item while still having 
 * 		at least 100 dollars in their bank account. 
 * 		
 * 		It will either return a message telling them they can afford the item and their account balance remaining or 
 * 		it will tell them they can't afford the item at this time.
 */
}
