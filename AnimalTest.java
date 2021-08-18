class Animal
{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("사람이 두 발로 뜁니다.");
	}
}

class Tiger extends Animal
{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal
{
	public void move()
	{
		System.out.println("독수리가 날아갑니다.");
	}
}

public class AnimalTest
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();

		AnimalTest test = new AnimalTest();
		test.moveAnimal(human);
		test.moveAnimal(tiger);
		test.moveAnimal(eagle);
	}
	
	public void moveAnimal(Animal animal)
	{
		animal.move();
	}
}

/*
사람이 두 발로 뜁니다.
호랑이가 네 발로 뜁니다.
독수리가 날아갑니다.
계속하려면 아무 키나 누르십시오 . . .
*/
