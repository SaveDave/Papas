package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class SMSHandler {
	private static String accountname="vivaflow";
	private static String username="vivaflow";
	private static String password="skuulphase224";
	//private static String numbers="+233249176736";
	private static String from="PapasPizza";

	public void sendSMS(String message, String numbers) {

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(
				"https://infoline.nandiclient.com/"+accountname+"/campaigns/sendCampaign/"+
				username+"/"+password+"/"+numbers+"/"+message+"/"+from);

		
		HttpResponse response = httpClient.execute(postRequest);

		/*if (response.getStatusLine().getStatusCode() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatusLine().getStatusCode());
		}*/

		BufferedReader br = new BufferedReader(
			new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		httpClient.getConnectionManager().shutdown();

	} catch (MalformedURLException e) {

		e.printStackTrace();

	} catch (IOException e) {

		e.printStackTrace();

	}
}


}