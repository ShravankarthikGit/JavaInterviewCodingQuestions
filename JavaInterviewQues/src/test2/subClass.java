package test2;

class Car extends Vehicle {
	protected int numberOfSeats = 0;

	//constructor which sets value to variable 'numberOfSeats'
	public Car(int i_NumberOfSeats) {
		super();
		// perform other initialization here
		numberOfSeats = i_NumberOfSeats;
	}
	public void setLicensePlate(String license) {
		//this will set value from super class
		super.setLicensePlate(license);
	}
	public String toString() {
		return "The car has " + numberOfSeats + " seats. Its license is " + licensePlate;
	}
/*	public int getNumberOfSeats() {
		return numberOfSeats;
	}*/
}