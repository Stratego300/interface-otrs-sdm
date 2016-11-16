package flux.model.jira;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class Fields {

    private Project project;
    private String summary;
    private String description;

    @JsonProperty("issuetype")
    IssueType issueType;

    private Map<String, String> map = new HashMap<String, String>();

    public Fields(){
        
    }

    @JsonAnyGetter
    public Map<String, String> getMap() {
        return map;
    }

    public void add(String key, String value){
        map.put(key, value);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }
}
