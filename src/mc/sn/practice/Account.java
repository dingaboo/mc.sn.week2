package mc.sn.practice;

public class Account {
	private String ano; //���¹�ȣ
	private String owner; //������
	private int balance; //�ܰ�
	
	public Account() {}
	public Account(String ano, String owner) {
		this.ano=ano;
		this.owner=owner;
	}
	
	public void setAno(String ano) {
		this.ano=ano;
	}
	public String getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance+=balance;
	}
	public int getBalance() {
		return balance;
	}
}
