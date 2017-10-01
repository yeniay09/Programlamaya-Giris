import java.util.Scanner;

public class SolucanDongu 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		System.out.print("Sayı Giriniz : ");
		Scanner sayioku=new Scanner(System.in);
		int okunansayi=sayioku.nextInt();
		int x=0;
		int y=-1;
		int yazilan=1;
		int dx=okunansayi,dy=okunansayi,xy=0,ds=0;
		int[][] dizi=new int[okunansayi][okunansayi];
		while(yazilan<=okunansayi*okunansayi)
		{
			if(xy==0)
			{
				y++;
				if(y==dy-1)
				{
					xy=1;
					dy--;
				}
			}
			else if(xy==1)
			{
				x++;
				if(x==dx-1)
				{
					xy=2;
					dx--;
				}
			}
			else if(xy==2)
			{
				y--;
				if(y==ds)
				{
					xy=3;
					ds++;
					
				}
			}
			else if(xy==3)
			{
				x--;
				if(x==ds)
				{
					xy=0;
				}
			}
			dizi[x][y]=yazilan;
			yazilan++;

		}
		for (int i = 0; i <okunansayi ; i++) 
		{
			for (int j = 0; j < okunansayi; j++) 
			{
				System.out.print(dizi[i][j]);
				if(dizi[i][j]<10)
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

}
