public class testFactorial {
    public static void main(String[] args) {
        try {
            if(Factorial.compute(5) != 120) {
                throw new AssertionError("Test Failed for input 5");
            }
            if(Factorial.compute(0) != 1) {
                throw new AssertionError("Test Failed for input 1");
            }
            System.out.println("All tests passed");
        } catch(Exception e) {
            System.err.println("Test failed: "+e.getMessage());
        }
    }
}