package core.df.example;

public class CarrotReporter {
	
	private double privacyBudget = 0.0;
	
	private static final String msg_not_enough = "Not enough privacy budget";
	
	public CarrotReporter(String dataFilename, double epsilon) {
		
	}
	
	public int sum() {
		return 0;
	}
	
	public double mean() {
		return 0.0;
	}
	
	int countAbove(int limit) {
		return 0;
	}
	
	int max() {
		return 0;
	}
	
	int privateSum(double privacy_budget){
		if (privacy_budget < this.privacyBudget) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;
	}
	
	double privateMean(double privacy_budget) {
		if (privacy_budget < this.privacyBudget) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;
	} 
	
	int privateCountAbove(double privacy_budget, int limit){
		if (privacy_budget < this.privacyBudget) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;
	}
	
	int privateMax(double privacy_budget){
		if (privacy_budget < this.privacyBudget) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;		
	}
            
	double getPrivacyBudget() {
		return privacyBudget;
	}

	void setPrivacyBudget(double privacyBudget) {
		this.privacyBudget = privacyBudget;
	}
}
