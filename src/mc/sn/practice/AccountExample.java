package mc.sn.practice;
import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Account account=new Account();
		createAccount();
	}
	public static void createAccount() {
		Scanner sc=new Scanner(System.in);
		String ano=sc.next();
		String owner=sc.next();
		int balance=sc.nextInt();
		Account account=new Account(ano, owner);
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}
	
}
