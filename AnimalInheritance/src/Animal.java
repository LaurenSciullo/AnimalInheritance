//1 abstract method = abstract class
public abstract class Animal
	{
		// use protected for inheritance, private everywhere else 
		protected String name;
		protected String food;
		
		//abstract methods:
		public abstract void bearYoung();
		public abstract void makeNoise();
		
		//concrete method:
		public void eat()
		{
			System.out.println("The " + name + " is looking forward to eating " + food + ".");
			
		}

	}
