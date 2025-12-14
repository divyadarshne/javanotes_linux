public class Car{
	private String make;
	private String model;
	private int year;

	Car(String make, String model, int year){
		this.make =make;
		this.model= model;
		this.year=year;

	}
	public String getMake(){ //getter method is to display or retun the data which has private access modifier.
		return make;
	}

	public String getModel(){
		return model;
	}

	//public int getYear(){
	//	return year;
	//}

	public void setMake(String model){  // this is setter method to change the data in the private variable.
		this.model=model;
	}
	public void setYear(int year){
		this.year=year;
	}


}



class main{
	public static void main(String[]args){

		Car carobj = new Car("mitsubishi","Eclipse Cross", 2021);
		System.out.println(carobj.getMake());
		System.out.println(carobj.getModel());
	       // system.out.println(carobj.model)); //this wont work because getter method is not created and it has a private access modifier.

	}
}

