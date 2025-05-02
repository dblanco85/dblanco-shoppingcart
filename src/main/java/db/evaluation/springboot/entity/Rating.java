package db.evaluation.springboot.entity;

public class Rating {

	private double rate;
	private Integer count;
	
	public Rating() {
		
	}

	public Rating(double rate, Integer count) {
		this.rate = rate;
		this.count = count;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Rating [rate=" + rate + ", count=" + count + "]";
	}
	
	
}
