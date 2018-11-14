package test2;

class SportsCar extends Car {
	double maxSpeed = 0;
	//constructor to set values
	public SportsCar(int i_NumberOfSeats, double d_MaxSpeed) {
		super(i_NumberOfSeats);
		// perform other initialization here
		maxSpeed = d_MaxSpeed;
	}

	@Override
	public void setLicensePlate(String license) {
		this.licensePlate = license.toLowerCase();
	}

	@Override
	public String toString() {
		return super.toString() + ". Its max speed is " + maxSpeed;
	}
	
}