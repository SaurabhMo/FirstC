package pkg;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Number=1238;
 int rev = 0;
 int remainder;
 while(Number>0) {
	 remainder=Number%10;
	 rev=(rev*10)+remainder;
	 
	 Number=Number/10;
 }
 System.out.println(rev);
	}


}
