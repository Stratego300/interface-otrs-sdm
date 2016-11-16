package flux;

import flux.config.JiraConfig;
import flux.config.OtrsConfig;
import flux.config.UtilConfig;
import flux.controller.TestComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UtilConfig utilConfig;

    @Autowired
    private JiraConfig jiraConfig;

    @Autowired
    private OtrsConfig otrsConfig;

    @Bean
    public TestComponent getToto(){

        logger.info("==> mySecret=" + utilConfig.getMySecret());

        return new TestComponent(utilConfig.getMySecret());
//        return new TestComponent("KBR-1111");
    }

    @Bean(name="jira")
    public RestTemplate initializeJiraRestTemplate(RestTemplateBuilder rtb){

        logger.info("==> JIRA> rootUrl=" + jiraConfig.getRootUrl());


        return rtb.basicAuthorization(jiraConfig.getLogin(), jiraConfig.getPassword())
                .rootUri(jiraConfig.getRootUrl())
                .build();
    }

    @Bean(name="otrs")
    public RestTemplate initializeOtrsRestTemplate(RestTemplateBuilder rtb){

        logger.info("==> OTRS> rootUrl=" + otrsConfig.getRootUrl());


        return rtb.basicAuthorization(otrsConfig.getLogin(), otrsConfig.getPassword())
                .rootUri(otrsConfig.getRootUrl())
                .build();
    }


    @Bean(name="localhost")
    public RestTemplate initializeLocalhostRestTemplate(RestTemplateBuilder rtb){

//        logger.info("==> LOCALHOST> rootUrl=localhost:8080");
//        logger.info("==> LOCALHOST> getLogin=" + jiraConfig.getLogin());
//        logger.info("==> LOCALHOST> getPassword=" + jiraConfig.getPassword());

        return rtb.basicAuthorization(jiraConfig.getLogin(), jiraConfig.getPassword())
                .rootUri("http://localhost:8080").build();
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
