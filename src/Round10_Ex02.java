
public class Round10_Ex02 {
	private static int x=100;
	private int y=10;
	
	public static void main(String ar[]){
		System.out.println(x);
		// static 이 아니라서 error   System.out.println(y);
		Round10_Ex02 ex=new Round10_Ex02();
		Round10_Ex02 ex1=new Round10_Ex02();
		System.out.println(x);
		
		System.out.println(ex.y);
		System.out.println(ex.x);
		
		ex.x=123;
		System.out.println(ex.x);
		System.out.println(x);     //같은 static은 바로사용가능. 
      ex.y=321;

      System.out.println(ex.y);
      // System.out.println(y);  private 라고해도 y라고 바로 사용불가능.
      
      
      
      
      ex1.x=3000;
      ex1.y=4000;
      
      System.out.println(x);
      System.out.println(ex.x);  //static 은 다같이 움직이군 !
      System.out.println(ex.y); 
      System.out.println(ex1.x);
      System.out.println(ex1.y); //y는 따로움직이군. 
	}
}
