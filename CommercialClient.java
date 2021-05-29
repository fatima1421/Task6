package Bank;

/**
 * CommercialClient is a special class from client class but it's for companies and have extra attrubite called commercial ID
 * @author laila
 *
 */
public class CommercialClient extends Client {
	private String commercialID;
	
	/**
	 * this constructor to set Initial values ​​for variables
	 */
	
	public CommercialClient() {
		commercialID =  "00000000000000";
	}
	
	/**
	 * this method to set the commercial's id
	 * @param co_id commercial's id
	 */
	public	void setCommercial_ID(String co_id) {
		  commercialID = co_id;
	}
	
	 /**
     * to get the value of commercial's id
     * @return commercialID commercial's id
     */ 
	
	public String getCommercial_ID() {
	    	return commercialID;
	    }
	    
	  /**
     * override from client class to return the values of attributes as a string in the main 
     */
    
	    @Override
	    public String toString() {
	    	
	    	return "\nThe Name is: " + getName() + "\nThe Commercial ID: " + commercialID +  "\nThe Address is: " + getAddress() 
	    			+ "\nThe Phone Number: " + getPhone() +"\n" + getAccount();
	    	
	    }
}
