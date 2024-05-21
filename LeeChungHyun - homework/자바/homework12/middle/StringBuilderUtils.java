package chap99_homework.myself12;
@FunctionalInterface
public interface StringBuilderUtils {
//	1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
//	StringBuilderUtils 함수형 인터페이스 선언, StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 
//	추상메소드 선언
	StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2);
}
