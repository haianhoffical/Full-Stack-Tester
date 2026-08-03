import java.util.Scanner; // Nạp thư viện Scanner

public class Bai10_ViTriChuSoLonNhat { // Class chính

  public static void main(String[] args) { // Hàm main
    Scanner sc = new Scanner(System.in); // Tạo Scanner đọc input
    System.out.print("Nhap so nguyen n (3 chu so): "); // Yêu cầu nhập n
    int n = sc.nextInt(); // Đọc giá trị n
    int hangTram = n / 100; // Lấy chữ số hàng trăm bằng cách chia nguyên cho 100
    int hangChuc = (n / 10) % 10; // Lấy chữ số hàng chục: chia cho 10 rồi lấy dư cho 10
    int hangDonVi = n % 10; // Lấy chữ số hàng đơn vị bằng phép chia lấy dư cho 10
    // Tìm giá trị lớn nhất trong 3 chữ số bằng cách so sánh dần
    int max = hangTram; // Giả sử hàng trăm là lớn nhất
    String viTri = "hang tram"; // Biến lưu tên vị trí tương ứng với max
    if (hangChuc > max) { // Nếu hàng chục lớn hơn max hiện tại
      max = hangChuc; // Cập nhật max
      viTri = "hang chuc"; // Cập nhật vị trí tương ứng
    }
    if (hangDonVi > max) { // Nếu hàng đơn vị lớn hơn max hiện tại
      max = hangDonVi; // Cập nhật max
      viTri = "hang don vi"; // Cập nhật vị trí tương ứng
    }
    // In kết quả: chữ số lớn nhất là max, nằm ở vị trí viTri
    System.out.println("Chu so lon nhat la " + max + ", nam o " + viTri + "."); // In kết quả
    sc.close(); // Đóng Scanner
  }
}
