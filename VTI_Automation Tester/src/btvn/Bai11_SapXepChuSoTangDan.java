import java.util.Scanner; // Nạp thư viện Scanner

public class Bai11_SapXepChuSoTangDan { // Class chính

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen n (3 chu so): "); // Yêu cầu nhập n
    int n = sc.nextInt(); // Đọc giá trị n
    int d1 = n / 100; // Lấy chữ số hàng trăm (chữ số thứ nhất)
    int d2 = (n / 10) % 10; // Lấy chữ số hàng chục (chữ số thứ hai)
    int d3 = n % 10; // Lấy chữ số hàng đơn vị (chữ số thứ ba)
    int temp; // Biến tạm dùng để hoán đổi (swap) giá trị giữa 2 biến
    // Sắp xếp 3 chữ số d1, d2, d3 tăng dần bằng thuật toán so sánh từng cặp (giống bubble sort)
    if (d1 > d2) { // Nếu d1 lớn hơn d2 thì hoán đổi để d1 <= d2
      temp = d1;
      d1 = d2;
      d2 = temp;
    }
    if (d2 > d3) { // Nếu d2 lớn hơn d3 thì hoán đổi để d2 <= d3
      temp = d2;
      d2 = d3;
      d3 = temp;
    }
    if (d1 > d2) { // Kiểm tra lại lần nữa vì sau bước trên d1 có thể lớn hơn d2
      temp = d1;
      d1 = d2;
      d2 = temp;
    }
    // Sau các bước trên: d1 <= d2 <= d3 (đã sắp xếp tăng dần)
    // Ghép lại thành số mới: d1 là hàng trăm, d2 la hang chuc, d3 la hang don vi
    int ketQua = d1 * 100 + d2 * 10 + d3; // Ghép các chữ số thành số nguyên mới
    System.out.println("So sau khi sap xep tang dan cac chu so: " + ketQua); // In kết quả
    sc.close(); // Đóng Scanner
  }
}
