package mehak.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import ravi.model.BeerExpert;
import ravi.model.TestJson;
import ravi.model.User;
import mehak.services.CancelOathVeri;
import mehak.services.OathVeri;
import mehak.model.CancelJason;
import mehak.model.CreateJason;

@WebServlet(name = "CancelServlet")
public class CancelSubscriptionServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        
        PrintWriter out = response.getWriter();
        
       
        String eventUrl = (String) request.getParameter("eventUrl");
        System.out.println(eventUrl);
        System.out.println("*****************&*&*&*&&&*&&&&*&&*&*&&**");
        
        ObjectMapper mapper = new ObjectMapper();
        CancelJason cr= new CancelJason("true","456");
        
        
        String json = mapper.writeValueAsString(cr);
        out.print(json);
        
        String Oathdata2;
        Oathdata2= CancelOathVeri.getJason2(eventUrl);
         
        
	}
       
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        
/*
        BufferedReader reader = request.getReader();
        User user1 = mapper.readValue(reader, User.class);
*/

        
//        testJson.setUser(user1);

        
        
        
        
        }

    

}

