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
	// �̰� �� �� �Ұ������� z=123;
	public void disp(){
		
		//System.out.println(x);
		//System.out.print(y);              package�� �̶� �Ұ���
		System.out.println(z);  
		System.out.println(t);//protected ���̶� ��ӹ����鰡��  �� ���� �׳� ��¥ Ȯ�� ���״�� Ȯ�� ��Ű�� �ų� �Ѥ�.. ���� class ����ϴ°���. �׸���  private ����� ������ �Ǵ°�
		
	}
	
	
	public void dkgk(){
		System.out.println("��");
	}
	public static void main(String ar[]){
		Round10_Ex06 ex=new Round10_Ex06();         //�ű��ϰԵ� 06�� Ȯ���Ű�±�.
		ex.disp();
		System.out.println(ex.z);
		ex.z=1234; 
		System.out.println(ex.z);
		
		
	// 	System.out.print(z); �Ұ���
		
		gks ii=new gks();              //Ŭ������ ������ �׻� ��ü�� �ʿ��� 
		ii.yy();
		
		
		
	}
	

}
