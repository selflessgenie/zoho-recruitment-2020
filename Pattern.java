import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		
		StringBuilder result = new StringBuilder();
		result.append(str.charAt(len/2));
		
		int i = (len/2)+1;
		
		while(i != (len/2))
		{
			if(i >= len)
				i = 0;
			int space = len - result.length();
			for(int x = 0 ; x < space ; x++)
				System.out.printf(" ");
			System.out.println(result);
			
			result.append(str.charAt(i));
			i++;
		}
		
		
		int space = len - result.length();
		for(int x = 0 ; x < space ; x++)
			System.out.printf(" ");
		System.out.println(result);
		
		sc.close();
		
	}
}
