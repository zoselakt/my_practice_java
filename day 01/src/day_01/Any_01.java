package day_01;

public class Any_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}}

// 접근제한자 클래스선언 Any_01(클래스명) {
//	접근제한자 static 반환타입 (메인)메서드(파라미터 = (문자열 [배열] 변수명) {
// }}

//1. 접근제한자 : public, private, protected, default
//			   public : 어떤 클래스에서도 접근이 가능할 수있도록 열어 놓는다는 의미.
//			   public메소드를 통해 private 멤버에 접근할 수 있다. public과 private사이 인터페이스 역할을 수행하기도 함.
//2. 파라미터 : 메서드(함수) 호출시 파라미터 값을 넣어서 호출할 수 있음. / String 값으로[]안에 인수들값을 받는다.
//			 args는 argument로 컴퓨터 쪽 용어로 인수, 독립변수의 뜻을 가지고 있음. 
//3. 반환타입(리턴타입) : 반환할 값이 있다 없다 → 없으면 void / 특별한 반환값이 없이 작동만 수행시키기위하여 사용
//4. static: static 선언된 함수(메서드)나 변수는 인스턴스 객체의 생성없이 호출을 할 수 있다.
// 			 클래스 (메서드) : 공장 / 인스턴스(객체) : 객체 / 
//			 static으로 지정된 메서드가 여러개인 경우 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
//			 그 후, main 으로 만들어진 메서드를 찾아서 그 메서드를 가장먼저 호출한다.
//5. void: 

//------------------------------------------------------------------------------------
// 객체 : 프로그램의 대상, 생성된 인스턴스
// 클래스: 객체를 코드로 만든상태
// 인스턴스: 클래스가 메모리에 생성된 상태
// 멤버변수: 클래스의 속성, 특성
// 메서드: 멤버변수를 이용하여 특정한 동작이나 작업, 클래스의 기능을 구현하는것
// 참조변수: 메모리에 생성된 인스턴스를 가리키는 변수
// 참조 값: 생성된 인스턴스의 메모리 주소값
//------------------------------------------------------------------------------------
/*
- 각 타입의 비트 크기
System.out.println(Byte.BYTES); //바이트 계산 
System.out.println(Byte.SIZE); // 비트계산
System.out.println((Short.BYTES) +" " +(Short.SIZE));
System.out.println("byte" + Byte.BYTES +"(바이트)"+ "-->" + Byte.SIZE + "(비트)" + Byte.MIN_VALUE+ "~" +Byte.MAX_VALUE);
System.out.println("Short" + Short.BYTES +"(바이트)"+ "-->" + Short.SIZE + "(비트)" + Short.MIN_VALUE+ "~" +Short.MAX_VALUE);
System.out.println("Int" + Integer.BYTES +"(바이트)"+ "-->" + Integer.SIZE + "(비트)" + Integer.MIN_VALUE+ "~" +Integer.MAX_VALUE);
System.out.println("Long" + Long.BYTES +"(바이트)"+ "-->" + Long.SIZE + "(비트)" + Long.MIN_VALUE+ "~" +Long.MAX_VALUE);
System.out.println("Char" + Character.BYTES +"(바이트)"+ "-->" + Character.SIZE + "(비트)" + (int)Character.MIN_VALUE+ "~" +(int)Character.MAX_VALUE);
*/
//------------------------------------------------------------------------------------

