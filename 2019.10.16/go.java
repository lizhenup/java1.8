//import java.util.Scanner;
//public class go {
	
	/*public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄 ：");
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("你是个少年哦！");
		}if(age >18 && age<56) {
			System.out.println("你是个中年人哦！");
		}if(age >56 ) {
			System.out.println("你是个老年人哦！");
		}
			
		sc.close();*/
		/*public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入正整数 ：");
		int num = sc.nextInt();
		if(num<2) {
			System.out.println("这个数不是素数");
		}else if(num%2==0) {
			System.out.println("这个数不是素数");
		}else {
			for(int i = 2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println("这个数不是素数");
					break;
				}else {
					System.out.println("这个数是素数");
					break;
				}
			}
		}
		sc.close();	*/
/*import java.util.Scanner;
public class go {		
		public static void main(String args[]) {
		    int j;
	        for(int i = 2;i<=100;i++) {
				   
       
            j = 2;
            while (i % j != 0) {
                j++; 
            }
            if (j == i) 
            {
                System.out.println("i="+ i); 
            }
        }
    }
 
}*/
/*for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i +"=" +(i*j)+"\t");
			}
			System.out.println();
		}99乘法口诀表*/
		/*for(int year=1000;year<=2000;year++) {
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				System.out.println("year="+ year);
			}
		}计算1000-2000的闰年*/
		/*public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字 ：");
		int m = sc.nextInt();
		System.out.println("请输入第二个数字 ：");
		int n = sc.nextInt();
        if(m<n){
        m = m+n;
        n = m-n;
        m = m-n;
        }
         while(m%n!=0){
         int t = m%n ;
         m = n;
         n = t;
        }
        System.out.println("m、n的最大公约数为"+n);

		*/
		/*public static void main(String args[]) {
		double 	i=-1.0;
		double 	tmp=0.0;
		double 	sum=0.0;
		for(double n=1.0;n<=100;n++) {
			i=-i;
			tmp=(1/n)*i;
			sum=sum+tmp;
		}
		System.out.println("sum="+sum);*/
		/*int num = 0;
        int count = 0;
        for (num = 1; num <= 100; num++) {
            
            if (num % 10 == 9) {
                count++;
            } 
            
            if (num / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);*/
		 /*int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i <= 999; i++){
         a = i % 10;
         b = i / 10 % 10;
         c = i / 100;
         if (i == a*a*a + b*b*b + c*c*c){
           System.out.println("i ="+ i);
         }
    }*/    
import java.util.Scanner;
public class go {	
     public static void main(String args[]) {	
        int passkey =125852;
		int count = 0;
        Scanner sc = new Scanner(System.in);
		int a = 0;
		while(count<=3)
			System.out.println("请输入密码 ：");		
             a = sc.nextInt();
         if(a==passkey) {
			 
			 count++;
			System.out.println("登陆成功"); 
			break;
		 }else {
			if (count < 3)
			{
				System.out.println("密码错误，请重新输入：");
				count++;
			}
			else
			{
				System.out.println("退出\n");
				break;
			}	
		   
		}	
    }
}