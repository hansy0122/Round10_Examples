import java.io.*;


class Bank{
	static BufferedReader in;
	private String name;
	static double inter;
	private double money;
	private int password;
	Bank(){
		in=new BufferedReader(new InputStreamReader(System.in));
		this.inter=5;
		this.password=1111;
	}
	private Bank next; // �ڱ�����
	
	
	public void fir() throws IOException{
		System.out.println("���Ͻô� ������ �޴��� �����ּ��� \n 1.�ű԰��� 2.�������� 3.����ο����� 4.����");
		int a=System.in.read();
		in.readLine();
		switch (a-48){
		case 1: newp(); break;
		case 2: change(); break;
		case 3: info(); break;
		case 4: finish(); break;
		}
		
	}
	
	public void newp()throws IOException{
		System.out.println("==�ű԰���== ");
		System.out.print("�̸�:");
		this.name=in.readLine();
		System.out.print("�Ա� �ݾ�:");
		this.money=Double.parseDouble(in.readLine());
		
		System.out.println("�ű� ������ ó���Ǿ����ϴ� \n�Ա��� �ݾ��� "+this.money+"�� �Դϴ�.\n ���� ���� ������"+inter+"%�Դϴ�.\n==tlsrb ���� ��==");
		
	}
	
	public void change()throws IOException{
		System.out.print("������ �н����带 �Է��ϼ���:");
		int p=Integer.parseInt(in.readLine());
		if(p==password){
			System.out.print("����"+inter+"%�� ������ ����ǰ� �ս��ϴ�. �󸶷� �����Ͻðڽ��ϱ�?\n ���� ����=");
			inter=Double.parseDouble(in.readLine());
			System.out.print("��� ������"+inter+"%�� ���� ����˴ϴ�.");
		}
		else{System.out.println("�߸��� ��й�ȣ �Է� \n �ý����� ����˴ϴ�.");
		System.exit(-1);
		
		}
		}
	
	
	public void info(){
		System.out.println("==���� ��� �� ����==\n�̸�    �ݾ�    ����\n=============== ");
		
		
		
	}
	
	public void finish(){
		System.out.println("���࿵���� �����մϴ�. �����ϼ̽��ϴ�!!!");
		System.exit(-1);
	}
	public Bank getNext() {
		return next;
	}
	private void setNext() {
		next = new Bank();
	}
	
	
}



public class Round10_N5 {
	public static void main(String ar[])throws IOException{
		Bank bank = new Bank();		
		while(true) {
			/*System.out.print("1.�ű԰��� 2.�������� 3.����ο����� 4.���� ==> ");
			int pos = Integer.parseInt(in.readLine());
			if(pos == 1) {
				JBank jb = bank;
				if(jb.getNext() != null) {
					jb = jb.getNext();
				}
				jb.open_account();				
			}
			else if(pos == 2) {
				JBank.change_interest();
			}
			else if(pos == 3) {
				bank.view_account();
			}
			else if(pos == 4) {
				JBank.end_bank();
			}
			else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			System.out.println(); */
		}

}
}
