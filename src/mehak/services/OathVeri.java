package mehak.services;

import java.io.*;

import oauth.signpost.basic.DefaultOAuthConsumer;
import java.net.*;

import org.codehaus.jackson.map.ObjectMapper;

import Dao.OathDao;
import bean.Bean;

public class OathVeri {
	
	static OathDao dao;
    static{
        dao = new OathDao();
    }

	public static String getJason(String eventUrl) {
		String json = "";
		try {
			DefaultOAuthConsumer e = new DefaultOAuthConsumer("webclimax-179717", "ogggllu4wcNSyvR2");
			URL url = new URL(eventUrl);
			HttpURLConnection request = (HttpURLConnection)url.openConnection();
			request.setRequestProperty("Accept", "application/json");
			e.sign(request);
			int responseCode = request.getResponseCode();
			System.out.println(".....Sending GET request to URL.... : " +eventUrl);
			System.out.println(".....Response Code.... :  " +Integer.valueOf(responseCode));
			BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
			StringBuffer response = new StringBuffer();
			
			String input;
			while((input = in.readLine()) != null) {
				response.append(input);
			}
			
			in.close();
			
			json = response.toString();
			System.out.println("Response json from AppDirect server is: " +json);
			
			Bean bean = new Bean();
	        bean = new ObjectMapper().readValue(json, Bean.class);
	        System.out.println(".....*******************....." + bean.getFlag());
	        dao.create(bean);
		} catch (Exception var9) {
			System.out.println(" Unrecognized field:  " +var9.getMessage());
		}
		return json;
	}
}
