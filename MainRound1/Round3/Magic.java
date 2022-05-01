import java.util.Scanner;
public class Magic{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[4][4];
		int b[][]= new int[4][4];
		int temp=1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j]=temp;
				b[j][i]=temp;
				temp++;
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

		int x=sc.nextInt();

		System.out.println();

		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
			
		}

		int y=sc.nextInt();
		System.out.println(a[x-1][y-1]);


		
	}
}