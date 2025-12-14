package package1;

public class Afile{
	public int publi = 1;
	protected int protec = 2;
	int defau = 3;  //default
	private int privat = 4;
	
	public void showA() {
		System.out.println ("public is available: "+publi);
		System.out.println ("protected is available: "+protec);
	        System.out.println ("default is available: "+ defau );
		System.out.println ("private is available: "+privat);
	}
}
