class arrayeg
{
	public static void main(String args[])
	{
		String cars[]={"Volvo","BMW","Ford","Mazda"};
		String car[]=new String[4];
		car[0]="Volvo";
		car[1]="BMW";
		car[2]="Ford";
		car[3]="Mazda";
		System.out.println(cars[0]);
		System.out.println(car[2]);
		System.out.println(cars.length);
		for(String i:cars)
		{
			System.out.println(i);
		}
	}
}
