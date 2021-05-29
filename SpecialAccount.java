package Bank;




/**
 *  This program for make several operation for your account
* @author Fatima
* @version 6.9.1
*
*/


public class SpecialAccount extends Account{

	//an override to additional method for choosing the operation to be performed
	/**
	* This function for select the operation you want to perform.
	*
	*/
	@Override
	public void chooseOperation() {
		System.out.println("_________________________________________________ \n");
		System.out.println("choose the operation : \n"+"1 : deposition \n" + "2 : withdrawal");

		int y = input.nextInt();

		if (y == 1) {this.deposit();}
		else if (y == 2) {this.withdraw();}
		else {System.out.println("please enter a valid operation");}
	}
/**
	*This function for withdraw account,allows the user to withdraw 1000$ limit out of their budget.
	*
	*
	*/

	@Override
	public void withdraw() {
		System.out.println("enter the withdrawal amount");
		double drawalamount =input.nextDouble();

		double sum = this.getBalance()-drawalamount;
		if (sum >= -1000) {
			this.setBalance(sum);
			System.out.println("the current balance after the withdrawal is "+this.getBalance());
		}
		else {
			System.out.println(" the over draft limit is 1000$ ");
		}

	}}

