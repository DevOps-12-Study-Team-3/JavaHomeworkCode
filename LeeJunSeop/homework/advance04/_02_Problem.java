package homework.advance04;

public class _02_Problem {
	public static void main(String[] args) {
		Employee employ = new FullTimeWorker(1, "김유신", 10000, 1, 10000);
		employ.showEmployeeInfo();
		
		employ = new ContractWorker(2, "강감찬", 10000, 2, 30);
		employ.showEmployeeInfo();
		
		employ = new TemporaryWorker(3, "정약용", 10000, 3, 1);
		employ.showEmployeeInfo();
		
		
		
	}
}
