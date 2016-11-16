package flux.model.otrs;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class OtrsWrapper {
    
    // "CustomerUser": "4704DET"
	@JsonProperty("CustomerUser")
    private String customerUser;
    
    // "TicketNumber": "2016041532000072"
	@JsonProperty("TicketNumber")
    private String ticketNumber;
    
    // "TicketID": 29478
	@JsonProperty("TicketID")
    private long ticketID;
	
    // "Ticket": { ... }
	@JsonProperty("Ticket")
    private Ticket ticket;
	
    // "Article": { ... }
	@JsonProperty("Article")
    private Article article;

    public OtrsWrapper(){
    	
    }

    @Override
    public String toString() {
    	
    	String ticketValue = ticket == null ? null : ticket.toString();
    	String articleValue = article == null ? null : article.toString();
    	
        return "{" +
                "ticketID=" + this.ticketID +
                ", ticketNumber='" + this.ticketNumber + '\'' +
                ", customerUser='" + this.customerUser + '\'' +
                ", ticket=" + ticketValue +
                ", article=" + articleValue +
                '}';
    }

	public String getCustomerUser() {
		return customerUser;
	}

	public void setCustomerUser(String customerUser) {
		this.customerUser = customerUser;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public long getTicketID() {
		return ticketID;
	}

	public void setTicketID(long ticketID) {
		this.ticketID = ticketID;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
    
    
}
