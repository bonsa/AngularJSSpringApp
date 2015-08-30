package angularspringapp.service;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import angularspringapp.model.DayResponse;

@Service("ApiService")
public class ApiServiceImpl implements ApiService {

	static final Logger log = Logger.getLogger(ApiServiceImpl.class);
	
	@Override
	public void getFactAboutDay(String day, String month) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "6t5XMZpQ4XmshDhvqFPAAwGftiNjp16tibIjsn758sRA5kHRsY");
        ResponseEntity<DayResponse> response = restTemplate.exchange("https://numbersapi.p.mashape.com/{month}/{day}/date?fragment=true&json=true",
        	      HttpMethod.GET,
        	      new HttpEntity<Object>(headers),
        	      DayResponse.class, month, day);
        
        DayResponse dayResponse = response.getBody();
	}

}
