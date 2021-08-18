class Animal
{
	public void move()
	{
		System.out.println("나는 동물!");
	}
}

class Human extends Animal
{
	@Override
	public void move()
	{
		System.out.println("나는 사람!");
	}
}

public class AnimalTest2
{
	public static void main(String[] args)
	{
		Human hm = new Human();
		hm.move();
	}
}
/*
나는 사람!
계속하려면 아무 키나 누르십시오 . . .
*/
