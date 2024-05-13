package pattens;



public class main1 
{
	public static void main(String[] args)
	{
		int num = 7;
		for (int i = 1;i<=num;i++)
		{
			for(int j = 1;j<=num;j++)
			{
				if((i==1&&j!=num) ||( i==num&&j!=num)||j==2||(j==num&&i!=1&&i!=num))
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
			
		}
	}


