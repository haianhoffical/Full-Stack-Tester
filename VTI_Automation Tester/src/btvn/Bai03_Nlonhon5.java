package btvn;

import java.util.Scanner; // Nạp thư viện Scanner

public class Bai03_Nlonhon5 {

  // Hàm xuLy nhận vào số nguyên n, trả về kết quả theo yêu cầu đề bài
  public static int xuLy(int n) { // Khai báo hàm trả về kiểu int, tham số n
    if (n > 5) { // Nếu n lớn hơn 5
      n = n + 2; // Tăng n thêm 2 đơn vị
      return n; // Trả về giá trị n mới
    } else { // Ngược lại, nếu n <= 5
      return 0; // Trả về giá trị 0
    }
  }

  public static void main(String[] args) { // Hàm main - nơi chương trình bắt đầu chạy
    Scanner sc = new Scanner(System.in); // Tạo Scanner để đọc dữ liệu nhập
    System.out.print("Nhap so nguyen n: "); // Yêu cầu nhập n
    int n = sc.nextInt(); // Đọc giá trị n
    int ketQua = xuLy(n); // Gọi hàm xuLy và lưu kết quả trả về vào biến ketQua
    System.out.println("Ket qua tra ve: " + ketQua); // In kết quả ra màn hình
    sc.close(); // Đóng Scanner
  }
}
