package flux.model.jira;

import flux.config.UtilConfig;
import flux.model.otrs.OtrsWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class Translator {

    @Autowired
    private static UtilConfig utilConfig;

    private static final Logger logger = LoggerFactory.getLogger("flux.model.jira.Translator");

    public static final JiraWrapper otrs2JiraTicket(OtrsWrapper input){

        JiraWrapper output = new JiraWrapper();

        Fields fields = new Fields();
        fields.setDescription("Creating of an issue using project keys and issue type names using the REST API");
        fields.setSummary("Test REST (KBR)");
        Project project = new Project("OTRS");
        fields.setProject(project);
        //IssueType issueType = new IssueType("Bug");
        IssueType issueType = new IssueType("Correction");
        fields.setIssueType(issueType);
        //fields.add("customfield_10400", "KBR-1111");
        output.setFields(fields);

        return output;
    }
}
