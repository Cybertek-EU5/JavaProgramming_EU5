package week5;

public class Salary {
	
	public double rate;
	public int weeklyHour;
	public double taxRate;
	
	public void setInfo(double hourlyRate, int numberOfHours, double tax ) {
		rate = hourlyRate;
		weeklyHour = numberOfHours;
		taxRate = tax;
	}
	
	public double salary() {  // salary before tax
		return rate * weeklyHour * 52;  // annual salary
	}
	
	public double totalTax() {
		return salary() * taxRate;  // total Tax
	}
	
	public double salaryAfterTax() {
		return salary() - totalTax();
	}

	
	public String toString() {
		return "Salary [rate=" + rate + ", weeklyHour=" + weeklyHour + ", taxRate=" + taxRate + "]";
	}
	
	
	

}

/*
 Salary:
            attributes
                rate, weeklyHour, taxRate
                
            actions:
                setInfo(), salary(), totalTax(), salaryAfterTax(), toString()
 */
