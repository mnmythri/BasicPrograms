package Day1;

public class bank_balance {
	
	public String owner;
	public int balance;
	public bank_balance (String name, int dollars)
	{
		owner = name;
		if(balance >0) {
			balance=dollars;
			System.out.println(+balance);
		} else
		{
			balance = 0;
			System.out.println(+balance);
		}
	}
	public int getBalance()
	{ 
		return balance;
	}
	public void setBalance(int dollars) {
		if(balance >0) {
			balance=dollars;
			System.out.println(+balance);
		} else
		{
			balance = 0;
			System.out.println(+balance);
		}	
	}
}

