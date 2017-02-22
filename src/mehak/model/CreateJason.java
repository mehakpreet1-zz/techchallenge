package mehak.model;

public class CreateJason {
	private String success;
	private String accountidentifier;
	
	public CreateJason(){
		
	}
	public CreateJason(String success, String accountidentifier ){
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
