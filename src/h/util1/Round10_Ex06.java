package h.util1;

import h.util.*;

 class gks extends Round10_Ex03{
	Round10_Ex06 tmd=new Round10_Ex06();    
	void yy(){
	tmd.dkgk();
	System.out.println(z);
	}
}

public class Round10_Ex06 extends Round10_Ex03{
	// 이건 또 왜 불가능하지 z=123;
	public void disp(){
		
		//System.out.println(x);
		//System.out.print(y);              package형 이라 불가능
		System.out.println(z);  
		System.out.println(t);//protected 형이라 상속받으면가능  아 존나 그냥 진짜 확장 말그대로 확장 시키는 거네 ㅡㅡ.. 같은 class 취급하는거임. 그리고  private 기능을 가지게 되는거
		
	}
	
	
	public void dkgk(){
		System.out.println("헐");
	}
	public static void main(String ar[]){
		Round10_Ex06 ex=new Round10_Ex06();         //신기하게도 06을 확장시키는군.
		ex.disp();
		System.out.println(ex.z);
		ex.z=1234; 
		System.out.println(ex.z);
		
		
	// 	System.out.print(z); 불가능
		
		gks ii=new gks();              //클래스에 들어가러면 항상 객체가 필요해 
		ii.yy();
		
		
		
	}
	

}
