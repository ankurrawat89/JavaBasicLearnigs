package postingrequestTest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class Test {
public static void main(String args[]) throws Exception{
	/*String url = "http://www.google.com/search";
	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	//add reuqest header
	con.setRequestMethod("POST");
	con.setRequestProperty("User-Agent", "Mozilla/5.0");
	con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	String urlParameters = "q=mykong";

	// Send post request
	con.setDoOutput(true);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	wr.writeBytes(urlParameters);
	wr.flush();
	wr.close();

	int responseCode = con.getResponseCode();
	System.out.println("\nSending 'POST' request to URL : " + url);
	System.out.println("Post parameters : " + urlParameters);
	System.out.println("Response Code : " + responseCode);

	BufferedReader in = new BufferedReader(
	        new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();

	//print result
	System.out.println(response.toString());*/
	URL url = null;
    url = new URL("http://www.google.com/search");
    HttpURLConnection urlConn = null;
    urlConn = (HttpURLConnection) url.openConnection();
    urlConn.setDoInput (true);
    urlConn.setDoOutput (true);
    urlConn.setRequestMethod("POST");
    urlConn.setRequestProperty("Content-Type", "application/json");
    urlConn.connect();

    DataOutputStream output = null;
    DataInputStream input = null;
    output = new DataOutputStream(urlConn.getOutputStream());

                /*Construct the POST data.*/
    String content = "{\"description\":\"prova_Process\",\"modelgroup\":\",\"modified\":\"false\"}";

    /* Send the request data.*/
    output.writeBytes(content);
    output.flush();
    output.close();

    /* Get response data.*/
    String response = null;
    input = new DataInputStream (urlConn.getInputStream());
    while (null != ((response = input.readLine()))) {
        System.out.println(response);
        input.close ();
    }



}


}
