import model.Bird;
import model.Cat;
import model.Frog;
import model.Lion;
import model.Snake;
import model.Fox;
import model.TrappedZooKeeper;
import model.Goat;
import model.Zebra;
import model.Dog;
import model.Cow;
import model.Bear;
import model.Fish;

public class AnimalNoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());

		TrappedZooKeeper jamantha = new TrappedZooKeeper();
		System.out.println(jamantha.speak());

		Frog slimey = new Frog();
		System.out.println(slimey.speak());

		Bird Pabu = new Bird();
		System.out.println(Pabu.speak());

		Lion Nala = new Lion();
		System.out.println(Nala.speak());

		Fox alexander = new Fox();
		System.out.println(alexander.speak());

		Goat Phil = new Goat();
		System.out.println(Phil.speak());

		Dog Zoe = new Dog();
		System.out.println(Zoe.speak());
		
		Cow biggy = new Cow();
		System.out.println(biggy.speak());
		
		Zebra jacob = new Zebra();
		System.out.println(jacob.speak());
		
		Snake Jerald = new Snake();
		System.out.println(Jerald.speak());

		Bear teddy = new Bear();
		System.out.println(teddy.speak());
		
		Fish bubbles = new Fish();
		System.out.println(bubbles.speak());
		
		Bat zubat = new Bat();
		System.out.println(zubat.speak());
	}

}

