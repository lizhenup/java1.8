import java.util.Scanner;
public class go {
	public static int func(int m ,int n) {
		int t = 0;
	    while(m%n!=0) {
         t = m%n ;
         m = n;
         n = t;
        }
		return t;
	}
	
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字 ：");
		int m = sc.nextInt();
		System.out.println("请输入第二个数字 ：");
		int n = sc.nextInt();
        func(m,n);
        System.out.println("m、n的最大公约数为 :"+t);
        sc.close();
	}
	
}









/*public static int func(int a,int b) {
        int tmp = 0;
        while(a%b!=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return tmp;
    }*/




		
/*public class go {
	public static int func(int n) {
       int count = 0;
        for (int num = 1; num <= n; num++) {
            
            if (num % 10 == 9) {
                count++;
            } 
            
            if (num / 10 == 9) {
                count++;
            }
			 
        }
		return count;
}
	public static void main(String args[]) {
    func(100);
	 System.out.println(count);	
	}
}*/