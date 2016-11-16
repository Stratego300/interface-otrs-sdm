package flux.model.otrs;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
	
	//    "Queue": "DSI::Assistance::Hotline"
	@JsonProperty("Queue")
    private String queue;
	
	//    "QueueID": 12
	@JsonProperty("QueueID")
    private int queueID;
	
	//    "State": "open"
	@JsonProperty("State")
    private String state;
	
	//    "StateID": 4
	@JsonProperty("StateID")
    private int stateID;
	
	//    "Service": "DSI::Applications SI"
	@JsonProperty("Service")
    private String service;
	
	//    "ServiceID": 3
	@JsonProperty("ServiceID")
    private int serviceID;
	
	//    "Title": "RE: MEP RENVOI D'APPEL"
	@JsonProperty("Title")
    private String title;
	
	//    "Responsible": "root@localhost"
	@JsonProperty("Responsible")
    private String responsible;
	
	//    "ResponsibleID": 1
	@JsonProperty("ResponsibleID")
    private int responsibleID;
	
	//    "Owner": "root@localhost"
	@JsonProperty("Owner")
    private String owner;
	
	//    "OwnerID": 1
	@JsonProperty("OwnerID")
    private int ownerID;
	
	//    "CustomerUser": "4704DET"
	@JsonProperty("CustomerUser")
    private String customerUser;
	
	//    "Type": "01-Incident"
	@JsonProperty("Type")
    private String type;
	
	//    "TypeID": 3
	@JsonProperty("TypeID")
    private int typeID;
	
	//    "Lock": "unlock"
	@JsonProperty("Lock")
    private String lock;
	
	//    "LockID": 1
	@JsonProperty("LockID")
    private int lockID;
	
	//    "Priority": "3 high"
	@JsonProperty("Priority")
    private String priority;
	
	//	  "PriorityID": 5
	@JsonProperty("PriorityID")
    private int priorityID;

    public Ticket(){
    	
    }

    @Override
    public String toString() {
        return "{" +
                "customerUser='" + this.customerUser + '\'' +
                ", lock='" + this.lock + '\'' +
                ", lockID=" + this.lockID +
                ", owner='" + this.owner + '\'' +
                ", ownerID=" + this.ownerID +
                ", priority='" + this.priority + '\'' +
                ", priorityID=" + this.priorityID +
                ", queue='" + this.queue + '\'' +
                ", queueID=" + this.queueID +
                ", responsible='" + this.responsible + '\'' +
                ", responsibleID=" + this.responsibleID +
                ", service='" + this.service + '\'' +
                ", serviceID=" + this.serviceID +
                ", state='" + this.state + '\'' +
                ", stateID=" + this.stateID +
                ", title='" + this.title + '\'' +
                ", type='" + this.type + '\'' +
                ", typeID=" + this.typeID +
                '}';
    }

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public int getQueueID() {
		return queueID;
	}

	public void setQueueID(int queueID) {
		this.queueID = queueID;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getStateID() {
		return stateID;
	}

	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public int getResponsibleID() {
		return responsibleID;
	}

	public void setResponsibleID(int responsibleID) {
		this.responsibleID = responsibleID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public String getCustomerUser() {
		return customerUser;
	}

	public void setCustomerUser(String customerUser) {
		this.customerUser = customerUser;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public int getLockID() {
		return lockID;
	}

	public void setLockID(int lockID) {
		this.lockID = lockID;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getPriorityID() {
		return priorityID;
	}

	public void setPriorityID(int priorityID) {
		this.priorityID = priorityID;
	}
    
    
}
