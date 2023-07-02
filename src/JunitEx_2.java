//Basic Junit Program 1.
// Added a junit 4 jar in project and added below program.
// install junit plugin and create configuraiton to run class as Junitclass.

import org.junit.Test;

public class JunitEx_2 {
     @Test
        public void sumTest(){
            int a = 5;
            int b = 3;
            int c = a + b;
            System.out.println("Hi "+c);
        }
    }

