import java.util.Scanner; // Nạp thư viện Scanner

public class Bai12_KiemTraNgayThangNamHopLe { // Class chính

  // Hàm kiểm tra năm nhuận, trả về true nếu nam la nam nhuan
  // Quy tắc năm nhuận: chia hết cho 4 và (khong chia het cho 100 hoac chia het cho 400)
  public static boolean isNamNhuan(int nam) {
    return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0); // Áp dụng công thức năm nhuận
  }

  // Hàm kiểm tra ngay, thang, nam co hop le hay khong
  public static boolean isNgayHopLe(int ngay, int thang, int nam) {
    if (nam < 1) { // Năm phải là số dương
      return false; // Năm không hợp lệ
    }
    if (thang < 1 || thang > 12) { // Tháng phải nằm trong khoảng 1 den 12
      return false; // Tháng không hợp lệ
    }
    if (ngay < 1) { // Ngày phải lớn hơn hoặc bằng 1
      return false; // Ngày không hợp lệ
    }
    int soNgayToiDa; // Biến lưu số ngày tối đa của tháng đó
    // Xác định số ngày tối đa dựa vào tháng
    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) { // Cac thang co 30 ngay
      soNgayToiDa = 30; // Gan so ngay toi da la 30
    } else if (thang == 2) { // Rieng thang 2
      if (isNamNhuan(nam)) { // Neu la nam nhuan
        soNgayToiDa = 29; // Thang 2 nam nhuan co 29 ngay
      } else { // Neu khong phai nam nhuan
        soNgayToiDa = 28; // Thang 2 nam thuong co 28 ngay
      }
    } else { // Cac thang con lai (1,3,5,7,8,10,12) co 31 ngay
      soNgayToiDa = 31; // Gan so ngay toi da la 31
    }
    return (ngay <= soNgayToiDa); // Ngay hop le neu khong vuot qua so ngay toi da cua thang
  }

  public static void main(String[] args) { // Ham main
    Scanner sc = new Scanner(System.in); // Tao Scanner doc input
    System.out.print("Nhap ngay: "); // Yeu cau nhap ngay
    int ngay = sc.nextInt(); // Doc gia tri ngay
    System.out.print("Nhap thang: "); // Yeu cau nhap thang
    int thang = sc.nextInt(); // Doc gia tri thang
    System.out.print("Nhap nam: "); // Yeu cau nhap nam
    int nam = sc.nextInt(); // Doc gia tri nam
    if (isNgayHopLe(ngay, thang, nam)) { // Goi ham kiem tra
      System.out.println("Ngay/thang/nam hop le."); // Neu dung, thong bao hop le
    } else {
      System.out.println("Ngay/thang/nam khong hop le."); // Neu sai, thong bao khong hop le
    }
    sc.close(); // Dong Scanner
  }
}
