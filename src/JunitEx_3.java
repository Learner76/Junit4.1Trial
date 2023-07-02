//Use of Assert

import org.junit.Assert;
import org.junit.Test;


public class JunitEx_3 {

        @Test
        public void sumTest() {
            int a = 5;
            int b = 3;
            int c = a + b;
            System.out.println("Hi " + c);
            Assert.assertEquals("Test Failed",7,c);
        }
    }
