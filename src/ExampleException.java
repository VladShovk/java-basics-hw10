public class ExampleException {
  public static int rectangleArea(int a, int b) {
    // TODO put your code here
    int calculatedArea = a * b;
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Input value is below zero!");
    }
    return calculatedArea;
  }
}


