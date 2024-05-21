package chap99_homework.myself06.advance;

public class PrintStudentRank {
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr, int index) {
		// 학과별로 새로운 배열 생성
		MathStudent[] mathStudentArr = new MathStudent[1000];
		EngStudent[] engStudentArr = new EngStudent[1000];
		ComStudent[] comStudentArr = new ComStudent[1000];
		
		// 수학, 영어, 컴공에 대응하는 인덱스
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		
		for(int i = 0 ; i < index ; i++) {
			if(stArr[i].getMajor().equals("수학")) {
				mathStudentArr[idx1] = (MathStudent)stArr[i];
				idx1++;
			}
			if(stArr[i].getMajor().equals("영어")) {
				engStudentArr[idx2] = (EngStudent)stArr[i];
				idx2++;
			}
			if(stArr[i].getMajor().equals("컴공")) {
				comStudentArr[idx3] = (ComStudent)stArr[i];
				idx3++;
			}
		
		}
		
		// 성적순으로 출력
		printRankArray(mathStudentArr, engStudentArr, comStudentArr);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {		
		
		System.out.println(major + "과의 성적순 발표");
		for(int i = 0 ; i < stArr.length - 1 ; i++) {
				for(int j = i + 1 ; j< stArr.length ; j++) {
					if(stArr[i] != null && stArr[j] != null) {
						if(stArr[j].getAvg() > stArr[i].getAvg()) {
							Stdent
						}
					}
				
				
				
				
				
			}
		}
		
		
		
	}	
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr,
			EngStudent[] engStudentArr, ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
	
}
