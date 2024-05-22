package homework.homework04.basic;

public class basic_main {

	public static void main(String[] args) {
		
		// #############################
		
		// [ 1번문제 ]
		  
		Mammal animal = new Cat();
		
		animal.run();
		animal.jump();
		animal.sleep();
		

		
		animal = new Lion();
		
		animal.run();
		animal.jump();
		animal.sleep();	
		
		
		animal = new Tiger();
		
		animal.run();
		animal.jump();
		animal.sleep();	
		
		System.out.println( "\n=============\n" );
		
		// #############################
		
		// [ 2번 문제 ]
		 
		Parent parent = new ChildA(  );
		
		parent.name("홍길동");
		parent.type();
		parent.Skin();
	
		System.out.println( "\n=============\n" );
		
		parent = new ChildB(  );
		
		parent.name("전우치");
		parent.type();
		parent.Skin();
		
		System.out.println( "\n=============\n" );
		
		
		// #############################
		
		// [ 3번문제 ]
		
		
		Workingpeople Workingpeople = new Developer() ;
		
		Workingpeople.attendance();

		Workingpeople.work();
		
		Workingpeople.leavework();
		
		System.out.println( "\n=============\n" );
		
		Workingpeople = new public_official() ;
		
		Workingpeople.attendance();

		Workingpeople.work();
		
		Workingpeople.leavework();	
		
		System.out.println( "\n=============\n" );
		
		// #############################
		
		
	}

}
