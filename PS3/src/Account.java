import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated=new Date();
	public Account(){
		
	}
	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;
	}
	public void setid(int id){
		this.id=id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public int getid(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	 public double withdraw(double amount) throws InsufficientFundsException 
	   {
	      if(amount <= balance)
	      {
	         balance -= amount;
	      }
	      else
	      {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs); 
	      }
		return amount;
	   }
	public double deposit(double deposit){
		balance= balance+deposit;
		return balance;
	}
}
 