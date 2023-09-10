package pkg;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Number=1238;
int temp=Number;
 int rev = 0;
 int remainder;
 while(Number>0) {
	 remainder=Number%10;
	 rev=(rev*10)+remainder;
	 
	 Number=Number/10;
 }
if(temp==rev) {
	System.out.println("is palindrome");
}else
{
	System.out.println("Not a palindrome Number");
}
	}


}