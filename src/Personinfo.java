import java.io.*;
public class Personinfo {
//��������
	BufferedReader in;
	private String name;
	private String jumin;
	private String tel;
	private String adr;
	private String height;
	private String m;
	private String job;
	
//���� �ʱ�ȭ
	public Personinfo(){
	in=new BufferedReader(new InputStreamReader(System.in));
	}
//�Է�
	
	public void inpt()throws IOException{
		System.out.print("�̸��� �Է��ϼ���:");
		name=in.readLine();
		System.out.print("�ֹι�ȣ�� �Է��ϼ���");
		jumin=in.readLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���");
		tel=in.readLine();
		System.out.print("�ּҸ� �Է��ϼ���");
		adr=in.readLine();
		System.out.print("Ű�� �Է��ϼ���");
		height=in.readLine();
		System.out.print("�����Ը� �Է��ϼ���");
		m=in.readLine();
		System.out.print("������ �Է��ϼ���");
		job=in.readLine();
		
	}
	
	//����
	public void change(String name,String j,String t,String a,String h,String m,String job)throws IOException{
		this.name=name;
		this.jumin=j;
		this.tel=t;
		this.adr=a;
		this.height=h;
		this.m=m;
		this.job=job;	
	}
	
	//���
	public void output(){
		System.out.println("�̸�:"+name);
		System.out.println("�ֹι�ȣ:"+jumin);
		System.out.println("��ȭ��ȣ:"+tel);
		System.out.println("�ּ�:"+adr);
		System.out.println("Ű:"+height);
		System.out.println("������:"+m);
		System.out.println("����:"+job);
	}
	
	
	
	public static void main(String ar[])throws IOException{
		Personinfo ex=new Personinfo();
		ex.inpt();
		ex.output();
		ex.change("�ѽ¿�", "123", "0103438", "â����"," 183", "123", "�︸����");
		ex.output();
		
	}
}
