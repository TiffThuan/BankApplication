/**
* Name: Thanh Thuan Thi Nguyen
* File: BankAccount
* Description: Assignment
*/

/**
 * @author Tiff
 *
 */
import java.util.Scanner;
import java.util.Date;
public class CheckingAccount 
{
	private Scanner input = new Scanner(System.in);
	private String uniqueID = "";
	private double acctBalance=0 ;
	private double annualInterestRate;
	private Date dateCreated;
	
	public CheckingAccount() 
	{
		dateCreated = new Date();
	}
	public CheckingAccount(String uniqueID, double initialBalance) 
	{
		this.uniqueID = uniqueID;
		this.acctBalance =initialBalance;
		this.annualInterestRate = 0;
		dateCreated = new Date();
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public double getAcctBalance() {
		return acctBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	
	public void setUniqueID(String uniqueID) {
		while (uniqueID.length()<4) {
			System.out.println("!!!ERROR: unique IDs are at least 4 characters long!!!");
			System.out.print("Enter the unique ID: ");
			uniqueID = input.nextLine();
		}
		this.uniqueID = uniqueID;
	}
	
	public void setAcctBalance(double acctBalance) {   	
		while (acctBalance <500)
		{
			System.out.println("!!!ERROR: new accounts need at least $500!!!");
			System.out.print("Enter the initial balance: $");
			acctBalance = input.nextDouble();
		}
		this.acctBalance = acctBalance;

	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String toString() {
		String text="";
		text+="Account Unique ID: "+uniqueID;
		text+="\n";
		text+="Account Creation Date/Time: "+dateCreated;
		text+="\n";
		text+="Balance: $"+acctBalance;
		text+="\n";
		text+="Daily Interest Amount: $" + String.format("%.2f",getDailyIntRate()*getAcctBalance()); ////%.2f defines decimal precision wanted
		text+="\n";
		return text;
	}

	public void depositCash (double amount)
	{
		 this.acctBalance += amount;
	}
	
	public double getDailyIntRate()
	{
		return (annualInterestRate/100)/12/30;
	}
	
	
}






