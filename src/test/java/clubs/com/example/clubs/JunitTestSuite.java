package clubs.com.example.clubs;

import clubs.com.example.clubs.unit.GeneralTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   GeneralTest.class
})

public class JunitTestSuite {
}