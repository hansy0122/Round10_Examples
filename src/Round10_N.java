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
		System.out.println("이름을 입력하세요");
		name=in.readLine();         //같은 class 내에서는 마음껏 변수 사용 가능. --> 단 static은 static끼리만 가능.
	}
	
	public void setage() throws IOException{
		System.out.println("나이를 입력하세요");
		age=Integer.parseInt(in.readLine());         //같은 class 내에서는 마음껏 변수 사용 가능. --> 단 static은 static끼리만 가능.
	}
	public void disp() throws IOException{
		System.out.println(name+"님의 나이는"+age+"세 입니다.");
		
	}
	
}
public class Round10_N {
	public static void main(String ar[]) throws IOException{
		
		Round10_N_sub ex=new Round10_N_sub();
		ex.setname();     // 다른 클래스이므로 객체가 필요
		ex.setage();
		ex.disp();
		
	}
}
