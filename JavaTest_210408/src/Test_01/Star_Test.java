package Test_01;

public class Star_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 5; i++) {

	        for (int j = 4; j > i; j--) { // i = 0 j = 4,3,2,1

	                                      // i = 1 j = 4,3,2

	                                      // i = 2 j = 4,3

	                                      // i = 3 j = 4

	                                      // i = 4 --> j는 4부터 시작하여 i보다 클때까지 - 시키는데 4는 j와 같으므로 제외

	            System.out.print(" ");

	        }

	        for (int k = 1; k <= i*2+1; k++) {//k는 1부터 시작

	            System.out.print("*"); //  i 가  0 -->0*2+1 1 1  =         1 

	                                    // i 가 1 -->1*2+1  3 3 <=       1,2,3

	                                    // i 가 2 -->2*2+1  5 5 <=     1,2,3,4,5

	                                    // i 가 3 -->3*2+1  7 7 <=   1,2,3,4,5,6,7

	                                    // i 가 4 -->4*2+1  9 9 <= 1,2,3,4,5,6,7,8,9

	                                    

	                                }

	        System.out.println();

	    }
	}

}
