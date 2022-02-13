package day_01;

/*
 * 날짜 : 2022. 02. 11.
 * 내용 : 모든내용
 * 
 * */

public class Any_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}}
// 클래스
//
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
//			각 멤버변수는 각자의 저장공간을가지지만 static변수는 공유하기 위해서 사용한다.
// 			 클래스 (메서드) : 공장 / 인스턴스(객체) : 객체 / 
//			 static으로 지정된 메서드가 여러개인 경우 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
//			 그 후, main 으로 만들어진 메서드를 찾아서 그 메서드를 가장먼저 호출한다.
//			 최초에 한번만 생성되고 모든 객체에서 공유해서사용한다.
//5. void : return되는 타입이 없음을 의미 / 아무것도 리턴하지 않음을 선언해주는 것과 같다.
//			void를 선언한 후 값을 빼내지않고 결과값을 얻고자할때 선언하고 void문 밖에서 결과값을 얻고자할때는 
//			자료형(int, string)을 사용한다. 

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
접근권한 지정자
private: 현재 클래스 외부에서 접근할수 없다. 상속 불가능 / 자식이 상속받을 수없다.
protected: 현재클래스와 현재 클래스를 상속받은 자식클래스만 접근가능, 상속 가능
package: 현재 패키지에서는 public처럼 사용되고 다른패키지에서는 private처럼 사용된다. 상속가능 접근권한을 생략하면 package가 된다.
public: 아무곳에서나 자유롭게 사용할 수 있다. 상속가능 
 */
//------------------------------------------------------------------------------------
/*
생성자(constructor) : Class1 class = new Class1();
인스턴스 객체를 생성할떄 호출 / 생성자 이름은 해당 클래스명과 동일하게 설정
메소드와 비슷하나 생성자 앞에는 접근제어자(public)만 올수있다 (static X불가) 
반환타입이 없으므로 return이나 void를 붙일수 없다.  
생성자를 선언하지 않으면 기본생성자를 기본으로 만들어준다. 하지만 생성자 선언하면 자동으로 생성되지 않는다.
객체가 생성될때 자동으로 실행되며 멤버변수를 초기화할때 사용한다. (멤버변수를 초기화할 목적으로 사용)

기본생성자 : 구현부 - 클래스명() {} / 호출부 - new 클래스명();
매개변수생성자 : 구현부 - 클래스명(자료형 변수명...) {} / 호출부 - new 클래스명(값);
*/ 
//------------------------------------------------------------------------------------
// VO(value object) 클래스: 처리할 데이터 한 건과 데이터를 처리하는 메소드을 기억하는 클래스 DTO(data trasfer object)
// bean : 데이터를 저장할 멤버변수(필드)와 멤버 변수에 데이터를 입출력할 수있는 getter & setter 메소드로만 구성된 클래스
// 초기화하지 않은 숫자- 0 / 문자- 공백 / boolean- false/ 클래스로 만든 모든 멤버변수- null

// getter는 private 권한을 가지는 멤버변수의 값을 얻어올때 사용한다.
// setter는 private 권한을 가지는 멤버변수의 값을 수정할때 사용한다.
//------------------------------------------------------------------------------------
//this
//생성된 인스턴스 스스로를 가리키는 예약어.
//같은 클래스내 같은 이름을 사용하는 지역 변수와 멤버변수가 있을 경우 지역변수에 우선권을 준다.
//그래서 this를 생략하게 되면 파라미터() 로 사용되는 변수로 인식한다.
//static메소드에서는 사용할 수 없다.

//this()
//생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자를 호출할때 사용한다.
//this와 this()는 다른 개념.
//생성자가 중복되어있을때 또 다른 생성자를 호출하고자 할 때 사용 / 오버로딩된 다른 생성자 메서드를 호출할 때 사용

