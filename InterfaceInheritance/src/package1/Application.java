package package1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep myJeep = new Jeep();
		
		myJeep.setName("my Jeep");
		myJeep.setMaxPassengers(4);
		myJeep.setNumWheels(4);
		myJeep.setMaxSpeed(389);
		
		System.out.println(myJeep.getName() + " can holds up to " + myJeep.getMaxPassengers() + " passengers.");
		System.out.println("It has " + myJeep.getNumWheels() + " wheels.");
		System.out.println("And it can go up to " + myJeep.getMaxSpeed()+ " km/hours.");
		myJeep.soundHorn();
	}

}
