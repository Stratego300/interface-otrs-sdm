package flux.model.jira;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class IssueType {

    private String name;

    public IssueType(){

    }

    public IssueType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
