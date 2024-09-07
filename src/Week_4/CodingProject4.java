package Week_4;

import java.util.*;


public class CodingProject4 {

	public static void main(String[] args) {
		
		//1a.
		//Create a new list of int called ages.
		
		List<Integer> ages = new ArrayList<>();
		
		// add the following values to the list:3, 9, 23, 64, 2, 8, 28, 93
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		
		
		//subtract the first element. subtract the last element without hard coding the index. 
		ages.remove(0);
		ages.remove(ages.size()-1);
		
		//print the result to the console. 		
		
		System.out.println(ages);
		
		//1b.
		//create a new list of int called ages2 with  9 elements.
		//print empty string for readability when printing. 
		System.out.println("");
		
		List<Integer> ages2 = new ArrayList<>();
		
		//Add all existing elements from previous list. 
		ages2.addAll(ages);
		ages2.add(4);
		ages2.add(101);
		ages2.add(6);
		
		ages2.remove(0);
		ages2.remove(ages2.size()-1);
		
		System.out.println(ages2);
		
		//show using index values for elements is dynamic. arrays of different lengths. 
		// will use a for loop to add elements from ages to ages2. 
		
		System.out.println("");
		
		for (int i = 0; i < ages.size(); i++) { 
			ages2.add(ages.get(i));
		}
		
		System.out.println(ages2);
		
		//1c. calculate average of age2 array with a for loop
		int sum = 0;
		for (int i = 0; i < ages2.size(); i ++) {
			sum += ages2.get(i); 
		}
		
		System.out.println("");
		
		System.out.println("Average age is: "+sum/ ages2.size());
		
		//2. Create an array of String called names with values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
			
		List<String> names = new ArrayList<>();
			names.add("Sam");
			names.add("Tommy");
			names.add("Tim");
			names.add("Sally");
			names.add("Buck");
			names.add("Bob");
			
			int sum1 = 0;
			
			//2.a Loop through the array to calculate the average letters per name.
			
			for (String name : names) {
				
				sum1 += name.length();
			}
			
			System.out.println("Average letters per name: "+ sum1 / names.size());
			
			//2.b Loop through to concatenate all the names together separated by spaces. 
					
			for (String conName : names) {
				System.out.print(conName+ " ");
							
			}
			
		//3. Access the element of the last array use .getLast() method. 
			
			
			System.out.println(names.getLast());
	
			
		//4. Access the first element of any array;
			
			System.out.println(names.get(0));
			
		//5. New int array called nameLengths. Loop over names array and add the length to nameLength array.
			
			ArrayList<Integer> nameLengths = new ArrayList<>();
			
			for (String string : names) {
				nameLengths.add(string.length());
			}
			
			System.out.println(nameLengths);
			
		//6. calculate sum of all elements in the nameLengths array.
			
			int arraySum = 0;
			
			for (Integer num : nameLengths) {
				arraySum += num;
			}
			
			System.out.println(arraySum);
			
			
		//7. write a method to concatenate a word n times.
			
			int n = 3;
			
			String word = "Hello";
			
			System.out.println(combineWord(n,word));
			
		//8. write a method to return full name. 
								
			String firstStr = "Chris";
			String lastStr = "Richardson";
			
			System.out.println(nameFirstLast(firstStr,lastStr));
			
			
		//9. write a method for an array of int to return true if sum of array is > 100.
			
			System.out.println(calculateNumbers(ages2));
			
		//10. get array average. 
			
			System.out.println(averageAmounts(ages));

		
		//.11 2 arrays of double with boolean avg elements. 	
			List<Double> numList1 = new ArrayList<>();
			numList1.add(1.0);
			numList1.add(1.0);
			numList1.add(1.0);
			numList1.add(6.5);
			
			List<Double> numList2 = new ArrayList<>();
			numList2.add(3.0);
			numList2.add(4.0);
			numList2.add(6.0);
			numList2.add(9.0);
		
			System.out.println(averageElements(numList1, numList2));
			
		
		//12. write  method called willBuyDrink boolean isHotOutside and double moneyInPocket. 	
			double temp = 80;
			boolean itsHot;
			double cash = 20.00;
			
			if (temp > 79.99 ) {
				itsHot = true;
				
			} else {
				itsHot = false;
			}
			System.out.println(willBuyDrink(itsHot,cash));
			
		//13. This method solves the problem of what to eat when you don't know what you want. it'll decide for you. 
			
			
			
			
			
			
			
			
			
}
	//Methods
	
	//13. This method solves the problem of what to eat when you don't know what you want. it'll decide for you.
	
	public static String whatToEat( int n, List<String> foodCategories) {
		
		return "Yes";
	}
	
	
	
	//7. Method to concatenate word.
	
	public static String combineWord(int n, String word) {
		
		String result= "";
		
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	//8. method takes 2 strings and concatenates them with a space between. 
	
	public static String nameFirstLast(String firstStr, String lastStr) {
		String results= firstStr+ " " +lastStr;
		return results;
	}
	//9. List of int as a boolean. 
	//Started off by doing a List of Integer but didn't work and switched to boolean using the suggestion from the system and worked. 	
	public static boolean calculateNumbers(List<Integer> numList) {
		int totalSum = 0;
		
		for ( int i = 0; i < numList.size(); i ++)  {
			totalSum += numList.get(i);
		}
		if (totalSum > 100) {
			return true;
		}else {
			return false;
	}
		
	}
	
	//10. method double list is integer array. for loop each num in arraySum accumulates to variable newSumList. divide by array size to get average. 
	
		public static double averageAmounts(List<Integer> arraySum) {
			
			double	newSumList = 0;
			
			for (int num : arraySum) {
			
			newSumList += num;
			
			}
			
			return newSumList / arraySum.size();			
		}
	//11. method that takes 2 arrays of double and returns true if avg elements first array> avg second array. 
		public static boolean averageElements(List<Double> arrayAVG1, List<Double> arrayAVG2) {
			double newSumAVG1 = 0;
			double newSumAVG2 = 0;
			boolean result;
			
			for (double num : arrayAVG1) {
				newSumAVG1 += num;
			}
			
			for (double num : arrayAVG2) {
				newSumAVG2 += num;
			}
			
			if (newSumAVG1/arrayAVG1.size() > newSumAVG2/arrayAVG2.size()) {
				result = true;
			}else {
				result = false;
			}
			
			return result;
		}
		
		
	//12. method it's hot in here. 
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				
			boolean result;
			
			
			if (isHotOutside && moneyInPocket > 10.50) {
				result= true;
			} else {
				result = false;
			}
			
			return result;
		}
	
		
	
	}