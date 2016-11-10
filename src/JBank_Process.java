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
		format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		// 날짜의 포맷을 정하는 클래스
		pass = "1111";
	}
	
	private JBank next; // 자기 참조
	
	public void open_account() throws IOException {
		System.out.println("== 신규 가입 ==");
		System.out.print("이름 = ");
		name = in.readLine();
		System.out.print("입금 금액 = ");
		money = Double.parseDouble(in.readLine());		
		
		date = format.format(new Date());
		System.out.println();
		System.out.println("신규 가입이 " + date + "에 처리 되었습니다.");
		System.out.println("입금한 금액은 " + money + "원 입니다.");
		System.out.println("현재 적용 이율은 " + JBank.interest + "%입니다.");
		System.out.println("== 신규 가입 끝 ==");
		
		money += money * JBank.interest / 100;
		this.setNext();
	}
	
	public static void change_interest() throws IOException {
		System.out.print("관리자 패스워드를 입력하세요 : ");
		String pw = in.readLine();
		if(!pw.equals(pass)) {
			System.out.println("패스워드가 올바르지 않습니다.");
			return;
		}
		System.out.println("현재 " + JBank.interest + "%의 이율이 적용되고 있습니다. 얼마로 변경 하시겠습니까?");
		System.out.print("적용 이율 = ");
		JBank.interest = Float.parseFloat(in.readLine());
		System.out.println("모든 고객에게 " + JBank.interest + "%로 변경 적용됩니다.");
	}
	
	public void view_account() {
		System.out.println("== 현재 등록 고객 정보 ==");
		System.out.println("이름\t금액\t이율");
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
		System.out.println("은행 영업을 마감합니다. 수고하셨습니다.");
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
			System.out.print("1.신규가입 2.이율변경 3.등록인원정보 4.종료 ==> ");
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
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
		}
	}
}
