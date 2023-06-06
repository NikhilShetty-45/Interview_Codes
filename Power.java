package programme;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int ans =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		System.out.println("Enter The Power");
		int pow = sc.nextInt();
		for(int i =0;i<pow;i++)
		{
			ans = ans *n;
		}
		System.out.println("Answer is "+ans);
	}

}
