package day_01;

import java.util.Scanner;

public class DataType_01 {
	public static void main(String[] args) {
		// void : return되는 타입이 없음을 의미 / 아무것도 리턴하지 않음을 선언해주는 것과 같다.
		
// 단축키모음: 
// 메서드 자동완성: ctrl + space
// 자동메인체크:    alt + v
// 자동import:   ctrl + shift + o
// 한줄삭제:		ctrl + D
			 
		// 출력메서드
		// print : 개행문자 출력 x / 
		System.out.print("문자열값"); //문자열
		System.out.print("A"); // 문자형
		System.out.print("100"); //정수형
		System.out.print("3.14"); //실수형
		
		//printf(print format) : 가변 o (소수점 변경) 
		System.out.printf("%s", "문자열값");
		System.out.printf("%c", 'A'); // 쌍따옴표하면 오류
		System.out.printf("%d", 100); // 10진수
		System.out.printf("%f", 3.14);
		// System.out.printf("%o", 15); 8진수 정수
		// System.out.printf("%x", 15); 16진수 정수 (소문자 출력)
		// System.out.printf("%X", 15); 16진수 정수 (대문자 출력)
		// System.out.printf("%b", --); boolean 형식 출력
		// %e : 지수표현식형식으로 출력
		// %- : 출력할 전체자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
		// %0 : 출력할 전체 자리수가 지정된 경우 왼쪽에 남는자리에 0을 채워 출력한다.
		// %n : 출력할 전체 자리수
		// % .m: 소수점 아래 자릿수, 잘리는 자리에서 반올림 시켜 출력한다.
		
		// println(print line) : 마지막 줄바꿈문자를 추가 / 가변 x(소수점 변경 등) / 
		// 큰따옴표가 없으면 모두 변수명으로 기억한다. / 문자열+변수명 의 형식으로 사용
		System.out.println("문자열값"); //문자열
		System.out.println("A"); // 문자형
		System.out.println("100"); //정수형
		System.out.println("3.14"); //실수형
//---------------------------------------------------------------------------------------		
		// 변수
		// 정수형 변수 
		int i = 100;
		// 실수형 변수
		float f=3.14f;
		double d= 3.14;
		// 문자형 변수
		char c = 'c';
		// 문자열 변수
		String s = "hello";
		// 논리형 변수
		boolean b= true;
		
		System.out.println(i);
		System.out.println(f); 
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);

// 변수가 저장되는 공간의 특성
// 정수형: byte- 1byte / short-2byte / int- 4byte / long- 8byte
//		int num = 1234; // 1234가 4개 = 4byte
//		long number=123456789; // 
	
// 문자형: char- 2byte
//		char ch='A'; // 문자형의 경우 내부적으로 정수값으로 작성되어 있어 char변환시켜 출력. 
		
// 실수형: float- 4byte / double- 8byte
//		double dNum = 3.14;
//		float fNum = 3.14F; // double형 처럼 쓰면 오류뜸. 뒤에 f반드시 붙여야함!
		
// 논리형: boolean- 1byte
			
}}
