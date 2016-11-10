import java.io.*;


public class Round10_N1 { 
	// 변수선언부
	private BufferedReader in;
	private int[] sub;
	private float avg;
	private String[] str;
	
	//변수 초기화
	
	public Round10_N1(){
		in= new BufferedReader(new InputStreamReader(System.in));
		sub=new int[4];
		str=new String[]{"국어","영어","수학"};
	}
		
		//입력
		public void IN() throws IOException{
		
			for(int a=0;a<str.length;a++){
				System.out.println(str[a]+"=");
				sub[a]=Integer.parseInt(in.readLine());
				sub[str.length]+=sub[a];
				
			}
			avg=sub[str.length]/(float)(str.length);
			
			
		}
		
		//출력
		public void disp(){
			System.out.println(sub[0]);
			System.out.println(sub[1]);
			System.out.println(sub[2]);
			System.out.println(sub[3]);
			System.out.println(avg);
		}
			
				public static void main(String ar[])throws IOException{
					Round10_N1 ex=new Round10_N1();
					ex.IN();
					ex.disp();
				}
		
		
		
		
		
		
	}





