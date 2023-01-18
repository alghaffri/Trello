import java.util.Scanner;
import java.util.Stack;

public class stackTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       Stack<Integer> st = new Stack<>();
       System.out.print("First Number : ");
       st.push(sc.nextInt());
       System.out.print("second Number : ");
       st.push(sc.nextInt());
       System.out.print("third Number : ");
       st.push(sc.nextInt());
       System.out.print("fourth Number : ");
       st.push(sc.nextInt());
       System.out.print("fifth Number : ");
       st.push(sc.nextInt());
       System.out.print("sixth Number : ");
       st.push(sc.nextInt());
       System.out.println(" The Numbers are  : ");
       for(Integer num: st) {
    	   System.out.println(num+"");
       }

	}

}
