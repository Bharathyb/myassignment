package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="redmi";
		float mobileWeight=500.34f;
		System.out.println("mobile model:"+mobileModel);
		System.out.println("mobile weight:"+mobileWeight);
		
		
	}
	public void sendMsg() {
		int mobilecost=10000;
		boolean fullycharged=true;
		System.out.println("fullycharged:"+fullycharged);
		System.out.println("mobileCost:"+mobilecost);
	} public static void main(String[]args) {
		Mobile operations=new Mobile();
		operations.makeCall();
		operations.sendMsg();
	}

}
