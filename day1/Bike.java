package week1.day1;

public class Bike {
	public void safeRide() {
		System.out.println("have a safe ride");
	}
public static void main(String[]args) {
	Car options=new Car();

	options.applyBrake();
	options.soundHorn();
	Bike riding=new Bike();
	riding.safeRide();
}
}
