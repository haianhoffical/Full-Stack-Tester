import java.util.Scanner;
// Import lớp Scanner để nhập dữ liệu từ bàn phím

public class RelationalOperators {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Tạo đối tượng Scanner để đọc dữ liệu từ console

    System.out.println("Enter first number: ");
    int a = scanner.nextInt();
    // Nhập số nguyên thứ nhất

    System.out.println("Enter second number: ");
    int b = scanner.nextInt();
    // Nhập số nguyên thứ hai

    // Greater than (lớn hơn)
    System.out.println("a > b = " + a + " > " + b + " = " + (a > b));
    // Toán tử > trả về true nếu a lớn hơn b, ngược lại false

    // Less than (nhỏ hơn)
    System.out.println("a < b = " + a + " < " + b + " = " + (a < b));
    // Toán tử < trả về true nếu a nhỏ hơn b

    // Greater than or equal to (lớn hơn hoặc bằng)
    System.out.println("a >= b = " + a + " >= " + b + " = " + (a >= b));
    // Toán tử >= trả về true nếu a lớn hơn hoặc bằng b

    // Less than or equal to (nhỏ hơn hoặc bằng)
    System.out.println("a <= b = " + a + " <= " + b + " = " + (a <= b));
    // Toán tử <= trả về true nếu a nhỏ hơn hoặc bằng b

    // Equal to (bằng nhau)
    System.out.println("a == b = " + a + " == " + b + " = " + (a == b));
    // Toán tử == trả về true nếu a bằng b

    // Not equal to (khác nhau)
    System.out.println("a != b = " + a + " != " + b + " = " + (a != b));
    // Toán tử != trả về true nếu a khác b
  }
}
