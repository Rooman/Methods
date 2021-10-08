public class Methods {
    public static void main(String[] args) {
       testMax();
       testToCharArray();
       testHasDuplicatesWhenDuplicatesOccurs();
       testHasDuplicatesWhenNoDuplicatesInArray();
    }

    static void testHasDuplicatesWhenDuplicatesOccurs(){
        byte[] array = {10, 15, 17, 100, 15};
        boolean actual = hasDuplicates(array);
        assertEquals("#3", true, actual);
    }

    static void testHasDuplicatesWhenNoDuplicatesInArray(){
        byte[] array = {10, 15, 17, 100};
        boolean actual = hasDuplicates(array);
        assertEquals("#4", false, actual);
    }

    // bytes in array [0, 127]
    // {1, 2, 1} => hasDuplicates [ false, true, true, ...]
    static boolean hasDuplicates (byte[] array){
        boolean [] hasDuplicates = new boolean[128];
        for(byte value : array){ // value = 1
            if(hasDuplicates[value]){ 
                return true;
            } else {
                hasDuplicates[value] = true;
            }
        }

        return false;
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

    static void assertEquals(String testId, boolean expected, boolean actual) {
        if(expected == actual) {
            System.out.println("TEST " +testId+" PASSED!");
        } else{
            System.out.println("TEST " +testId+" FAILED! Expected: " 
                + expected + ", actual: " + actual);
        }
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