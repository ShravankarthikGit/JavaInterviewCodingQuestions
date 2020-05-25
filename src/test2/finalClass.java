package test2;

//This class tests the above classes
public class finalClass {
	public static void main(String args[]) {
		Car personalCar = new Car(4);
		personalCar.setLicensePlate("PERSONAL-BN123");
		System.out.println(personalCar);
		
		
		SportsCar sportsTeam = new SportsCar(2, 200);
		sportsTeam.setLicensePlate("SPORTS-AB989");
		
		
		System.out.println(sportsTeam);
	}
}