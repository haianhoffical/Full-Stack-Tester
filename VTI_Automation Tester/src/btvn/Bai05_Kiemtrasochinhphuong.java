import java.util.Scanner; // Nạp thư viện Scanner

public class Bai05_Kiemtrasochinhphuong { // Class chính

  // Hàm kiểm tra x có phải là số chính phương hay không
  // Số chính phương là số bằng bình phương của một số nguyên nào đó (vd: 4=2^2, 9=3^2)
  public static boolean isSoChinhPhuong(int x) {
    int can = (int) Math.sqrt(x); // Lấy căn bậc hai của x rồi ép kiểu về số nguyên (làm tròn xuống)
    // Nếu can*can bằng đúng x thì x là số chính phương
    return (can * can == x); // Trả về true nếu đúng, false nếu sai
  }

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen duong x: "); // Yêu cầu nhập x
    int x = sc.nextInt(); // Đọc giá trị x
    if (isSoChinhPhuong(x)) { // Gọi hàm kiểm tra
      System.out.println(x + " la so chinh phuong."); // Nếu đúng, thông báo là số chính phương
    } else {
      System.out.println(x + " khong phai la so chinh phuong."); // Nếu sai, thông báo không phải
    }
    sc.close(); // Đóng Scanner
  }
}
