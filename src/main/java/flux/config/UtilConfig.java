package flux.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Kenichi on 10/11/2016.
 */
@Component
@ConfigurationProperties("opt.flux.util")
public class UtilConfig {

    private String mySecret;
    private String myUuid;

    public String getMySecret() {
        return mySecret;
    }

    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    public String getMyUuid() {
        return myUuid;
    }

    public void setMyUuid(String myUuid) {
        this.myUuid = myUuid;
    }
}
