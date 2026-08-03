import java.util.Scanner; // Nạp thư viện Scanner

public class Bai13_KiemTraGioPhutGiayHopLe { // Class chính

  // Hàm kiểm tra gio, phut, giay co hop le hay khong
  // Hop le khi: 0 <= gio <= 23, 0 <= phut <= 59, 0 <= giay <= 59
  public static boolean isGioHopLe(int gio, int phut, int giay) {
    boolean gioOk = (gio >= 0 && gio <= 23); // Kiem tra gio nam trong khoang 0-23
    boolean phutOk = (phut >= 0 && phut <= 59); // Kiem tra phut nam trong khoang 0-59
    boolean giayOk = (giay >= 0 && giay <= 59); // Kiem tra giay nam trong khoang 0-59
    return gioOk && phutOk && giayOk; // Chi hop le khi ca 3 dieu kien deu dung
  }

  public static void main(String[] args) { // Ham main
    Scanner sc = new Scanner(System.in); // Tao Scanner doc input
    System.out.print("Nhap gio: "); // Yeu cau nhap gio
    int gio = sc.nextInt(); // Doc gia tri gio
    System.out.print("Nhap phut: "); // Yeu cau nhap phut
    int phut = sc.nextInt(); // Doc gia tri phut
    System.out.print("Nhap giay: "); // Yeu cau nhap giay
    int giay = sc.nextInt(); // Doc gia tri giay
    if (isGioHopLe(gio, phut, giay)) { // Goi ham kiem tra
      System.out.println("Gio/phut/giay hop le."); // Thong bao hop le
    } else {
      System.out.println("Gio/phut/giay khong hop le."); // Thong bao khong hop le
    }
    sc.close(); // Dong Scanner
  }
}
