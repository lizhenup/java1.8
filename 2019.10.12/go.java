public class go {

	public static void main(String[] args) {
	
	
	System.out.println(func(10));
	}
	public static int func(int num) {
		int f1=1;
	    int f2=2;
	    int f3=1;
		if(num>2) {
			for(int i=3;i<=num;i++) {
			
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			}
			return num=f3;
		}
		return num;
		
	} 
}