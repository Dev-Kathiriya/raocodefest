import java.util.Scanner;
class Round2Dev{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int x=str.length()-1,y=0;
		String str2="";
		while(x>=0){
			str2+=str.charAt(x);
			x--;
			y++;
		}
		if(str.equals(str2))
			System.out.println("Given String is Palindrom");
		else
			System.out.println("Given String is not Palindrom");

	}
}