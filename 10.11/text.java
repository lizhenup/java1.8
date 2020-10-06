
public class text {
	public static void main(String[] args) {
		int num = 5;
		int ret = 1;
		int sum = 0;[2S	22GGGGG 5R
		for(int i = 1;i<=num;++i) {
			ret = 1;
			for(int j = 1;j<=i;j++) {
			ret *=j;
			
			}
			sum += ret;
			
		}
		System.out.println("sum=" + sum);
		
	/*public static void main1(String[] args) {
		for(int i = 1;i<=100;++i) {
			if(i%2==0) {
				int sumEve = 0;
				sumEve += i;
				System.out.println("sumEve ="+sumEve);
			}
			else {
				int sumOdd = 0;
				sumOdd += i;
				Syetem.out.println("sumOdd="+sumOdd);
			}
		}
	}
		*/	
	}
	

}