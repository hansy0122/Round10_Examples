import java.io.*;

class Round10_N_sub{
	private BufferedReader in;
	private String name;
	private int age;
	
	Round10_N_sub(){
		in=new BufferedReader(new InputStreamReader(System.in));
		name="";
				age=0;
	}
	
	public void setname() throws IOException{
		System.out.println("�̸��� �Է��ϼ���");
		name=in.readLine();         //���� class �������� ������ ���� ��� ����. --> �� static�� static������ ����.
	}
	
	public void setage() throws IOException{
		System.out.println("���̸� �Է��ϼ���");
		age=Integer.parseInt(in.readLine());         //���� class �������� ������ ���� ��� ����. --> �� static�� static������ ����.
	}
	public void disp() throws IOException{
		System.out.println(name+"���� ���̴�"+age+"�� �Դϴ�.");
		
	}
	
}
public class Round10_N {
	public static void main(String ar[]) throws IOException{
		
		Round10_N_sub ex=new Round10_N_sub();
		ex.setname();     // �ٸ� Ŭ�����̹Ƿ� ��ü�� �ʿ�
		ex.setage();
		ex.disp();
		
	}
}
