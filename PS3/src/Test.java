
public class Test{
public static void main(String[]args) {
	Account Account1=new Account();
	Account1.setid(1122);
	Account1.setBalance(20000);
	Account1.setannualInterestRate(4.5);
	Account1.deposit(3000);	
	System.out.println("your balance is:"+Account1.getBalance());
	try
    {
       System.out.println("Amount Withdrawn: $" + Account1.withdraw(200.00)); 
       System.out.println("Amount Withdrawn: $" + Account1.withdraw(600.00));
       Account1.withdraw(600.00);
    }catch(InsufficientFundsException e)
    {
       System.out.println("Sorry, you have insufficient balance  $"
      + e.getAmount());
       e.printStackTrace();
    }
	System.out.println(Account1.getMonthlyInterestRate()+"%");
	System.out.println(Account1.getdateCreated());
    }

}
