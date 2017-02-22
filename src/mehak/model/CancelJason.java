package mehak.model;

public class CancelJason {
	private String success;
	private String accountidentifier;
	
	public CancelJason(){
		
	}
	public CancelJason(String success, String accountidentifier ){
		this.success= success;
		this.accountidentifier= accountidentifier;
		
	}
	
	public String getSuccess(){
		return success;
		
	}
	
	public String getAccountIdentifier(){
		return accountidentifier;
	}
	
	 public void setSuccess(String success) {
	        this.success = success;
	    }

	   

	    public void setAccountIdentifier(String accountidentifier) {
	        this.accountidentifier = accountidentifier;
	    }

}
