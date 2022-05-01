import java.util.Scanner;

public class Fibonaci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,n,k=0,temp;

		System.out.print("enter a num");
		n= sc.nextInt();
		

		

		for(int i=0;k<6;i++){
			if(a>=n){

			System.out.print(a+" ");
			k++;
			}
			temp = b;
			b=a+b;
			a=temp;
		}



	}
}