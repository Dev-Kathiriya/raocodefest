import java.util.Scanner;

public class Round2Disha{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,no=1;

		x=sc.nextInt();
		

		for(int i=x;i>0;i--){
			int temp=x;
			no =1;

			for(temp=i;temp>0;temp--){
				no = no*temp;
			}

			if((no%3)==0)
				System.out.println(x+"! = "+no);
			if((no%5)==0)
				System.out.println(x+"! = "+no);

		}


	}
}