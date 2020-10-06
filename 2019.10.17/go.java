/*import java.util.Scanner;
public class go {
	public static void main(String args[]) {
		int passkey =123033;
		System.out.println("欢迎来到用户登入系统，请输入密码，您将有三次机会:");
        for(int i=0;i<3;i++) {
            System.out.println("请输入密码:");
            Scanner in=new Scanner(System.in);
            String password=in.next();
            if(password.equals("123033")) {
                System.out.println("登入成功");
                break;
            }
            else {
                System.out.println("密码错误，重新输入，你还有"+(2-i)+"次机会");
            }
        }

    }
}*/
/*public class go {
		
   public static int Test(int num){
       int count=0;
        while(num>0){
            if((num & 1) ==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int i=666;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Test(i));
    }

}*/
/*public class go {
    public static void main(String[] args) {
        int value = 11;
        int[] arr1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] arr2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int j=0;
        for(int i=0;i<32;i+=2){
            arr1[j]=(value>>i) & 1;
            j++;
        }
        j=0;
        for(int i=1;i<32;i+=2){
            arr2[j]=(value>>i) & 1;
            j++;
        }
        for(int i=15;i>=0;i--){
            System.out.print(arr1[i]);
        }
        System.out.println("");
        for(int i=15;i>=0;i--){
            System.out.print(arr2[i]);
        }
    }
}*/
/*public class go {
    public static void main(String[] args) {
		int x =func(8542);
		 
		System.out.println(x);
    }
	public static int func(int num) {
			if(num > 9) {
			func(num/10);
		    }
		System.out.print(num%10 + " ");
		return num;
	   }	
	
}*/
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class go {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Random rand = new Random();
		
		int randNum = rand.nextInt(100)+1;
		
		
		while(true) {
			System.out.println("输入你要猜的数字：");
			int num = scan.nextInt();
			
			if(num > randNum) {
				System.out.println("大了");
			}else if (num == randNum) {
				System.out.println("猜对了");
				break;
			}else {
				System.out.println("小了");
			}
		}
		scan.close();
	}
}
