class aaa{
	 int x=100;
	private char y='a';
	
	public void disp(){
		 System.out.println(y);
	}
}
public class Round10_Ex01 {
	public static void main(String[] ar){
	aaa ex=new aaa();
	System.out.println(ex.x);
//	System.out.println(ex.y); �ַ� private �� ���� class�� ���
	ex.disp();
	

}
}
