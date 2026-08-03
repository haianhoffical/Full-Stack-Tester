import java.util.Scanner; // Nạp thư viện Scanner

public class Bai14_KiemTraNamNhuan { // Class chính

  // Ham kiem tra nam nhuan (giong bai 12): chia het cho 4 va (khong chia het 100 hoac chia het 400)
  public static boolean isNamNhuan(int nam) {
    return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0); // Cong thuc nam nhuan
  }

  // Ham kiem tra ngay/thang/nam hop le (tuong tu bai 12)
  public static boolean isNgayHopLe(int ngay, int thang, int nam) {
    if (nam < 1 || thang < 1 || thang > 12 || ngay < 1) { // Kiem tra dieu kien co ban
      return false; // Khong hop le neu vi pham dieu kien co ban
    }
    int soNgayToiDa; // Bien luu so ngay toi da cua thang
    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) { // Thang co 30 ngay
      soNgayToiDa = 30;
    } else if (thang == 2) { // Rieng thang 2
      soNgayToiDa = isNamNhuan(nam) ? 29 : 28; // Dung toan tu 3 ngoi: nhuan thi 29, khong thi 28
    } else { // Cac thang con lai co 31 ngay
      soNgayToiDa = 31;
    }
    return (ngay <= soNgayToiDa); // Ngay hop le neu <= so ngay toi da
  }

  public static void main(String[] args) { // Ham main
    Scanner sc = new Scanner(System.in); // Tao Scanner doc input

    System.out.print("Nhap ngay: "); // Yeu cau nhap ngay
    int ngay = sc.nextInt(); // Doc ngay

    System.out.print("Nhap thang: "); // Yeu cau nhap thang
    int thang = sc.nextInt(); // Doc thang

    System.out.print("Nhap nam: "); // Yeu cau nhap nam
    int nam = sc.nextInt(); // Doc nam

    if (!isNgayHopLe(ngay, thang, nam)) { // Neu ngay/thang/nam khong hop le
      System.out.println("Ngay/thang/nam khong hop le, khong the kiem tra nam nhuan!"); // Bao loi
    } else { // Neu hop le, tien hanh kiem tra nam nhuan
      if (isNamNhuan(nam)) { // Goi ham kiem tra nam nhuan
        System.out.println("Nam " + nam + " la nam nhuan."); // Thong bao la nam nhuan
      } else {
        System.out.println(
            "Nam " + nam + " khong phai la nam nhuan."); // Thong bao khong phai nam nhuan
      }
    }
    sc.close(); // Dong Scanner
  }
}
