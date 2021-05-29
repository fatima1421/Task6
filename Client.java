package Bank;

/**
 * client class to define information about client like name, address, phone . 
 * @author laila .
 *
 */
public class Client {

	private
	String name, address, phone, nationalID;
	Account account;

	/**
	 * this constructor to set Initial values ​​for variables.
	 */
	
	public Client(){	
	    name = "";
	    nationalID = "";
	    address = "";
	    phone = "";
	    account = new Account();  
	}
	
	/**
	 * this method to set the client's name 
	 * @param n client's name 
	 */
	
	
    public  void setName(String n) {
		      name = n;
	}
     /**
      * this method to set the client's national id
      * @param id client's id 
      */
 

    public  void setId(String id ) {
		     nationalID = id;
		
	}
     /**
      * this method to set the client's address
      * @param ad client's address 
      */
    public  void setAddress(String ad ) {
		     address = ad;
		
	}

     /**
      * this method to set the client's phone number
      * @param ph client's phone number 
      */

    public   void setPhone(String ph ) {
		     phone = ph;	
	}


     /**
      * this method to set the values of the client's account
      * @param account as object of account class 
      */

    public  void setAccount(Account account) {
	    	this.account = account;
	    }
     /**
      * to get the value of client's name
      * @return name client's name
      */

    public    String getName() {
		     return name;
	}
    /**
     * to get the value of client's id
     * @return nationalID client's id
     */   
    public	    String getId() {
		     return nationalID;
	}
    /**
     * to get the value of client's address
     * @return address client's address
     */

    public    String getAddress() {
		     return address;
	}
    /**
     * to get the value of client's phone number
     * @return phone client's phone number
     */
    public    String getPhone() {
		     return phone;
	}
    /**
     * to get the values of the client's account
     * @return account client's account
     */
    public   Account getAccount() {
	     	return account;
	    }
    /**
     * to return the values of attributes as a string in the main 
     */
    
	public String toString() {
	 
	    	return "\n\nThe Name is: " + name + "\nThe National ID: " + nationalID + "\nThe Address is: " + address 
	    			+ "\nThe Phone Number: "+ phone + account; 
	    }


	}
