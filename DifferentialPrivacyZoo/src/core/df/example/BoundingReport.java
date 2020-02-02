package core.df.example;

public class BoundingReport {
	
	private double mean;
	
	public double getMean() {
		return mean;
	}
	public void setMean(double mean) {
		this.mean = mean;
	}
	public double getLowerBound() {
		return lowerBound;
	}
	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}
	public double getUpperBound() {
		return upperBound;
	}
	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}
	public int getNumInputs() {
		return numInputs;
	}
	public void setNumInputs(int numInputs) {
		this.numInputs = numInputs;
	}
	public int getNumOutSide() {
		return numOutSide;
	}
	public void setNumOutSide(int numOutSide) {
		this.numOutSide = numOutSide;
	}
	private double lowerBound;
	private double upperBound;
	private int numInputs;
	private int numOutSide;
	
}
