package vn.edu.vtiacademy.lesson2;

class AssignmentOperators {
  public static void main(String[] args) {
    int number = 10;
    // Khai báo biến number = 10

    int sum = 3;
    // Khai báo biến sum = 3

    // += : cộng rồi gán
    System.out.println(sum + " += " + number + " = " + (sum += number));
    // sum = sum + number → 3 + 10 = 13 → sum = 13

    // -= : trừ rồi gán
    System.out.println(sum + " -= " + number + " = " + (sum -= number));
    // sum = sum - number → 13 - 10 = 3 → sum = 3

    // *= : nhân rồi gán
    System.out.println(sum + " *= " + number + " = " + (sum *= number));
    // sum = sum * number → 3 * 10 = 30 → sum = 30

    // /= : chia rồi gán (chia lấy phần nguyên)
    System.out.println(sum + " /= " + number + " = " + (sum /= number));
    // sum = sum / number → 30 / 10 = 3 → sum = 3

    // %= : chia lấy dư rồi gán
    System.out.println(sum + " %= " + number + " = " + (sum %= number));
    // sum = sum % number → 3 % 10 = 3 → sum = 3

    int secondNumber = sum + number;
    // Khai báo biến secondNumber = sum + number → 3 + 10 = 13
  }
}

