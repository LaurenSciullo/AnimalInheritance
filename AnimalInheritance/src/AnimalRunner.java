//runner never abstract
public class AnimalRunner
	{

		public static void main(String[] args)
			{
				Animal[] zoo = new Animal[1];
				zoo[0] = new Bat();
				
				for (Animal a: zoo)
					{
						a.bearYoung();
						a.makeNoise();
						a.eat();
						
						System.out.println();
					}

			}

	}
