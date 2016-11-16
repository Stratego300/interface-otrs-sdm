package flux.model.jira;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class Response {

    private String id;
    private String key;
    private String self;

    public Response(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", self='" + self + '\'' +
                '}';
    }
}
