import java.util.ArrayList;

import com.google.gson.Gson;

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
public class GsonTest {

	
	
	public static void main(String []a){
		
		
		Employee emp = new Employee();
		Employee empList = new Employee();
		
		empList.seteName("Tata");
		empList.seteQual("MCA");
		
		emp.setArrList(new ArrayList<Employee>());
		emp.getArrList().add(empList);
		
		String toJson = new Gson().toJson(emp);
		System.out.println(toJson);
	}
}
