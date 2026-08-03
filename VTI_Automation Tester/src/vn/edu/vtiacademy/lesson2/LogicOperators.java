package vn.edu.vtiacademy.lesson02;
// Khai báo package: phải trùng với thư mục chứa file này

public class LogicOperators {
  public static void main(String[] args) {
    // Khai báo hai biến boolean
    boolean trueFlag = true;   // biến này luôn mang giá trị true
    boolean falseFlag = false; // biến này luôn mang giá trị false

    // Toán tử AND (&&): chỉ trả về true khi cả hai vế đều true
    System.out.println(trueFlag + " && " + falseFlag + " = " + (trueFlag && falseFlag));
    // true && false → false

    // Toán tử OR (||): trả về true nếu ít nhất một vế là true
    System.out.println(trueFlag + " || " + falseFlag + " = " + (trueFlag || falseFlag));
    // true || false → true

    // Toán tử NOT (!): đảo ngược giá trị boolean
    System.out.println("!" + trueFlag + " = " + (!trueFlag));
    // !true → false
    System.out.println("!" + falseFlag + " = " + (!falseFlag));
    // !false → true

    int age = 4;
    // Khai báo biến age kiểu số nguyên, gán giá trị 4 (khách hàng 4 tuổi)

    boolean hasTicket = true;
    // Khai báo biến hasTicket kiểu boolean, gán giá trị true (khách hàng có vé)

    boolean validCustomer = (age >= 8 && hasTicket);
    // Đây là biểu thức logic:
    // - age >= 8: kiểm tra xem tuổi có lớn hơn hoặc bằng 8 không → với age = 4 thì sai (false)
    // - hasTicket: giá trị là true
    // - && (AND): chỉ trả về true nếu cả hai điều kiện đều đúng
    // => false && true = false
    // Kết quả: validCustomer = false

    System.out.println("Valid customer: " + validCustomer);
    // In ra màn hình: "Valid customer: false"

  }
}
