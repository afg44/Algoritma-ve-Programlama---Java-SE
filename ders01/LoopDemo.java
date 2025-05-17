package ders01;

public class LoopDemo {

	public static void main(String[] args) {
		int i = 10;
		for( i=0; i < 10; i++){
			System.out.println(i);
		}
		System.out.println(i);
		
		i = 0;
		while(true) {
			i--;
			System.out.println(i);
			if(i < -10)
				break;
		}
	
		int[] arr = {10,20,30,40,50};
		for(int ii : arr) {
			System.out.println(ii);
		}
		
		for (int j = 0; j < 10; j++) {
			if (j % 2 == 0)
				continue;
			System.out.println(j);
		}
		System.out.println("------------------------");
		int x = 2;
		do {
			x++;
			System.out.println("Dongü " + x);
		} while(x < 3);
	}
}
