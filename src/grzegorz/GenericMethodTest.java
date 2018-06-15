package grzegorz;

public class GenericMethodTest {
    public static < E > void printArray( E[] inputArray ) {
    	for(E element: inputArray) {
    		System.out.printf("%s", element);
    	}
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer[] intArray = { 1, 2,3, 4, 5};
      Double[] doubleArray = {1.1, 2.2 , 3.3 , 4.4 };
      Character[] charArray = { 'H', 'E','L','L','O'};
      System.out.println("Array Integer print");
      printArray(intArray);
      System.out.println("\n");      System.out.println("Array Integer Double");
      printArray(doubleArray);
      System.out.println("\n"); 
      System.out.println("Array Integer Character");
      printArray(charArray);




	}

}
