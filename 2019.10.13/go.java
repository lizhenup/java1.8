public class go {
	public static void main(String[] args) {
		int a = 15;
		int b = 58;
		int c = 36;
		int max = 0;
		int min = 0;
		max = a;
		min = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
	System.out.println("max= "+max+",min= "+min);
		/*int a = 10;
		int b = 20;
		int tmp = 0 ;
		 tmp = a;
		 a = b;+
		 b = tmp;
		 
		
		//func(a,b);
		System.out.println("a =" +a);
		System.out.println("b =" +b);*/
	}
	/*
	public static void func (int[] arr) {	
	int temp = arr[0];
	arr[0] = arr[1];
	arr[1] = temp;
	}*/
}