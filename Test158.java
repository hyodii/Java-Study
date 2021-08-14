/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

//  벡터 자료구조 객체 선언 및 생성 시
//  사용자 정의 클래스 활용 → 자료형


import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;	  //-- 이름
	private int age;	      //-- 나이

	// getXxx() → getter
	// setXxx() → setter
	//Setter는 Main 함수에서 인스턴스 필드에 접근해서 사용하는 함수
	//Getter도 Main 함수에서 인스턴스 필드에 접근해서 사용하는 함수


	//  getter / setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자 (매개변수 2개인 생성자)  →  사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 생성자 (매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}


}

public class Test158
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v 에
		// 황선우 13세 / 김연경 7세 / 김제덕 50 세
		// 담아내기

		/*
		// 방법① 
		MyData st1 = new MyData();
		st1.setName("황선우");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyDate();
		st2.setName("김연경");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyDate();
		st3.setName("김제덕");
		st3.setAge(50);
		v.add(st3);
		*/

		/*
		// 방법②
		// 마이데이터 타입 인스턴스 생성
		MyData st1 = new MyData("황선우",13);
		v.add(st1);
		MyData st2 = new myData("김연경",7);
		v.add(st2);
		MyData st3 = new myData("김제덕",50);
		v.add(st3);
		*/

		// 방법③
		v.add(new MyData("황선우",13));
		v.add(new MyData("김연경",7));
		v.add(new MyData("김제덕",50));

		/* 내가 푼 추가하는 법
		v.addElement(new MyData("황선우",13));
		v.addElement(new MyData("김연경", 7));
		v.addElement(new MyData("김제덕", 50));
		System.out.println("벡터의 요소 갯수 : " + length);


		// 벡터 자료구조 v 의 전체 요소 출력
		System.out.print("전체 요소 출력 : ");
		for (MyData str :v )
		{
			System.out.print(str +  " ");
		}
		System.out.println();
		//--==>> 
		*/

		// 벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름 : 황선우, 나이 : 13세
		// 이름 : 김연경, 나이 : 7세
		// 이름 : 김제덕, 나이 : 50세
		

		// 방법① 
		for (MyData m : v)
		{
			//System.out.println("이름 : " + m.getName() + ", " + "나이 : " + m.getAge() + "세");  //m.name 못하게 막아놔서 m.getName()
			System.out.printf("이름:%s, 나이:%d세\n",m.getName(),m.getAge());
		}
		System.out.println();
		//이름:황선우, 나이:13세
		//이름:김연경, 나이:7세
		//이름:김제덕, 나이:50세

		//예전 Record클래스를 배열에 인스턴스 넣어서 했던것처럼 생각 벡터 하나의 요소마다 각각의 MyData 인스턴스가 들어가 있다고 생각


		// 방법②
		for (int i=0; i<v.size();i++)
		{
			System.out.printf("이름:%s, 나이:%d세\n",v.elementAt(i).getName(),v.elementAt(i).getAge());
		}
		System.out.println();
		//이름:황선우, 나이:13세
		//이름:김연경, 나이:7세
		//이름:김제덕, 나이:50세

		// 방법③
		for (Object temp : v)
		{
			System.out.printf("이름:%s, 나이:%d세\n",((MyData)temp).getName(), ((MyData)temp).getAge());
													//------------ 다운 캐스팅
		}
		System.out.println();
		//이름:황선우, 나이:13세
		//이름:김연경, 나이:7세
		//이름:김제덕, 나이:50세
		
 	}
}
