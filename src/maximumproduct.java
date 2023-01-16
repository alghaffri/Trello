import java.util.Arrays;

public class maximumproduct {

	public static void main(String[] args) {
		 int[] numbers = { 1, 5, 3, 6, 2, 4 };
		
		 Arrays.sort(numbers);
		 System.out.print("The largest 4 numbers are : ");
		 System.out.print(numbers[numbers.length-1] + " ");
		 System.out.print(numbers[numbers.length-2] + " ");
		 System.out.print(numbers[numbers.length-3] +" ");
		 System.out.print(numbers[numbers.length-4] +" ");
		 System.out.println("");
		System.out.println("The maximum Product "+MaxProdect(numbers));
		
	}
			public static int MaxProdect(int[] numbers) {
		 int total = 1;
		 for (int i =2; i< numbers.length; i++) {
		 total = total * numbers[i];
		 }
		 return total;
			}
		}