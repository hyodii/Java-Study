import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.util.Enumeration;


public class Test173
{
	public static void main(String[] args)  throws Exception
	{
		String appDir = System.getProperty("user.dir");   //캐릭터셋할때 사용해본적 있음! 인코딩방식
		//현재 위치를 알 수 있는 방법 등 시스템의 정보를 가져올때  System.getProperty() 를 사용

		// 테스트
		//System.out.println(appDir);
		//--==>> C:\JavaStudy

		// 파일 객체 생성
		File f0 = new File(appDir,"\\data\\test.ser");
		//-- appDir → C:\JavaStudy
		//-- appDir 위치(경로)를 중심으로 "\\data\\test.ser"를
		//   구성하겠다는 의미.
		//-- 결과적으로 『C:\JavaStudy\data\test.ser』 구성

		//테스트(확인)
		// ①
		//System.out.println(f0.getParentFile().exists());
		//--==>> false

		//테스트(확인)
		// ② 『C:\JavaStudy』 경로에 『data』 디렉토리 생성한 후 확인
		//System.out.println(f0.getParentFile().exists());
		//--==>> true

		// 디렉터리 구성이 존재하지 않는 상황이라면.....
		if(!f0.getParentFile().exists())
		{
			//  디렉터리를 만들겠다.      //--data 파일 없으면 data파일 생성됨!
			f0.getParentFile().mkdirs();
							// ------ makedirectorys
		}

		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String,String> h1 = new Hashtable<String,String>();

		// 생성한 h1 이라는 Hashtable 자료구조에 요소 추가  (구성하는 값의 순서는 의미 X)
		h1.put("3","손효진");
		h1.put("4","채효진");
		h1.put("2","김효진");
		h1.put("5","권효진");
		h1.put("1","장효진");

		// 테스트(확인)
		//System.out.println(h1.get("1"));
		//--==>> 장효진

		// 파일 전용 출력 스트림 생성(수도꼭지 열기)
		FileOutputStream fos = new FileOutputStream(f0);  //출력 스트림에 띄운 배 :f0
		//-- 파일 전용 출력 스트림(물줄기)에
		//   f0라는 파일 객체를 띄위겠다....  (흘려 내보낼 수 있도록...)
		//InputStreamReader isr = new InputStreamReader(System.in);

		// 객체 전용 출력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 객체 전용 출력 스트림(물줄기)으로
		//   fos 라는 파일 전용 출력 스트림을 감싸겠다.
		//BufferedReader br = new BufferedReader(isr);

		// 위의 구문과 동일한 구문
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		//위의 개념과 비료할 구조적으로 동일한 구문
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ※ ObjectOutputStream 클래스는
		//    객체들을 출력하는 기능을 제공하는 클래스로
		//    출력 스트림에 출력하기 전에
		//    내부적으로 객체 직렬화를 수행하게 된다.
		//    자바 기본형 데이터 또는 객체들을
		//    파일에 저장하거나 네트워크를 통해 전달하기 위해
		//    전달할 객체를 직렬화하는 기능을 제공하는 것이다.



		// 생성된 스트림에 내보낼 객체를 기록
		oos.writeObject(h1);

		oos.close();
		//-- ObjectOutputStream 리소스 반납

		fos.close();
		//-- FileOutputStream 리소스 반납

		// 내보내기 끝~!!!
		

		// ---------------------------------------------------------- 직렬화

		// data파일에 test.ser이 생김

		// 읽어들이기 시작~!!!


		if (f0.exists())		//-- f0 파일 객체가 존재한다면...
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//파일을 읽어들이고 그파일로부터 객체를 읽어들인다.


			// ois(ObjectInputStream)로 부터 읽어들인 객체(Object) (-> readObject 를 통해 처리)
			// 원래의 형(Hashtable)으로 캐스팅하여
			// h2라는 Hashtable 자료구조에 담아내기
			Hashtable h2 = (Hashtable)ois.readObject();   // 대상이 해시테이블인데 오브젝트로 읽어오니까 다운캐스팅해주어야함
			// Object obj = ois.readObject();
			// Hashtable h2 = (Hashtable)obj;
			// 이거 두줄을 한줄로 만든것

			ois.close();
			//-- ois 리소스 반남 -> ObjectInputStream 리소스 반납

			fis.close();
			//-- fis 리소스 반납 -> FileInputStream 리보스 반남

			//----------------------------------------------------여기까지 수행하면 읽어들이는 작업 끝~!!!

			// 읽어들인 h2 객체의 내용 확인
			String key;
			String value;

			// ※ Iterator 사용할 수 없음
			Enumeration e = h2.keys();


			while(e.hasMoreElements())
			{
				key = (String)e.nextElement();   //다운캐스팅
				//-- key값을 읽어들이는 과정

				//확인
				//System.out.println(key);
				/*
				5
				4
				3
				2
				1
				*/

				value = (String)h2.get(key);
				//-- key를 활용하여 value 얻는 과정

				System.out.println(key + " → " + value);
				/*
				5 → 권효진
				4 → 채효진
				3 → 손효진
				2 → 김효진
				1 → 장효진
				*/
			}//end while

		}//end if

	}//end main
}//end class
