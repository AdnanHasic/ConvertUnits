
public class FormsForCalculating {
	
	private double result;

	public FormsForCalculating() {
		
	}
	

	
	public void kilogramsToLbs () {
		
		System.out.println("Enter the weight in kilograms : ");
		
		double kilograms = Convereter.unos.nextDouble();
		
		this.result = kilograms * 2.2046;
		
		System.out.println("kg " + kilograms + " to " + "lbs = " + result);
		
	}
    
	
}
