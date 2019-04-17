
public class FormsForCalculating {

	private double result;

	public FormsForCalculating() {

	}

	public void kilogramsToLbs() {

		System.out.println("Enter the weight in kilograms : ");

		double kilograms = Convereter.unos.nextDouble();

		this.result = kilograms * 2.2046;

		System.out.println("kg " + kilograms + " to " + "lbs = " + result);

	}

	public void lbsToKilograms() {

		System.out.println("Enter the weight in pounds : ");

		double pounds = Convereter.unos.nextDouble();

		this.result = pounds / 2.2046;

		System.out.println("lbs " + pounds + " to " + " kilograms = " + result);

	}

	public void centimetersToInches() {

		System.out.println("Enter the length in centimeters : ");

		double centimeters = Convereter.unos.nextDouble();

		this.result = centimeters * 0.39370;

		System.out.println("cm " + centimeters + " to inches = " + result);
	}

	public void inchesToCentimeters() {

		System.out.println("Enter the length in centimeters : ");

		double inches = Convereter.unos.nextDouble();

		this.result = inches / 0.39370;

		System.out.println("inches " + inches + " to centimeters = " + result);

	}
}
