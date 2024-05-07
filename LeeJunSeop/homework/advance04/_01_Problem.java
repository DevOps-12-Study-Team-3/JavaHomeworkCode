package homework.advance04;

public class _01_Problem {

	public static void main(String[] args) {
		int[] s1 = {1,2,3,4,5,5,4,3,2,1};
		int[] s2 = {1,3,5};
		System.out.println("concat");
		for(int num : ArrayUtility2.concat(s1, s2)) {
			System.out.print(num +" ");
		}
		System.out.println();
		System.out.println("=========================");
		
		System.out.println("remove");
		for(int num : ArrayUtility2.remove(s1, s2)) {
			System.out.print(num +" ");
		}
		System.out.println();
	}
}
