package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  write("sivan",5,7);
		  
		  
	}
	
	

	public static void write(String str,int num,int len) {
		
		//char[] str1 = str;
		@SuppressWarnings("unused")
		int length  = str.length();
		int count = 1;
		int moshe = 0;
		int i =0;
		while(count<=num) {
			for(i=0;i<len;i++) {
				String str1 =  str;
				char[] str2 = str1.toCharArray();
				System.out.print(str2[moshe]);
				moshe++;
				if(moshe>=str.length()) {
					moshe =0;
					count++;
				}
				if(count>num) {
					break;
				}
				
			}
			System.out.print("\n");
			
			
		}
		
	}
	

}
