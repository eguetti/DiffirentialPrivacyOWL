package core.df.example;

public class ReportDifferentialPrivacy {
	
	public int privacyBudget;	
	
	private String nameFile = "Animal.owl";
	
	private double epsilon;
	
	CarrotReporter reporter = new CarrotReporter(this.nameFile, epsilon);
	
	
	public static void main(String args[]) {
		
		ReportDifferentialPrivacy report = new ReportDifferentialPrivacy();
		report.queryNumTotalCarrots();	
		report.queryMeanBoundingReport();
		report.countNoiseConfidenceInterval(0);
		
	}
	
	//Query for the total number of carrots.
	public void queryNumTotalCarrots() {
		
		String msg1 = "It is a new day. Farmer Fred is ready to ask the animals about their \n" + 
				"	   carrot consumption";		
		
		String msg2 = "Farmer Fred asks the animals how many total carrots they have \n" + 
				"      eaten. The animals know the true sum but report the \n" + 
				"      differentially private sum to Farmer Fred. But first, they ensure \n" + 
				"      that Farmer Fred still has privacy budget left.";
				
		String msg3 = "Privacy budget remaining: \n" + reporter.getPrivacyBudget();
			
		String msg4 = "True sum: \n" + reporter.sum();
		
		String msg5 = "DP sum: \n" + reporter.privateSum(this.privacyBudget);
		//reporter.PrivateSum(.25).ValueOrDie();//XXX atualizar o orçamento da privacidade
		  
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg5);
		
	} 
	
	//Query for the mean with a bounding report
	public void queryMeanBoundingReport() {
		String msg1 = "Farmer Fred catches on that the animals are giving him DP results. \n" + 
				"      He asks for the mean number of carrots eaten, but this time, he wants \n" + 
				"      some additional accuracy information to build his intuition.\n";
		
		String msg2 = "Privacy budget remaining: \n" + reporter.getPrivacyBudget();				
		
		String msg3 = "True mean: \n" + reporter.mean();
		
		MeanStatus meanStatus = reporter.privateMean(this.privacyBudget);
		
		String msg4 = "DP mean: \n" + meanStatus.getStatus().getMessage();
		
		if (!meanStatus.isOk()) {
			System.out.println(("Error obtaining mean: %s\n"+ meanStatus.getStatus().getMessage()));
			System.out.println("The animals were not able to get the private mean with the current " +
					"privacy parameters. This is due to the small size of the dataset and " + 
					"random chance. Please re-run report_the_carrots to try again.\n");
		} else {
			
		}
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		
		
	}
	
	// Query for the count with a noise confidence interval.
	public void countNoiseConfidenceInterval(int limit) {		
		
		double privateCountAbove = reporter.privateCountAbove( this.privacyBudget, limit);
		
		double confidenceLevel = 0;
		
	    double lowerBound = 0;
	    
	    double upperBound = 0;	    
		
	    int countAbove = reporter.countAbove(limit);
	    
		int dpCount = reporter.privateCountAbove(this.privacyBudget, limit);
		
		String msg =  "Fred wonders how many gluttons are in his zoo. How many animals ate " +
		        "over 90 carrots? And how accurate is the result?";
		
		String msg2 = "Privacy budget remaining: \n" + reporter.getPrivacyBudget();
		
		String msg3 = "True count: \n" + reporter.countAbove(limit);
		
		String msg4 = "DP count output: \n" + reporter.countAbove(limit);//count_output
		
		String msg5 = "The animals tell Fred that " + privateCountAbove +" is the DP count. "
				+ lowerBound+ " " +upperBound + " is the "+ confidenceLevel+ 
				" confidence interval of the noise added to the count.";
		
		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg5);
	}
	
}
