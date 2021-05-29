package Bank;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * this class constructs and initializes bank information(name, address, phone).then make an arraylist of all the  accounts and all the clients , and print them.
 * there is an additional method that updates the balance of any account in the array list on withdrawal or deposition
 * @author manar_mohamed_wasfi.
 * 
 * 
 * 
 * 
 * */

public class Bank {

	static Scanner input = new Scanner(System.in);

	private static ArrayList<Account> acclist =new ArrayList<Account>();
	private Account acc;
	private SpecialAccount acc1;
	private static ArrayList<Client> clientlist =new ArrayList<Client>();
	private String name ,address;
	private int phone;
	/**
	 * this constructor gives initial values of bank's name,address,and phone.
	 * 
	 * 
	 */
	public Bank(){
		name="no name";
		address="no address";
		phone=0000000;
	}
	
	/**
	 * sets the bank's name
	 * @param n bank's name 
	 * */
	
	public void set_name(String n) {
		
		name=n;
	}
	/**
	 * sets the bank's address
	 * @param a bank's address 
	 * */
	
	public void set_address(String a) {
		
		address=a;
	}
	/**
	 * sets the bank's phone
	 * @param p bank's phone 
	 * */
	
	public void set_phone(int p) {
		
		phone=p;
	}
	/**
	 * returns the bank's name.
	 *@return the bank's name. 
	 * */
	
	public String get_name() {
		return name;
	}
	/**
	 * returns the bank's address.
	 *@return the bank's address .
	 * */
	
	public String get_address() {
		return address;
	}
	/**
	 * returns the bank's phone.
	 *@return the bank's phone. 
	 * */
	public int get_phone() {
		return phone;
	}
	
	/**
	 * adds all the accounts to arraylist.
	 *@param y to determine if the account is special or not.
	 * @param n to store the account number.
	 * @param b to store the account balance.
	 * */
	
	public void addAccount(int y,int n ,double b)
	{
		if (y==1) {    acc1 =new SpecialAccount();
			acclist.add(acc1);
			acc1.setAccountNumber(n);
			acc1.setBalance(b);
		}
		else {  acc =new Account();
			acclist.add(acc);
			acc.setAccountNumber(n);
			acc.setBalance(b);
		}
	}
	
	/**
	 * an additional method that updates the balance of any account in the array list on withdrawal or deposition.
	 * @param x to determine if the account is special or not.
	 * @param z to determine the type of procedure either withdrawal or deposition.
	 * 
	 * */
	
	public void updateBalance( int x,int z) {
		 double b;
		 //special accounts
		if (x>=2000 && x<3000) {
		
			int index =acclist.indexOf(acc1);
			b=acc1.getBalance();
			SpecialAccount aa=(SpecialAccount)acclist.get(index);
			while (x!=aa.getAccountNumber() || index>=0) {
				index--;
				if(index==-1) {System.out.println("account not found");}
			    aa=(SpecialAccount)acclist.get(index);
			    b=aa.getBalance();
			}
			if (z==5) {
				aa.withdraw();
				System.out.println(aa.getBalance());
				acclist.set(index,aa);}
			if (z==6) {
				aa.deposit();
				acclist.set(index,aa);}
			
			}
		 if (x>=1000 &&x<2000) { 
			 
			int index =acclist.indexOf(acc);
			b=acc.getBalance();
			Account aa=acclist.get(index);
			while (x!=aa.getAccountNumber() && index>=0) {
				index--;
				if(index==-1) {System.out.println("account not found");}
			    aa=acclist.get(index);
			    b=aa.getBalance();
			}
			if (z==5) {
				aa.withdraw();
				acclist.set(index,aa);
			}
			if (z==6) {
				aa.deposit();
				acclist.set(index,aa);
				}
		 }	
	}
	
	
	/**
	 * adds all the commercial clients to arraylist.
	 *@param name  name of the client.
	 *@param address address of the client.
	 *@param phone phone of the client.
	 *@param commercialID  commercial ID of the client.
	 @param a to store the account number of the client.
	 * @param b to store the account balance of the client.
	 * */
	
	
	
	public void addCommercialClient(String name, String address, String phone,String commercialID,int a,double b)
	{
		    CommercialClient c2 =new CommercialClient();
			Account account=new Account();
			clientlist.add(c2);
			c2.setName(name);
			c2.setAddress(address);
			c2.setId(commercialID);
			c2.setPhone(phone);
			c2.setAccount(account);
			account.setAccountNumber(a);
			account.setBalance(b);
			addAccount(2, a, b);
		}
	
	

	/**
	 * adds all the clients to the same arraylist as Commercial Client .
	 *@param name  name of the client.
	 *@param address address of the client.
	 *@param phone phone of the client.
	 *@param nationalID  national ID of the client.
	 *@param a to store the account number of the client.
	 *@param b to store the account balance of the client.
	 * */
	public void addClient(String name, String address, String phone, String nationalID,int a,double b)
	
		 { 
			Client c1 =new Client();
			Account account=new Account();
			clientlist.add(c1);
			c1.setName(name);
			c1.setAddress(address);
			c1.setId(nationalID);
			c1.setPhone(phone);
			c1.setAccount(account);
			account.setAccountNumber(a);
			account.setBalance(b);
			addAccount(2, a, b);
			
			
		}
		/**
		 * prints all the accounts
		 * */
	public void printAccountList() {
		System.out.println(acclist.size());
		System.out.println(acclist+"\n");
	} 
	/**
	 * prints all the clients
	 * */
	public void printCLientList() {
		System.out.println(clientlist.size());
		System.out.println(clientlist+"\n");
	} 
	
	
	
}

