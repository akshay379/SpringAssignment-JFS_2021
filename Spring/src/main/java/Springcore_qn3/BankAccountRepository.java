package Springcore_qn3;


	public interface BankAccountRepository {
		 public double getBalance(long accountld);
		 public double updateBalance (long accountld, double newBalance);
	}