//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------
// 입출력
/*
- 각 타입의 비트 크기계산
System.out.println(Byte.BYTES); //바이트 계산 
System.out.println(Byte.SIZE); // 비트계산
System.out.println((Short.BYTES) + " " +(Short.SIZE));
System.out.println("byte" + Byte.BYTES +"(바이트)"+ "-->" + Byte.SIZE + "(비트)" + Byte.MIN_VALUE+ "~" +Byte.MAX_VALUE);
System.out.println("Short" + Short.BYTES +"(바이트)"+ "-->" + Short.SIZE + "(비트)" + Short.MIN_VALUE+ "~" +Short.MAX_VALUE);
System.out.println("Int" + Integer.BYTES +"(바이트)"+ "-->" + Integer.SIZE + "(비트)" + Integer.MIN_VALUE+ "~" +Integer.MAX_VALUE);
System.out.println("Long" + Long.BYTES +"(바이트)"+ "-->" + Long.SIZE + "(비트)" + Long.MIN_VALUE+ "~" +Long.MAX_VALUE);
System.out.println("Char" + Character.BYTES +"(바이트)"+ "-->" + Character.SIZE + "(비트)" + (int)Character.MIN_VALUE+ "~" +(int)Character.MAX_VALUE);
*/
//---------------------------------------------------------------------------------------		
/*
// 변수
// 정수형 변수 
	byte b = 100;
	short s = 100;
	int i = 100;
	long l = 100L; // 맨뒤 L 을 붙여야한다. 
// 실수형 변수
	float f=3.14f; // 맨뒤 f 를 붙여야한다. 
	double d= 3.14;
// 문자형 변수
	char c = 'c';
// 문자열 변수
	String s = "hello";
// 논리형 변수
	boolean b = true;
*/

//변수가 저장되는 공간의 특성
//정수형: byte- 1byte / short-2byte / int- 4byte / long- 8byte
//		int num = 1234; // 1234가 4개 = 4byte
//		long number=123456789; // 
	
//문자형: char- 2byte
//		char ch='A'; // 문자형의 경우 내부적으로 정수값으로 작성되어 있어 char변환시켜 출력. 
		
//실수형: float- 4byte / double- 8byte
//		double dNum = 3.14;
//		float fNum = 3.14F; // double형 처럼 쓰면 오류뜸. 뒤에 f반드시 붙여야함!
		
//논리형: boolean- 1byte

// 최우선연산자 :(), [], . (점)
// 단항연산자: +, -, ~, !, (), ++, --
// 산술연산자: +, -, %, *, /
// 쉬프트연산자: <<, >>, >>>
// 관계연산자: >, <, >=, <=, ==, !=
// 논리연산자: &, ^, |, &&, ||
// 삼항연산자: ?:
// 대입연산자: =, +=, /=, &=, *=, -=, <<=, >>=, >>>= ^=, !=, %=
			
//------------------------------------------------------------------------------------
// printf(print format) : 가변 o (소수점 변경) 
// %s : 문자열
// %c : 'A'  쌍따옴표하면 오류
// %f : 3.14 : 실수형
// %d, 100 : 10진수 정수
// %o, 15 : 8진수 정수
// %x, 15 : 16진수 정수 (소문자 출력)
// %X, 15 : 16진수 정수 (대문자 출력)
// %b, -- : boolean 형식 출력
// %e : 지수표현식형식으로 출력
// %- : 출력할 전체자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
// %0 : 출력할 전체 자리수가 지정된 경우 왼쪽에 남는자리에 0을 채워 출력한다.
// %n : 출력할 전체 자리수
// % .m: 소수점 아래 자릿수, 잘리는 자리에서 반올림 시켜 출력한다.
// %t : 탭
// %n : 줄바꿈
// %


//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------
// 그외
// 변수작성시 오류가 뜨는것은 변수선언만 하면 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기전에 초기화를 시켜야한다.
// int sum; (오류)  → int sum = 0; (정상)

// System.exit(0) → 강제프로그램종료
// 문자를 곱셈연산하면 문자의 유니코드 값으로 곱한다.
// sc.nextInt 와 sc.nextLine() 사이  sc.nextLine() 를 입력하여 키보드 버퍼를 비운다.

// 삼항연산자 형변환
//int hour = 16;
//String number = hour <= 12 ? "오전" : "오후";
//System.out.println(number);

// length VS length()
// int [] aaa= new int[10]; 
// system.out.println(aaa.length); → 10   / length는 배열의 길이값  
// String bbb = "welcome to seoul" ;
// system.out.println(bbb.length()); → 16 / length()는 문자열의 길이값

// toString 메서드 : 주로 반복문을 사용하지 않고 배열의 값을 출력하고자 할때 사용한다. (파이썬-index와 유사)
// int ar[] = {238, 483, 239, 442, 487, 239, 873};
// System.out.println(Arrays.toString(ar));
//
// charAt 메서드  String으로 저장된 문자열중에서 한글자만 선택해서 char 타입으로 변환해준다.
// char타입은 한 글자만 저장할 수있는 변수이어서 한글자만 입력받는 것보다 문자열로 입력받아 한글자만 출력하는 것이 효율적.

// 클래스의 구분을 위하여 주석으로 end of class 등으로 표시하여 보기 쉽도록 만들어야 한다!
