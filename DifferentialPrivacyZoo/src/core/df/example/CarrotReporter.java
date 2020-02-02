package core.df.example;

public class CarrotReporter {
	
	private double privacyBudget = 0.0;
	
	private static final String msg_not_enough = "Not enough privacy budget";
	
	private String dataFilename;
	private double epsilon;
	
	
	public CarrotReporter(String dataFilename, double epsilon) {
		this.dataFilename = dataFilename;
		this.epsilon = epsilon;
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
		if (privacy_budget < this.getPrivacyBudget()) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;
	}
	
	MeanStatus privateMean(double privacy_budget) {
		if (privacy_budget < this.getPrivacyBudget()) {
			System.out.println(msg_not_enough);
			return new MeanStatus(); 
		}
		return new MeanStatus();
	} 
	
	int privateCountAbove(double privacy_budget, int limit){
		if (privacy_budget < this.getPrivacyBudget()) {
			System.out.println(msg_not_enough);
			return 0; 
		}
		return 0;
	}
	
	int privateMax(double privacy_budget){
		if (privacy_budget < this.getPrivacyBudget()) {
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
