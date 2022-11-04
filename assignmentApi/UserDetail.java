package assignmentApi;


import java.io.IOException;
//import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserDetail {

	public static void main(String[] args) {
		
		UserDetail user=new UserDetail();
		user.displayUserDetails();
	}
	
	public void displayUserDetails() {
		
		try {
			URL url=new URL("https://reqres.in/api/unknown");
			//HttpURLConnection connect=(HttpURLConnection)(url.openConnection());
			//connect.connect();
			Scanner sc=new Scanner(url.openStream());
			JSONObject jsonresponse=null;
			StringBuilder sb=new StringBuilder();
			while(sc.hasNext()) {
				jsonresponse=new JSONObject(sc.nextLine());
				
			}
			//System.out.println(sb.toString());
			//System.out.println(jsonresponse);
			
			JSONArray jsonarr=new JSONArray(jsonresponse.get("data").toString());
			for(int index=0;index<jsonarr.length();index++) {
				System.out.println(jsonarr.get(index));
			}
			/*System.out.println(jsonresponse);
			System.out.println("Color : "+jsonarr.getJSONObject(0).get("color"));
			System.out.println("Year : "+jsonarr.getJSONObject(0).get("year"));
			System.out.println("Name : "+jsonarr.getJSONObject(0).get("name"));
			System.out.println("Id : "+jsonarr.getJSONObject(0).get("id"));
			System.out.println("Pantone Value : "+jsonarr.getJSONObject(0).get("pantone_value"));
			*/
			//connect.disconnect();
			//System.out.println(jsonresponse);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
