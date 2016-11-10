import java.io.*;
public class Personinfo {
//변수선언
	BufferedReader in;
	private String name;
	private String jumin;
	private String tel;
	private String adr;
	private String height;
	private String m;
	private String job;
	
//변수 초기화
	public Personinfo(){
	in=new BufferedReader(new InputStreamReader(System.in));
	}
//입력
	
	public void inpt()throws IOException{
		System.out.print("이름을 입력하세요:");
		name=in.readLine();
		System.out.print("주민번호를 입력하세요");
		jumin=in.readLine();
		System.out.print("전화번호를 입력하세요");
		tel=in.readLine();
		System.out.print("주소를 입력하세요");
		adr=in.readLine();
		System.out.print("키를 입력하세요");
		height=in.readLine();
		System.out.print("몸무게를 입력하세요");
		m=in.readLine();
		System.out.print("직업을 입력하세요");
		job=in.readLine();
		
	}
	
	//변경
	public void change(String name,String j,String t,String a,String h,String m,String job)throws IOException{
		this.name=name;
		this.jumin=j;
		this.tel=t;
		this.adr=a;
		this.height=h;
		this.m=m;
		this.job=job;	
	}
	
	//출력
	public void output(){
		System.out.println("이름:"+name);
		System.out.println("주민번호:"+jumin);
		System.out.println("전화번호:"+tel);
		System.out.println("주소:"+adr);
		System.out.println("키:"+height);
		System.out.println("몸무게:"+m);
		System.out.println("직업:"+job);
	}
	
	
	
	public static void main(String ar[])throws IOException{
		Personinfo ex=new Personinfo();
		ex.inpt();
		ex.output();
		ex.change("한승엽", "123", "0103438", "창원시"," 183", "123", "억만장자");
		ex.output();
		
	}
}
