//Make a suit of classes and run suit.
//@RunWith annotation to be used at the class level to indicate class needs to be treated as suit.

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitEx_1.class,
        JunitEx_2.class,
        JunitEx_3.class
})
public class JunitEx_4 {

}
