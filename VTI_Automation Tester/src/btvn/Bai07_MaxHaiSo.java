import java.util.Scanner; // Nạp thư viện Scanner

public class Bai07_MaxHaiSo { // Class chính

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen a: "); // Yêu cầu nhập a
    int a = sc.nextInt(); // Đọc giá trị a
    System.out.print("Nhap so nguyen b: "); // Yêu cầu nhập b
    int b = sc.nextInt(); // Đọc giá trị b
    int max; // Khai báo biến max để lưu giá trị lớn nhất
    if (a > b) { // So sánh a với b
      max = a; // Nếu a lớn hơn thì max = a
    } else { // Ngược lại (b >= a)
      max = b; // max = b
    }
    System.out.println("Gia tri lon nhat la: " + max); // In kết quả ra màn hình
    sc.close(); // Đóng Scanner
  }
}
