// Sample Test with parameter.
//@RunWith ,@Parameters,
// There seems to be issues as this is legacy version of junit 4.1.
// In old version, you don't have Parameterized.parameter annotation to indicate a class variable as parameter.
//Let do this in new project with junit5.

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class JunitEx_5 {

  int a;
  int b;
  int c;

    public JunitEx_5(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        int data[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        List dataList = Arrays.asList(data);
        return  dataList;
    }

    @Test
    public void sum(int a, int b, int c){
        int d = a + b + c ;
        System.out.println("Sum is "+ d );
    }
}
