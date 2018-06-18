
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {

  @Test
	public void simpletest1()
{
   int a = 5;
   int b = 2 ;
   assertTrue(a + b==7);
}
  
  @Test
	public void simpletest2()
{
   int a = 3;
   int b = 4 ;
   assertTrue(a * b==12);
}
  
  @Test
 	public void simpletest3()
 {
    int a = 3;
    int b = 14 ;
    assertTrue(b - a ==11);
 }
  
  @Test
 	public void simpletest4()
 {
    int a = 12;
    int b = 4 ;
    assertTrue(a / b==3);
 }
  
  @Test
	public void simpletest5()
{
  int a = 2;
  int b = 3 ;
  assertTrue(a!=b);
}
  
  @Test
	public void simpletest6()
{
int a = 3;
int b = 3 ;
assertTrue(a==b);
}
  
}
