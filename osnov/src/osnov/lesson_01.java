package osnov;

public class lesson_01 {

public static void main(String[] args) {
		
		
		//1
		
		int a = 1;
		byte b = 2;
		short c = 1;
		long d = 2l;
		
		double e = 1.2;
		float f = 2.1F;
		
		boolean g = true;
		char m = 'a';
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("m = " + m);
	
		//2
		
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Boolean = " + Boolean.TRUE);
		System.out.println("Boolean = " + Boolean.FALSE);
		System.out.println("Character = " + Character.BYTES);

		
		//3
		
		int [] array = new int [10];
				array [0] = 1;
				array [1] = 2;
				array [2] = 3;
				array [3] = 4;
				array [4] = 5;
				array [5] = 6;
				array [6] = 7;
				array [7] = 8;
				array [8] = 9;
				array [9] = 10;
				
				int IndexOfMax = 0;
				int IndexOfMin = 0;
				
				for (int i = 0; i < array.length; i++)
				{
					if (array[i] > array[IndexOfMax])
					{
						IndexOfMax = i;
					}
					
					else if (array[i] < array[IndexOfMin])
					{
						IndexOfMin = i;
					}
					
				}
				System.out.println(IndexOfMax + " " + IndexOfMin);
				System.out.println("IndexOfMax = " + IndexOfMax);
				System.out.println("IndexOfMin = " + IndexOfMin);
		
	
		
		
		
	}

}
