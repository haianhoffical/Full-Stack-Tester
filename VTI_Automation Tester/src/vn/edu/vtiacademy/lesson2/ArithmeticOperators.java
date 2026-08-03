package vn.edu.vtiacademy.lesson2;
// Khai báo package: phải trùng với thư mục chứa file này

import java.util.Scanner;
// Import lớp Scanner để đọc dữ liệu từ bàn phím (console)

public class ArithmeticOperators {
  public static void main(String[] args) {
    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = scanner.nextInt();
    // Đọc số nguyên từ bàn phím và gán cho biến a

    System.out.println("Enter second number: ");
    int b = scanner.nextInt();
    // Đọc số nguyên từ bàn phím và gán cho biến b

    // Addition (cộng)
    int sum = a + b;
    System.out.println("a + b = " + a + " + " + b + " = " + sum);

    // Subtraction (trừ)
    int sub = a - b;
    System.out.println("a - b = " + a + " - " + b + " = " + sub);

    // Multiplication (nhân)
    int mul = a * b;
    System.out.println("a * b = " + a + " * " + b + " = " + mul);

    // Division (chia lấy phần nguyên)
    int div = a / b;
    // Dùng toán tử / để chia a cho b, kết quả là số nguyên (bỏ phần dư)
    System.out.println("a / b = " + a + " / " + b + " = " + div);

    // Modulus (chia lấy dư)
    int remainder = a % b;
    // Dùng toán tử % để lấy phần dư khi chia a cho b
    System.out.println("a % b = " + a + " % " + b + " = " + remainder);

    // In giá trị trước khi tăng
    System.out.println("Before incrementing, a = " + a);

    // Prefix increment (++a): tăng trước rồi mới dùng
    System.out.println("After incrementing, a = " + (++a));
    // a tăng thêm 1, rồi in ra giá trị mới
    System.out.println("Current a = " + a);

    // Tăng thêm lần nữa
    System.out.println("After incrementing again, a = " + (++a));
    System.out.println("Current a = " + a);

    // Prefix decrement (--a): giảm trước rồi mới dùng
    System.out.println("After decrementing, a = " + (--a));
    System.out.println("Current a = " + a);

    // Giảm thêm lần nữa
    System.out.println("After decrementing again, a = " + (--a));
    System.out.println("Current a = " + a);
  }
}
