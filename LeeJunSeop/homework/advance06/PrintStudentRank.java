package homework.advance06;

public class PrintStudentRank {
	// 학과별 배열을 만들어주는 메소드
	public void makeMajorArr(Student[] stArr, int index) {
		// 학과별로 새로운 배열 생성
		MathStudent[] mathStudentArr = null; 
		EngStudent[] engStudentArr = null; 
		ComStudent[] comStudentArr = null;
		
		int mathStuCnt = 0;
		int engStuCnt = 0;
		int comStuCnt = 0;
		
		for(Student student : stArr) {
			if(student != null) {
				if(student.getClass().getSimpleName().equals("MathStudent")) mathStuCnt++;
				else if(student.getClass().getSimpleName().equals("EngStudent")) engStuCnt++;
				else if(student.getClass().getSimpleName().equals("ComStudent")) comStuCnt++;
				else continue;
			}
		}
		
		mathStudentArr = new MathStudent[mathStuCnt];
		engStudentArr = new EngStudent[engStuCnt];
		comStudentArr = new ComStudent[comStuCnt];
		
		int mathIdx = 0;
		int engIdx = 0;
		int comIdx = 0;
		
		for(Student student : stArr) {
			if(student.getClass().getSimpleName().equals("MathStudent"))
				mathStudentArr[mathIdx++] = (MathStudent)student;
			else if(student.getClass().getSimpleName().equals("EngStudent")) 
				engStudentArr[engIdx++] = (EngStudent)student;
			else if(student.getClass().getSimpleName().equals("ComStudent")) 
				comStudentArr[comIdx++] = (ComStudent)student;
			else continue;
		}
		
		
		// 성적순으로 출력
		printRankArray(mathStudentArr, engStudentArr, 
				comStudentArr/* 위에서 생성한 세 개의 배열 매개변수로 전달 */);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		Student[] tempStudentArr = stArr.clone();
		double[] majorRankArr = new double[tempStudentArr.length];
		
		System.out.println(major +" 학과의 성적 순 정렬");
		
		// 평균 성적 구하기
		for(int i = 0; i < majorRankArr.length; ++i) {
			majorRankArr[i] = stArr[i].getAvg();
		}
		
		// 성적 순으로 정렬
		for(int i = 0; i < majorRankArr.length; ++i) {
			for(int j = i + 1; j < majorRankArr.length; ++j) {
				// 내림차순 정렬
				if(majorRankArr[i] > majorRankArr[j]) {
					double tempAvg;
					Student tempStudent;
					
					// 평균 정렬
					tempAvg = majorRankArr[i];
					majorRankArr[i] = majorRankArr[j];
					majorRankArr[j] = tempAvg;
					
					// 학생 정렬
					tempStudent = tempStudentArr[i];
					tempStudentArr[i] = tempStudentArr[j];
					tempStudentArr[j] = tempStudent;
				
				}
			}
		}
		
		// 성적순으로 출력
		for(int i = 0; i < majorRankArr.length; ++i) {
			System.out.println(i+1+"등 : ");
			tempStudentArr[i].printInfo();
		}
		
		System.out.println("----------------------------");
		
	}
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr, EngStudent[] engStudentArr, 
			ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
}
