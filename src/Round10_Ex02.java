
public class Round10_Ex02 {
	private static int x=100;
	private int y=10;
	
	public static void main(String ar[]){
		System.out.println(x);
		// static �� �ƴ϶� error   System.out.println(y);
		Round10_Ex02 ex=new Round10_Ex02();
		Round10_Ex02 ex1=new Round10_Ex02();
		System.out.println(x);
		
		System.out.println(ex.y);
		System.out.println(ex.x);
		
		ex.x=123;
		System.out.println(ex.x);
		System.out.println(x);     //���� static�� �ٷλ�밡��. 
      ex.y=321;

      System.out.println(ex.y);
      // System.out.println(y);  private ����ص� y��� �ٷ� ���Ұ���.
      
      
      
      
      ex1.x=3000;
      ex1.y=4000;
      
      System.out.println(x);
      System.out.println(ex.x);  //static �� �ٰ��� �����̱� !
      System.out.println(ex.y); 
      System.out.println(ex1.x);
      System.out.println(ex1.y); //y�� ���ο����̱�. 
	}
}
