package flux.controller;

import flux.model.jira.JiraWrapper;
import flux.model.jira.Response;
import flux.model.jira.Translator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import flux.model.otrs.OtrsWrapper;
import org.springframework.web.client.RestTemplate;

@RestController
public class JiraController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    private TestComponent toto;

    @Autowired
    @Qualifier("jira")
    private RestTemplate rt;

    @Autowired
    @Qualifier("localhost")
    private RestTemplate localhostRestTemplate;
    
    @RequestMapping(value = "/afficher", method = RequestMethod.POST)
    public void afficher(@RequestBody String input, @RequestHeader HttpHeaders headers) {
    	logger.info("DEBUT> afficher");
        logger.info(input);

        logger.info(headers.toString());

        
        for (final String key : headers.keySet()) {
			logger.info("HTTP_HEADERS> {}={}", key, headers.get(key));
		}
        
        logger.info("FIN> afficher");
    }

    @RequestMapping(value = "/bonjour", method = RequestMethod.GET)
    public void bonjour(@RequestHeader HttpHeaders headers) {
        logger.info("DEBUT> afficher");
        logger.info(headers.toString());

        toto.test("OMG");

//        String response = rt.getForObject("/rest/api/2/issue/BAG-51", String.class);
//        logger.info("JIRA> " + response);

        OtrsWrapper input = new OtrsWrapper();
        JiraWrapper jiraTicket = Translator.otrs2JiraTicket(input);

        ResponseEntity<Response> response = rt.postForEntity("/rest/api/2/issue", jiraTicket, Response.class);

//        ResponseEntity<Response> response = localhostRestTemplate.postForEntity("/afficher", jiraTicket, Response.class);


        logger.info("JIRA> CODE HTTP : " + response.getStatusCode());
        logger.info("JIRA> BODY : " + response.getBody());

        logger.info("FIN> afficher");
    }

    @RequestMapping(value = "/v2/otrs", method = RequestMethod.POST)
    public void createTicketSdm(@RequestBody OtrsWrapper ticketOtrs, @RequestHeader HttpHeaders headers) {
    	logger.info("DEBUT> afficher");
        logger.info(ticketOtrs.toString());

        logger.info(headers.toString());       
        
        for (final String key : headers.keySet()) {
			logger.info("HTTP_HEADERS> {}={}", key, headers.get(key));
		}

		OtrsWrapper input = new OtrsWrapper();
        JiraWrapper jiraTicket = Translator.otrs2JiraTicket(input);

        ResponseEntity<Response> response = rt.postForEntity("/rest/api/2/issue", jiraTicket, Response.class);

        logger.info("JIRA> CODE HTTP : " + response.getStatusCode());
        logger.info("JIRA> " + response);

        
        logger.info("FIN> afficher");
    }
    
    
    // Simply setting restTemplate timeout using ClientHttpRequestFactory

//    ClientHttpRequestFactory getSimpleClientHttpRequestFactory() {
//        final int timeout = 5;
//        final HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        clientHttpRequestFactory.setConnectTimeout(timeout * 1000);
//        return clientHttpRequestFactory;
//    }
//    
//    private ClientHttpRequestFactory getClientHttpRequestFactory() {
//        final int timeout = 5;
//        final RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000).setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();
//
//        final BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        credentialsProvider.setCredentials(new AuthScope("localhost", APPLICATION_PORT, AuthScope.ANY_REALM), new UsernamePasswordCredentials("user1", "user1Pass"));
//
//        final CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).setDefaultCredentialsProvider(credentialsProvider).build();
//
//        return new HttpComponentsClientHttpRequestFactory(client);
//    }
    
}
