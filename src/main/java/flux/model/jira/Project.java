package flux.model.jira;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class Project {

    private String key;

    public Project(){

    }

    public Project(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
