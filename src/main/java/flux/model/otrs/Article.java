package flux.model.otrs;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

	//    "MimeType": "text/plain"
	@JsonProperty("MimeType")
    private String mimeType;
	
	//    "Subject": "TEST KBR4"
	@JsonProperty("Subject")
    private String subject;
	
	//    "ContentType": "text/plain; charset=utf8"
	@JsonProperty("ContentType")
    private String contentType;
	
	//    "Charset": "utf8"
	@JsonProperty("Charset")
    private String charset;
	
	//    "ArticleTypeID": 9
	@JsonProperty("ArticleTypeID")
    private int articleTypeID;
	
	//    "SenderType": "agent"
	@JsonProperty("SenderType")
    private String senderType;
	
	//    "SenderTypeID": 1
	@JsonProperty("SenderTypeID")
    private int senderTypeID;
	
	//    "ArticleType": "note-internal"
	@JsonProperty("ArticleType")
    private String articleType;
	
	//    "From": "\"Kenichi BRUN\" <Kenichi.BRUN@opt.nc>"
	@JsonProperty("From")
    private String from;
	
	//    "Body": "Test KBR\n"
	@JsonProperty("Body")
    private String body;
	

    public Article(){
    	
    }

    @Override
    public String toString() {
    	   	
        return "{" +
                "articleType='" + this.articleType + '\'' +
                ", articleTypeID=" + this.articleTypeID +
                ", body='" + this.body + '\'' +
                ", charset='" + this.charset + '\'' +
                ", contentType='" + this.contentType + '\'' +
                ", from='" + this.from + '\'' +
                ", mimeType='" + this.mimeType + '\'' +
                ", senderType='" + this.senderType + '\'' +
                ", senderTypeID=" + this.senderTypeID +
                ", subject='" + this.subject + '\'' +
                '}';
    }

    
    
}
