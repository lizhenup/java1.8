public class fighting {
	public static int func(int num) {
			if(num>9) {
			
				return num%10 + func(num/10);
				
			}
			return num;
		}
	public static void main(String[] args) {
		int num =1729;
		System.out.println(num);
		
		/*int num = 10;
		public static int func(int num) {
			if(num==1) {
				return 1;
			}
			return num + func(num-1);
		}
		System.out.println(num);*/
		/*int num = 1;
		int sum = 0;
		public static int fun(int num); {
			if (num < 10) {
				sum +=num;
				num++;
				
			}
			System.out.println(sum);
		}*/
		/*
         public static void print(int num) {
		if (num > 9) {
			print(num/10);
			
		    }
			System.out.println(num%10);
			
        }*/
	}
}