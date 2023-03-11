//14. Write a program to retrieve web page using URL class in java

import java.io.*;
import java.net.*;

public class WebPageRetriever {
	public static void main(String[] args) {
		String url = "https://www.example.com";

		try {
			URL websiteUrl = new URL(url);

			BufferedReader reader = new BufferedReader(new InputStreamReader(websiteUrl.openStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
			System.out.println("Web page retrieved successfully!");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
