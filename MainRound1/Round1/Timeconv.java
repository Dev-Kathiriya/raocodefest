import java.util.Scanner;
class Timeconv{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine(),str1;
		int time[]= new int[3];
		for (int i=0,n=0;i<3 ;i++,n++ ) {
			str1=str.charAt(n)+str.charAt(n+1);
			time[i]=Integer.parseInt(str1);
			n++;
		}
		if((str.charAt(8))="P"){
			time[0]+=12;
		}
		if(time[0]>=48)
			time[0]-=48;
		System.out.println(time[0]+":"+time[1]+":"+time[3]);
	}
}