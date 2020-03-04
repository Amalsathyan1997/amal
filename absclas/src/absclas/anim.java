package absclas;

abstract class Animal
{
abstract void eat();

}

class Tiger extends Animal
{
	void eat()
	{
		System.out.println("i only eat non vegetarian ");
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("i eat only vegetarian");
	}
}

class anim{
	public static void main(String[] args) {
		Animal t1;
		t1=new Tiger();
		t1.eat();
		t1=new Goat();
		t1.eat();
	}
	
}

