package lesson1;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
			
			// "10" => 0x3130 => 10
			try {
			
			Integer j = Integer.parseInt(args[0]);
			Integer k = Integer.parseInt(args[1]);

			System.out.println("J = " + j);
			System.out.println("k = " + k);
			System.out.println("Sum =" + (j + k));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error!");
			
		}
		} //end of for
			
			boolean bTrue = true;
//          for(;bTrue;) {}
			while(bTrue) {
				System.out.println("hello");
				bTrue=false;
						
			}
		int n = 6;
		do {
			
			n++;
			switch (n){
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
				
				default:
					System.out.println("Other");
					break;
			}
		
			System.err.println("hello from do");
				
			}while (bTrue);
								
		System.out.println("End");
}// end of main 
			
}// end of class

