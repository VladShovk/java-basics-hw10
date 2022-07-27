import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        // TODO add 2 more test data here
        {0, 4, 0},
        {8, 5, 40}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        // TODO add 2 more test data here
        {-18, -4},
        {1, -5}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    // TODO put your code here
    assertEquals(ExampleException.rectangleArea(a, b), c);
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {
    // TODO put your code here
    try {
      ExampleException.rectangleArea(a, b);
    }
    catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Input value is below zero!");
    }
  }
}