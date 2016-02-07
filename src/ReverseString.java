import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = new String();
		char []revSt = new char[100];
		System.out.println("Enter String");

		st = sc.nextLine();
		
		for(int i = 0; i < st.length(); i++)
		{
			revSt[i] = (st.charAt((st.length()-1) - i));
		}
		
		System.out.println("Reversed String");
		System.out.println(revSt);
		sc.close();
	}

}
