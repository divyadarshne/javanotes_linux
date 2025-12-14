public class Static{
	public static void main (String[] args){
		Friends friend1 = new Friends("sathya");
		System.out.println(friend1.name);
		System.out.println(friend1.numoffriends);
		System.out.println(friend1.nof);

		Friends friend2 = new Friends("Ramya");
		System.out.println(friend2.name);
                System.out.println(friend2.numoffriends);
                System.out.println(friend2.nof);
	}
}

class Friends{
	String name;
	int numoffriends;
	static int nof;

	Friends(String name){
		this.name=name;
		numoffriends++;
		nof++;
	}
}
      
