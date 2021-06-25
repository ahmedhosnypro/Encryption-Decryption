// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    // put your code here
  }
}



class CallbacksExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    Divider.divide(a, b, new Callback() { // passing callback as an argument

      @Override
      public void calculated(int result) {
        String textToPrint = String.format("%d / %d is %d", a, b, result);
        print(textToPrint);
      }

      @Override
      public void failed(String errorMsg) {
        print(errorMsg);
      }
    });
  }

  public static void print(String text) {
    System.out.println(text);
  }
}

class Divider {

  /**
   * Divide a by b. It executes the specified callback to process results
   */
  public static void divide(int a, int b, Callback callback) {

    if (b == 0) {
      callback.failed("Division by zero!");
      return;
    }

    callback.calculated(a / b);
  }
}

interface Callback {

  /**
   * Takes a result and processes it
   */
  void calculated(int result);

  /**
   * Takes an error message
   */
  void failed(String errorMsg);
}

