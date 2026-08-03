import java.util.Scanner; // Nạp thư viện Scanner

public class Bai08_MaxBaSo { // Class chính

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so a: "); // Yêu cầu nhập a
    double a = sc.nextDouble(); // Đọc giá trị a (dùng double cho tổng quát)
    System.out.print("Nhap so b: "); // Yêu cầu nhập b
    double b = sc.nextDouble(); // Đọc giá trị b
    System.out.print("Nhap so c: "); // Yêu cầu nhập c
    double c = sc.nextDouble(); // Đọc giá trị c
    double max = a; // Giả sử ban đầu a là số lớn nhất, gán cho biến max
    if (b > max) { // So sánh b với max hiện tại
      max = b; // Nếu b lớn hơn thì cập nhật max = b
    }
    if (c > max) { // So sánh c với max hiện tại (đã có thể là a hoặc b)
      max = c; // Nếu c lớn hơn thì cập nhật max = c
    }
    System.out.println("Gia tri lon nhat trong 3 so la: " + max); // In kết quả
    sc.close(); // Đóng Scanner
  }
}
