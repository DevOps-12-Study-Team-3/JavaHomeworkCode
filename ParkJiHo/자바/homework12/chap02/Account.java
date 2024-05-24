package homework.homework12.chap02;

public class Account {
	
	public int Balance = 0 ; // 잔액

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	

	public int Deposit( int Money ) // 입금
	{
		this.Balance += Money ;

		return Balance ;
	}
	
	public int Withdrawal( int Money ) // 출금
	{
		this.Balance -= Money ;

		return Balance ;
	}
	
	public int Balance_check( ) // 잔액
	{
		return this.Balance ;
	}
	
}
