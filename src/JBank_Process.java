import java.io.*;
import java.text.*;
import java.util.*;

class JBank {
	private String name;
	private double money;
	private String date;
	private static float interest;
	private static BufferedReader in;
	private static SimpleDateFormat format;
	private static String pass;
	static {
		interest = 5;
		in = new BufferedReader(new InputStreamReader(System.in));
		format = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm��");
		// ��¥�� ������ ���ϴ� Ŭ����
		pass = "1111";
	}
	
	private JBank next; // �ڱ� ����
	
	public void open_account() throws IOException {
		System.out.println("== �ű� ���� ==");
		System.out.print("�̸� = ");
		name = in.readLine();
		System.out.print("�Ա� �ݾ� = ");
		money = Double.parseDouble(in.readLine());		
		
		date = format.format(new Date());
		System.out.println();
		System.out.println("�ű� ������ " + date + "�� ó�� �Ǿ����ϴ�.");
		System.out.println("�Ա��� �ݾ��� " + money + "�� �Դϴ�.");
		System.out.println("���� ���� ������ " + JBank.interest + "%�Դϴ�.");
		System.out.println("== �ű� ���� �� ==");
		
		money += money * JBank.interest / 100;
		this.setNext();
	}
	
	public static void change_interest() throws IOException {
		System.out.print("������ �н����带 �Է��ϼ��� : ");
		String pw = in.readLine();
		if(!pw.equals(pass)) {
			System.out.println("�н����尡 �ùٸ��� �ʽ��ϴ�.");
			return;
		}
		System.out.println("���� " + JBank.interest + "%�� ������ ����ǰ� �ֽ��ϴ�. �󸶷� ���� �Ͻðڽ��ϱ�?");
		System.out.print("���� ���� = ");
		JBank.interest = Float.parseFloat(in.readLine());
		System.out.println("��� ������ " + JBank.interest + "%�� ���� ����˴ϴ�.");
	}
	
	public void view_account() {
		System.out.println("== ���� ��� �� ���� ==");
		System.out.println("�̸�\t�ݾ�\t����");
		System.out.println("==============================");
		JBank custom = this;
		while(custom.next != null) {
			System.out.print(custom.name + "\t");
			System.out.print(custom.money + "\t");
			System.out.println(JBank.interest);
			custom = custom.next;
		}
		System.out.println("==============================");
	}
	
	public static void end_bank() {
		System.out.println("���� ������ �����մϴ�. �����ϼ̽��ϴ�.");
		System.exit(0);
	}
	
	public JBank getNext() {
		return next;
	}
	private void setNext() {
		next = new JBank();
	}
}
public class JBank_Process {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		JBank bank = new JBank();		
		while(true) {
			System.out.print("1.�ű԰��� 2.�������� 3.����ο����� 4.���� ==> ");
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
			System.out.println();
		}
	}
}
