package day_03;

import java.util.Arrays;

public class Array_01 {
	public static void main(String[] args) {
		// 배열 : 파이썬의 range처럼 10개의 변수 대신 하나의 명령으로 10개의 객체를 만들수 있다. 
		//
		
			// 배열 : []score 도 가능  / [] 는 저장공간 
				int scores[] = new int[3];
				scores[0] = 100;
				scores[1] = 80;
				scores[2] = 70;
				System.out.println("1번째 학생의 점수: "+scores[0]+"점");
				System.out.println("2번째 학생의 점수: "+scores[1]+"점");
				System.out.println("3번째 학생의 점수: "+scores[2]+"점");
				
			// length
//				int []a=new int[] {10,20,4,25,18};  // 순서상관 x
				int []b= {1,2,3,4,5,6,7};
				int c[]= new int[10];
				for(int i=0; i<c.length;i++) {
					c[i]=i;	}
				for(int i=0;i<c.length;i++) {
					System.out.print(c[i]);	}
				
				System.out.println();
				System.out.println(Arrays.toString(c));
				
				// for 문으로 배열활용
				for(int i = 0; i < 3; i++) {
					System.out.println(i + 1 + "번째 학생의 점수: " + scores[i] + "점");	}
}}

