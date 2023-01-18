
public class valueappears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNumber = { 1, 2, 15, 20, 15, 30, 20, 15, 15};
		int value = 15;
		System.out.println("Number "+value);
	
	
		System.out.print("Apears: ");
		
		appearsNo(arrNumber,value);
	}
	

	public static void appearsNo(int[] Numbers, int value) {
		int counter = 0;
		for (int i = 0; i < Numbers.length; i++) {
			if (Numbers[i] == value && value > 10) {
				counter++;
			}
		}System.out.print(counter + " Times");
	}

}
