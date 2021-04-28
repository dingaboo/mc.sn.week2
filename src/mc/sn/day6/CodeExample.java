package mc.sn.day6;

public class CodeExample {

	public static void main(String[] args) {
		CodeExample ce=new CodeExample();
		ce.test1(8,3);
		ce.test2();
	}
	
	//교환로직 연습
	//두개의 정수형 변수를 입력 받게 매개변수 리스트를 변경하시오.
	//a에서 b까지 출력한다.(a,b)포함 코드작성하시오. 
	public void test1(int a, int b) {
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		for(int i=a;i<b+1;i++) {
			System.out.println(i);
		}
	}
	
	public void test2() {
		char[] alphabet=new char[26];
		
		for(int i=0;i<26;i++) {
			alphabet[i]=(char)(65+i);
		}
		this.printChar(alphabet);
		
		int[] idx1= {2,4,6,8,10,12,14,16};
		int[] idx2= {3,6,9,12,15,18,21,24};
		for(int i=0;i<8;i++) {
			char temp=alphabet[idx1[i]];
			alphabet[idx1[i]]=alphabet[idx2[i]];
			alphabet[idx2[i]]=temp;
		}
		this.printChar(alphabet);
	}
	
	public void printChar(char[] letters) {
		for(char c: letters) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
}