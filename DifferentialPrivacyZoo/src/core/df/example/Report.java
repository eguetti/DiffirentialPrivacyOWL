package core.df.example;

public class Report {

	private BoundingReport boundingReport;
	
	private ConfidenceInterval confidenceInterval;

	public ConfidenceInterval noiseConfidenceInterval(){
		return confidenceInterval;
	}
	
	public BoundingReport getBoundingReport() {
		return boundingReport;
	}

	public void setBoundingReport(BoundingReport boundingReport) {
		this.boundingReport = boundingReport;
	}
	
}
