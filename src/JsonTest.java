/**
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */
import org.json.JSONArray;
import org.json.JSONObject;

// TODO: Auto-generated Javadoc
/**
 * The Class JsonTest.
 *
 * @author Tatarao voleti
 * @date   Dec 3, 2014
 */
public class JsonTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		JSONArray arrMark=new JSONArray();
		JSONArray arrCont=new JSONArray();
		
		JSONObject markObj1=new JSONObject();
		markObj1.put("id","87");
		markObj1.put("Qualification","MCA");
		markObj1.put("Percentage","80");
		System.out.println("First Student Marks-----> "+markObj1.toString());
		
		JSONObject markObj2=new JSONObject();
		markObj2.put("id","80");
		markObj2.put("Qualification","MCA");
		markObj2.put("Percentage","85");
		markObj2.put("markObj1",markObj1);
		System.out.println("Second Student Marks-----> "+markObj2.toString());
		
		JSONObject contObj=new JSONObject();
		contObj.put("name","Tata");
		contObj.put("City","Banglaore");
		System.out.println("Address-----> "+contObj.toString());
		
		/** Keeping two json objects into json array called arrMark */
		arrMark.put(markObj1);
		arrMark.put(markObj2);
		
		/** Keeping contact json object into json array called arrCont */
		arrCont.put(contObj);
		System.out.println("After keeping Marks in Array -----> "+arrMark.toString());
		
		JSONObject mainObj = new JSONObject();
		
		// keeping json object in another json object
		mainObj.put("marksFFF", markObj2);
		// keeping json array objects in json object
		mainObj.put("marks", arrMark);
		mainObj.put("contacts", arrCont);
		
		System.out.println(mainObj.toString());
		
		
		JSONObject jsObj = mainObj.getJSONObject("marksFFF");
		System.out.println(jsObj.length());
		System.out.println(jsObj.getString("id")+" "+jsObj.getString("Qualification")+" "+jsObj.getString("Percentage"));
		
		
		JSONArray js= mainObj.getJSONArray("marks");
		System.out.println("------"+js.length());
		
		for (int i=0;i<js.length();i++) {
			
			JSONObject object = js.getJSONObject(i);
			
			System.out.println(object.getString("id")+"  "+object.getString("Qualification")+" "+object.getString("Percentage"));
		}
		
	}

}
