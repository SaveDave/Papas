package controller;
import java.net.*;
import java.io.*;
public class SMSHandler { 
	public static void main(String[] args) throws Exception { 
		URL smsApi = new URL("http://site.mytxtbox.com/sms_api?username=PapasPizza&password=papaspizza&msg=Just+trying+the +sms+api+test&to=233249176736 "); 
		URLConnection yc = smsApi.openConnection(); 
		BufferedReader in = new BufferedReader( new InputStreamReader( yc.getInputStream())); 
		String inputLine; 
		while ((inputLine = in.readLine()) != null) 
			System.out.println(inputLine); 
		in.close(); 
	} 
}