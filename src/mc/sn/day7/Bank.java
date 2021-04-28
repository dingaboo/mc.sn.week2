package mc.sn.day7;

public class Bank {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.createAccount();

	}
	public void createAccount() {
		AccountVO account1=new AccountVO("1001","kim",12000);
		AccountVO account2=new AccountVO("1002","lee",12000);
		AccountVO account3=new AccountVO("1003","song",12000);
		
		AccountVO[] accountList= {account1, account2, account3};
		this.printAccount(accountList);
		
	}
	public void printAccount(AccountVO[] list) {
		for(AccountVO account: list) {
			System.out.println(account);
		}
	}
}
