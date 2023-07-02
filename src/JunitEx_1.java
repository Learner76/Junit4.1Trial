//Basic Junit Program 2.
// Use Fixtures.
//Note method called only once are static, methods called multiple time are not static.

import org.junit.*;


public class JunitEx_1 {

    @BeforeClass
    public static void classstarted(){
        System.out.println("Test bed is getting ready.");
    }

    @AfterClass
    public static void classover(){
        System.out.println("Test bed is destroyed.");
    }

    @Before
    public void testReady(){
        System.out.println("Test is getting ready.");
    }


    @After
    public void testOver(){
        System.out.println("Test is tearing down.");
    }

    @Test
    public void sumTest1(){
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println("Test 1 outcome" + c);
    }

    @Test
    public void sumTest2(){
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println("Test 2 outcome" + c);
    }

    @Test @Ignore
    public void sumTest3(){
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println("Test 3 outcome" + c);
    }
}

