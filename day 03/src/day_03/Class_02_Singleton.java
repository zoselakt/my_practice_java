package day_03;

public class Class_02_Singleton {
	public static void main(String[] args) {
		// singleton ����
		// 
		
		// this : ������ �ν��Ͻ� �����θ� ����Ű�� �����.
		// this�� �����ϰ� �Ǹ� �Ķ���ͷ� ���Ǵ� name�� age�� �νĵȴ�.
		
		// �������� : �޸�- ����
		// �޼���(�Լ�)���ο� ����Ǿ� ������������� ��� / �Լ��� ȣ��� �����ǰ� �Լ��� ������ �Ҹ�
		// void info() { } - {} ���ο� �ִ� ������ ���������� �Ѵ�.
		// ���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�. / String model, color, int capacity 
		
		
		// ��������
		
		// �Ϲݺ���: ���� �����ϴ� ���� / �������� : �ּҸ� �����ϴ� ����
		
			Iphone myphone1 = new Iphone();
			Iphone myphone2 = new Iphone("iphone SE", "white", 70);
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

class Iphone{ 
	String model; // �������� �ʱ�ȭ
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
	this.model = model;
	this.color = color;
	this.capacity = capacity;}
	void info() { // �������� ���
		System.out.println("model:" + model);
		System.out.println("color:" + color);
		System.out.println("capacity:" + capacity);
	}
}