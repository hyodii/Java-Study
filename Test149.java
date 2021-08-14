/* ======================================
  ���� ����(Exception) ó�� ����
=========================================*/

// �ٸ� ���� �ٽ� ������

public class Test149
{
	public int getValue(int value)  throws Exception            // �� ���� ������(�Ķ� ���߹�)
	{
		int a = 0;

		try
		{
			a = getData(-2);									//�� ���� �߻�	
		}														//   ���� ���߹�
		catch (Exception e)										//�� ���� ��Ƴ���
		{														//   ���� ���߹�
			// �� ���� ó��(���� ���߹�)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
			
			// �쿹�� ����
			throw new Exception("value �� �����Դϴ�.");        
			// �Ʊ�� ���� e������ �ſ��µ� ������ ���ο� ���� �߻�!
			// (�Ķ� ���߹�)
		}

		return a;
	}

	public int getData(int data) throws Exception                //�� ���� ������
	{															 //   ���� ���߹�
		if(data<0)
			throw new Exception("date �� 0 ���� �۽��ϴ�.");     //�� ���� �߻�
																 //   ���� ���߹�
		return data + 10;
	}
	
	public static void main(String[] args)      // ��
	{
		Test149 ob = new Test149();

		try
		{
			int a = ob.getValue(-1);                                //�� ���� �߻� //�Ķ� ���߹�
			System.out.println("a: " + a);
		}
		catch (Exception e)								     		// �� ���� ��Ƴ���  //�Ķ� ���߹�
		{
			// �� ���� ó��(�Ķ� ���߹�)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
		}
		
	}
}


/*
e.getMessage() = ���� �̺�Ʈ�� �Բ� ������ �޼����� ����Ѵ�.

e.toString() = ���� �̺�Ʈ�� toString()�� ȣ���ؼ� ������ ���� �޽����� Ȯ���Ѵ�.

e.printStackTrace() = ���� �޼����� �߻� �ٿ����� ã�Ƽ� �ܰ躰�� ������ ����Ѵ�.

*/