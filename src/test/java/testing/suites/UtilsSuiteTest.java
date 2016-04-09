package testing.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testing.MathUtilsTest;
import testing.NameUtilsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({MathUtilsTest.class, NameUtilsTest.class})
public class UtilsSuiteTest {
}
