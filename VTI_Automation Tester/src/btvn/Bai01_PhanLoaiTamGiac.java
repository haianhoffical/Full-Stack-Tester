package btvn;

import java.util.Scanner; // Nạp thư viện Scanner để đọc dữ liệu người dùng nhập từ bàn phím

public class Bai01_PhanLoaiTamGiac { // Khai báo class chính, tên phải trùng tên file

  public static void main(String[] args) { // Hàm main - điểm bắt đầu chạy chương trình
    Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc input từ console
    System.out.print("Nhap canh a: "); // In thông báo yêu cầu nhập cạnh a
    double a = sc.nextDouble(); // Đọc giá trị cạnh a (kiểu double để nhận số thực)

    System.out.print("Nhap canh b: "); // In thông báo yêu cầu nhập cạnh b
    double b = sc.nextDouble(); // Đọc giá trị cạnh b

    System.out.print("Nhap canh c: "); // In thông báo yêu cầu nhập cạnh c
    double c = sc.nextDouble(); // Đọc giá trị cạnh c

    // Điều kiện để 3 cạnh tạo thành 1 tam giác hợp lệ:
    // tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại
    boolean hopLe = (a + b > c) && (a + c > b) && (b + c > a);

    if (!hopLe) { // Nếu không thỏa điều kiện tam giác hợp lệ
      System.out.println("Ba canh nhap vao khong tao thanh mot tam giac!"); // Thông báo lỗi
    } else { // Nếu 3 cạnh hợp lệ, tiến hành phân loại

      // Kiểm tra tam giác có vuông hay không bằng định lý Pythagoras
      // Vì là số thực nên ta so sánh với một sai số nhỏ (epsilon) để tránh lỗi làm tròn
      double epsilon = 0.0001; // Sai số cho phép khi so sánh số thực

      boolean vuong = Math.abs(a * a - (b * b + c * c)) < epsilon; // Biến đánh dấu tam giác có vuông hay không, mặc định là false

      // Kiểm tra cả 3 trường hợp cạnh nào là cạnh huyền (cạnh lớn nhất)
      // a là cạnh huyền
      if (Math.abs(b * b - (a * a + c * c)) < epsilon) {
        vuong = true; // b là cạnh huyền
      }
      if (Math.abs(c * c - (a * a + b * b)) < epsilon) {
        vuong = true; // c là cạnh huyền
      }

      // Kiểm tra tam giác có cân hay không (có ít nhất 2 cạnh bằng nhau)
      boolean can = (a == b) || (b == c) || (a == c);

      // Kiểm tra tam giác có đều hay không (cả 3 cạnh bằng nhau)
      boolean deu = (a == b) && (b == c);

      // Bắt đầu xét và in kết quả phân loại theo thứ tự ưu tiên
      if (deu) { // Nếu cả 3 cạnh bằng nhau
        System.out.println("Day la tam giac DEU."); // In ra tam giác đều
      } else if (vuong && can) { // Nếu vừa vuông vừa cân
        System.out.println("Day la tam giac VUONG CAN."); // In ra tam giác vuông cân
      } else if (vuong) { // Nếu chỉ vuông (không cân)
        System.out.println("Day la tam giac VUONG."); // In ra tam giác vuông
      } else if (can) { // Nếu chỉ cân (không vuông)
        System.out.println("Day la tam giac CAN."); // In ra tam giác cân
      } else { // Không rơi vào trường hợp đặc biệt nào
        System.out.println("Day la tam giac THUONG."); // In ra tam giác thường
      }
    }

    sc.close(); // Đóng Scanner để giải phóng tài nguyên
  }
}