import java.util.Scanner; // Nạp thư viện Scanner

public class Bai04_KiemTraSoNguyenTo { // Class chính

  // Hàm kiểm tra x có phải số nguyên tố hay không, trả về true/false
  public static boolean isPrime(int x) {
    if (x < 2) { // Số nguyên tố phải lớn hơn hoặc bằng 2
      return false; // Nhỏ hơn 2 thì không phải số nguyên tố
    }
    // Chỉ cần kiểm tra các ước từ 2 đến căn bậc hai của x là đủ
    for (int i = 2; i * i <= x; i++) { // Duyệt i từ 2, dừng khi i*i > x
      if (x % i == 0) { // Nếu x chia hết cho i (tìm thấy ước số khác 1 và x)
        return false; // x không phải số nguyên tố
      }
    }
    return true; // Không tìm thấy ước nào => x là số nguyên tố
  }

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen duong x: "); // Yêu cầu nhập x
    int x = sc.nextInt(); // Đọc giá trị x
    if (isPrime(x)) { // Gọi hàm kiểm tra, nếu trả về true
      System.out.println(x + " la so nguyen to."); // In ra là số nguyên tố
    } else { // Nếu trả về false
      System.out.println(x + " khong phai la so nguyen to."); // In ra không phải số nguyên tố
    }
    sc.close(); // Đóng Scanner
  }
}