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
	private Bank next; // 자기참조
	
	
	public void fir() throws IOException{
		System.out.println("원하시는 서비스의 메뉴를 눌러주세요 \n 1.신규가입 2.이율변경 3.등록인원정보 4.종료");
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
		System.out.println("==신규가입== ");
		System.out.print("이름:");
		this.name=in.readLine();
		System.out.print("입금 금액:");
		this.money=Double.parseDouble(in.readLine());
		
		System.out.println("신규 가입이 처리되었습니다 \n입금한 금액은 "+this.money+"원 입니다.\n 현재 적용 이율은"+inter+"%입니다.\n==tlsrb 가입 끝==");
		
	}
	
	public void change()throws IOException{
		System.out.print("관리자 패스워드를 입력하세요:");
		int p=Integer.parseInt(in.readLine());
		if(p==password){
			System.out.print("현재"+inter+"%의 이율이 적용되고 잇습니다. 얼마로 변경하시겠습니까?\n 적용 이율=");
			inter=Double.parseDouble(in.readLine());
			System.out.print("모든 고객에게"+inter+"%로 변경 적용됩니다.");
		}
		else{System.out.println("잘못된 비밀번호 입력 \n 시스템이 종료됩니다.");
		System.exit(-1);
		
		}
		}
	
	
	public void info(){
		System.out.println("==현재 등록 고객 정보==\n이름    금액    이율\n=============== ");
		
		
		
	}
	
	public void finish(){
		System.out.println("은행영업을 마감합니다. 수고하셨습니다!!!");
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
			/*System.out.print("1.신규가입 2.이율변경 3.등록인원정보 4.종료 ==> ");
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
			System.out.println(); */
		}

}
}
