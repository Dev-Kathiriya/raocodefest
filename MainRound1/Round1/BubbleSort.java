import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt(),min,temp;
		int a[]=new int[size];
		for (int i=0;i<size ;i++ ) {
			a[i]=scan.nextInt();
		}
		min=a[0];
		for (int i=1;i<size ;i++ ) {
			if(min>a[i]){
				temp=min;
				min=a[i];
				a[i]=min;
				a[i-1]=min;
			}
		}
		for (int i=0;i<size ;i++ )
			System.out.print(a[i]+" ");
	}
}