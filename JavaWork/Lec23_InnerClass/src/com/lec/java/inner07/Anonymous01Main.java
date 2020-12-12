package com.lec.java.inner07;
/*
  Anonymous inner class(익명 내부 클래스):
   이름이 없는 local inner class
   이름이 없기 때문에 생성자를 만들 수가 없습니다.
   클래스의 정의와 동시에 인스턴스를 생성합니다.
*/
// 익명클래스는 : 인터페이스, 추상클래스, 일반클래스 모두 가능하다
public class Anonymous01Main {

	public static void main(String[] args) {
		System.out.println("Anonymous Inner Class(익명 내부 클래스)");
		
		// 1)
		Person p = new Person("헐크");
		Readable r = p.createInstance(55);
		r.readInfo();
		
		// 2)
		Readable r2 = new Readable() {
			@Override
			public void readInfo() {
				System.out.println("r2 의 readInfo 입니다");
			}
		};
		r2.readInfo();
		
		// 3)
		Readable r3 = new Readable() {
			@Override
			public void readInfo() {
				System.out.println("r3 의 readfo 입니다");
			}
		};
		r3.readInfo();
		
		// 4)
		new Readable() {
			
			@Override
			public void readInfo() {
				System.out.println("따끈따끈한 readInfo");
			}
		}.readInfo();
		
		
		System.out.println();
		System.out.println("-- 추상클래스도 익명클래스 가능 --");
		Moveble m1 = new Moveble() {
			
			@Override
			public void move(int times) {
				System.out.println("move() " + times * speed);
			}
		};
		
		m1.move(2);
		m1.move(10);
		
		
		System.out.println();
		System.out.println("-- 일반클래스도 익명클래스 가능--");
		MyClass my1 = new MyClass();
		my1.aaa();
		my1.bbb();
		
		MyClass my2 = new MyClass() {
			@Override
			public void aaa() {
				System.out.println("my2의 AAA");
			}
		};
		my2.aaa();
		
		MyClass my3 =new MyClass() {
			// 오버라이딩 : Alt + Shift + S + V 
			@Override
			public void aaa() {
				System.out.println("my3의 AAA");
			}
		};
		my3.aaa();

	} // end main()

} // end class Anonymous01Main

// 추상 클래스
abstract class Moveble{
	int speed = 100;
	public abstract void move(int times);
}

// 일반 클래스
class MyClass{
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
}













