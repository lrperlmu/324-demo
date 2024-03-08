import java.lang.*

public class tester{
    public static int adder(int a, int b){
        return (a + b);
    }
    
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = tester(a,b);

    }

    @Test
    public void testAdd() {
        assertEquals(5, tester(2,3))
    }
    @Test
    public void testFalse(){
        assertEquals(6, tester(2,3))
    }
    
}   
}