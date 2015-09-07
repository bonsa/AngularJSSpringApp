package angularspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import angularspringapp.interceptor.ApiInterceptor;
import angularspringapp.model.DayResponse;
import angularspringapp.model.MathResponse;

@Service("ApiService")
public class ApiServiceImpl implements ApiService
{

    static final Logger log = Logger.getLogger(ApiServiceImpl.class);

    @Override
    public DayResponse getFactAboutDay(String day, String month)
    {

        RestTemplate restTemplate = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new ApiInterceptor());
        restTemplate.setInterceptors(interceptors);
        DayResponse response = restTemplate.getForObject("https://numbersapi.p.mashape.com/{month}/{day}/date?fragment=true&json=true", DayResponse.class, month, day);

        return response;
    }
    
    @Override
    public MathResponse getMathPropertyAboutNumber(String number)
    {

        RestTemplate restTemplate = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new ApiInterceptor());
        restTemplate.setInterceptors(interceptors);
        MathResponse response = restTemplate.getForObject("https://numbersapi.p.mashape.com/{number}/math", MathResponse.class, number);

        return response;
    }

}
