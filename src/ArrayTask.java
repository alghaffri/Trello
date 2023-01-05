
public class ArrayTask {

	public static void main(String[] args) {
		String[] arraynames = { "Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab",
				"Abdullah" };
		
		
		for (int i = 0; i < arraynames.length; i++) {
			System.out.println(" Name : " +   arraynames[i]);
		}
		
		
		for (int i = 0; i < arraynames.length; i++) {
			int count = 1;
			
			for (int j = i + 1; j < arraynames.length; j++) {
				if (arraynames[i].equals(arraynames[j])) {
					count++;
				}
				
				
			}
			
			if (count > 1) {
				System.out.println("Name :" + arraynames[i] + " repeated " + count + " times.");
			}
		}

	}
}