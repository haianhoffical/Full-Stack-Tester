package btvn;

import java.util.Scanner; // Nạp thư viện Scanner để đọc dữ liệu từ bàn phím

public class Bai02_NhapNGapDoiNeuChan {

  public static void main(String[] args) { // Điểm bắt đầu chương trình
    Scanner sc = new Scanner(System.in); // Tạo đối tượng đọc input

    System.out.print("Nhap so nguyen n: "); // Yêu cầu người dùng nhập n
    int n = sc.nextInt(); // Đọc số nguyên n từ bàn phím

    if (n % 2 == 0) { // Kiểm tra n có chia hết cho 2 không (số chẵn)
      n = n * 2; // Nếu chẵn thì gấp đôi giá trị n
    }
    // Nếu n lẻ thì không làm gì cả, giữ nguyên giá trị n
    System.out.println("Gia tri n sau khi xu ly: " + n); // In kết quả cuối cùng ra màn hình
    sc.close(); // Đóng Scanner
  }
}
