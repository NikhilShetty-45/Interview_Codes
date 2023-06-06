package programme;

public class Pyramid {
	public static void main(String[] args)	
	{
		int n =11;
		int space=n-1;
		int star = 1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			space--;
			star++;
		}
		int sstar=n-1;
		int sspace=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sspace;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<sstar;j++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
			sspace++;
			sstar--;
		}
		
	}

}
