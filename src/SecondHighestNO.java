import java.util.Arrays;

public class SecondHighestNO {

		public static void main(String [] args) {

		int array[] = { 40,82,54,74,70,45,90,47,60,71};
		
		int Lenght = array.length;
		
		Arrays.sort(array);
		
		System.out.println(" The Second Largest Number is: " + array[Lenght-2]);

			}
		}
