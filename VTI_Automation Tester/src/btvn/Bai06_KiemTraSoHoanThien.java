import java.util.Scanner; // Nạp thư viện Scanner

public class Bai06_KiemTraSoHoanThien { // Class chính

  // Hàm kiểm tra x có phải là số hoàn thiện hay không
  // Số hoàn thiện: tổng các ước số của nó (không kể chính nó) bằng chính nó. Vd: 6 = 1+2+3
  public static boolean isSoHoanThien(int x) {
    int tongUoc = 0; // Biến lưu tổng các ước số, khởi tạo bằng 0

    for (int i = 1; i < x; i++) { // Duyệt i từ 1 đến x-1 (không lấy chính x)
      if (x % i == 0) { // Nếu x chia hết cho i, tức i là ước số của x
        tongUoc = tongUoc + i; // Cộng dồn ước số i vào tổng
      }
    }
    return (tongUoc == x); // Trả về true nếu tổng ước số bằng chính x
  }

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen duong x: "); // Yêu cầu nhập x
    int x = sc.nextInt(); // Đọc giá trị x
    if (isSoHoanThien(x)) { // Gọi hàm kiểm tra
      System.out.println(x + " la so hoan thien."); // Nếu đúng, thông báo là số hoàn thiện
    } else {
      System.out.println(x + " khong phai la so hoan thien."); // Nếu sai, thông báo không phải
    }
    sc.close(); // Đóng Scanner
  }
}
