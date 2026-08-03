import java.util.Scanner; // Nạp thư viện Scanner

public class Bai09_SapXepBaSoTangDan { // Class chính

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so a: "); // Yêu cầu nhập a
    double a = sc.nextDouble(); // Đọc giá trị a
    System.out.print("Nhap so b: "); // Yêu cầu nhập b
    double b = sc.nextDouble(); // Đọc giá trị b
    System.out.print("Nhap so c: "); // Yêu cầu nhập c
    double c = sc.nextDouble(); // Đọc giá trị c
    double temp; // Biến phụ thứ nhất, dùng để hoán đổi giá trị (swap)
    // (Chỉ dùng thêm 1 biến "temp" là đủ để hoán đổi, nhưng đề cho phép 2 nên ta dùng cho rõ ràng)
    if (a > b) { // So sánh a và b, nếu a lớn hơn b thì sai thứ tự tăng dần
      temp = a; // Lưu tạm giá trị a vào biến temp
      a = b; // Gán giá trị b cho a
      b = temp; // Gán giá trị đã lưu (a cũ) cho b => hoán đổi xong a và b
    }
    if (b > c) { // Sau bước trên, so sánh b và c
      temp = b; // Lưu tạm giá trị b vào temp
      b = c; // Gán c cho b
      c = temp; // Gán giá trị lưu tạm (b cũ) cho c => hoán đổi xong b và c
    }
    // Sau 2 lần hoán đổi trên, c chắc chắn là số lớn nhất,
    // nhưng a và b có thể vẫn chưa đúng thứ tự nên kiểm tra lại lần nữa
    if (a > b) { // So sánh lại a và b lần cuối
      temp = a; // Lưu tạm a
      a = b; // Gán b cho a
      b = temp; // Gán giá trị lưu tạm cho b
    }
    // Sau các bước trên: a <= b <= c
    System.out.println("Thu tu tang dan: " + a + ", " + b + ", " + c); // In kết quả
    sc.close(); // Đóng Scanner
  }
}
