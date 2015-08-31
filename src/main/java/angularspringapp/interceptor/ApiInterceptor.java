package angularspringapp.interceptor;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

public class ApiInterceptor implements ClientHttpRequestInterceptor
{

    static final Logger log = Logger.getLogger(ApiInterceptor.class);

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException
    {
        HttpRequest wrapper = new HttpRequestWrapper(request);
        wrapper.getHeaders().set("X-Mashape-Key", "6t5XMZpQ4XmshDhvqFPAAwGftiNjp16tibIjsn758sRA5kHRsY");

        log.info("************************************");
        log.info("**********************Inderceptor*****************");
        log.info("************************************");
        return execution.execute(wrapper, body);
    }

}
