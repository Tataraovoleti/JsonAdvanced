/**
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */

/**
 * @author Tatarao voleti
 * @date   Dec 3, 2014
 * 
 */
public class Employee extends Enhance<Employee> {
	
	private String eName;
	private String eQual;
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteQual() {
		return eQual;
	}
	public void seteQual(String eQual) {
		this.eQual = eQual;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eQual=" + eQual + "]";
	}
	
}
