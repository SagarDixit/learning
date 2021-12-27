package testJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testdiv.class, testmul.class, testsub.class, testsum.class })
public class AllTests {

}
