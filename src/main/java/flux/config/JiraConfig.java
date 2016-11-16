package flux.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Kenichi on 10/11/2016.
 */
@Component
@ConfigurationProperties("opt.flux.config.jira")
public class JiraConfig {

    private String rootUrl;
    private String login;
    private String password;

    public JiraConfig() {

    }

    public String getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
