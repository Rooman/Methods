public class Methods {
    public static void main(String[] args) {
       testMax();
       testToCharArray();
    }

    static void testToCharArray(){
         int[] array = {65, 66, 67};
         char[] expected = {'A', 'B', 'C'};

         char[] actual = toCharArray(array);

         assertArrayEquals("#2" ,expected, actual);
    }

    static void assertArrayEquals(String testId, char[] expected,
                                        char[] actual) {
        boolean isEqual = false;
        if(expected.length == actual.length) {
            isEqual = true;
            for(int i = 0; i < expected.length; i++) {
                if(expected[i] != actual[i]){
                    isEqual = false;
                    break;
                }
            }
        }

        if(isEqual) {
              System.out.println("TEST " +testId+" PASSED!");
         } else {
            System.out.print("TEST " + testId + " FAILED!");
            System.out.print("Expected: " + toString(expected));
            System.out.println(", actual: " + toString(actual));
         }

    }

    static String toString(char[] array){
        return new String(array);
    }

    static void testMax(){
        int expected = 7;
        int actual = max(5,7);
        assertEquals("#1", expected, actual);
    }

    static void assertEquals(String testId, int expected, int actual) {
        if(expected == actual) {
            System.out.println("TEST " +testId+" PASSED!");
        } else{
            System.out.println("TEST " +testId+" FAILED! Expected: " 
                + expected + ", actual: " + actual);
        }
    }

    public static char[] toCharArray(int[] array) {//2
        char[] charArray = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            charArray[i] = (char) array[i];
        }
        return charArray;
    }

    public static int max(int a, int b) {//3
        return a > b ?  a : b;
    }

   
}