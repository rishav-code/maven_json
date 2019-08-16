package com.json.jsonproject;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonwrite {
	
		@SuppressWarnings("unchecked")
		public static void main(String[] args) throws IOException  {
			Scanner scan= new Scanner(System.in);
			JSONObject jo = new JSONObject();
			System.out.println("Enter the firstname");
			String fname=scan.nextLine();
			System.out.println("Enter the lastname");
			String lname=scan.nextLine();
			System.out.println("Enter the age");
			int age=scan.nextInt();
	          
	        // putting data to JSONObject 
	        jo.put("firstName", fname); 
	        jo.put("lastName", lname); 
	        jo.put("age", age); 
	          
	        // for address data, first create LinkedHashMap 
	        @SuppressWarnings("rawtypes")
			Map m = new LinkedHashMap(4);
	    scan.nextLine();
	        System.out.println("Enter street adds");
	        String adds=scan.nextLine();
	        System.out.println("Enter city");
	        String city=scan.nextLine();
	        System.out.println("Enter  State");
	        String state =scan.nextLine();
	        System.out.println("Enter postalcode");
	        String postalcode=scan.nextLine();
	        
	        
	        
	        m.put("streetAddress", adds); 
	        m.put("city", city); 
	        m.put("state", state); 
	        m.put("postalCode", postalcode); 
	          
	        // putting address to JSONObject 
	        jo.put("address", m); 
	          
	        // for phone numbers, first create JSONArray  
	        JSONArray ja = new JSONArray(); 
	        
	          
	        m = new LinkedHashMap(2); 
	        System.out.println("Enter office or home no?");
	        String notype=scan.nextLine();
	        System.out.println("Enter phone no?");
	        int phnno=scan.nextInt();
	        
	        m.put("type ", notype); 
	        m.put("number", phnno); 
	          
	        // adding map to list 
	        ja.add(m); 
	          
	     
	          
	        // putting phoneNumbers to JSONObject 
	        jo.put("phoneNumbers", ja); 
	          
	        // writing JSON to file:"JSONExample.json" in cwd 
	        FileWriter pw = new FileWriter("C:\\Users\\rishav.kumar\\Desktop\\myjson.json",true); 
	        pw.write(jo.toJSONString()); 
	          
	        pw.flush(); 
	        pw.close(); 
	    } 
}