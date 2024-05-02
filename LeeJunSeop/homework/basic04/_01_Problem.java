package homework.basic04;

public class _01_Problem {

	public static void main(String[] args) {

		System.out.println("===포유류===");
		Mammal mammal = new Mammal();
		
		mammal.feed();
		mammal.bear();
		
		System.out.println("===고양이과===");
		Felidae felidae = new Felidae();
		felidae.feed();
		felidae.bear();
		felidae.eatMeat();
		felidae.claw();

		System.out.println("===호랑이===");
		Tiger tiger = new Tiger();
		tiger.feed();
		tiger.bear();
		tiger.eatMeat();
		tiger.claw();
		tiger.swim();
		tiger.climbTree();
		
		System.out.println("===사자===");
		Lion lion = new Lion();
		lion.feed();
		lion.bear();
		lion.eatMeat();
		lion.claw();
		lion.haveMane();
		lion.formGroup();
		
	}

}
