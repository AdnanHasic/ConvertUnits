
public class FormsForCalculating {

	private double result;

	public FormsForCalculating() {

	}

	public void kilogramsToLbs() {

		System.out.println("Enter the weight in kilograms : ");

		double kilograms = Convereter.unos.nextDouble();

		this.result = kilograms * 2.2046;

		System.out.println("kg : " + kilograms + " to " + "lbs = " + result);

	}

	public void lbsToKilograms() {

		System.out.println("Enter the weight in pounds : ");

		double pounds = Convereter.unos.nextDouble();

		this.result = pounds / 2.2046;

		System.out.println("lbs : " + pounds + " to " + " kilograms = " + result);

	}

	public void centimetersToInches() {

		System.out.println("Enter the length in centimeters : ");

		double centimeters = Convereter.unos.nextDouble();

		this.result = centimeters * 0.39370;

		System.out.println("cm : " + centimeters + " to inches = " + result);
	}

	public void inchesToCentimeters() {

		System.out.println("Enter the length in centimeters : ");

		double inches = Convereter.unos.nextDouble();

		this.result = inches / 0.39370;

		System.out.println("inches : " + inches + " to centimeters = " + result);

	}

	public void celsiusToFahrenheit() {

		System.out.println("Enter the temperature in Celsius : ");

		double celsius = Convereter.unos.nextDouble();

		this.result = (celsius * 1.8) + 32;

		System.out.println("celsius : " + celsius + " to fahrenheit = " + result);
	}

	public void fahrenheitToCelsius() {

		System.out.println("Enter the temperature in Fahrenheit : ");

		double fahrenheit = Convereter.unos.nextDouble();

		this.result = (fahrenheit - 32) / 1.8;

		System.out.println("fahrenheit : " + fahrenheit + " to celsius = " + result);
	}

	public void choiceConverter() {

		System.out.println("Select the number to convert the units : " + "\n1. kilograms to lbs "
				+ "\n2. lbs to kilograms " + "\n3. centimeters to inches " + "\n4. inches to centimeters "
				+ "\n5. celsius to fahrenheit " + "\n6. fahrenheit to celsius ");

		int number = Convereter.unos.nextInt();

		switch (number) {
		case 1:
			kilogramsToLbs();
			break;

		case 2:
			lbsToKilograms();
			break;

		case 3:
			centimetersToInches();
			break;

		case 4:
			inchesToCentimeters();
			break;

		case 5:
			celsiusToFahrenheit();
			break;

		case 6:
			fahrenheitToCelsius();
			break;
		}

		Convereter.unos.close();
	}

}
