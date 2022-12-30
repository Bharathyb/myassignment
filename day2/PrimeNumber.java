package week2.day2;

public class PrimeNumber {
	public static void main(String[]args) {
		int input=13;
		boolean value=false;
		for(int i=2;i<input/2;i++) {if(input%i==0) {value=true;
		break;
		}
		}if(!value)
		{
			System.out.println(input+"is a prime number");
			
		}else {
			System.out.println(input+"is not a prime number");
			
		}
	}

}
