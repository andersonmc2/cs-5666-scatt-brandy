package scatt.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import scatt.test.app.TestBasicApp1;
import scatt.test.gui.TestBasicGui1;

@RunWith(Suite.class)
@SuiteClasses({ TestBasicApp1.class, TestBasicGui1.class })
public class AllTests {

}
