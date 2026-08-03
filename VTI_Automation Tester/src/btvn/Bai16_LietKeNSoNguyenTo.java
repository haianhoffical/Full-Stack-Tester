import java.util.Scanner; // Nạp thư viện Scanner

public class Bai16_LietKeNSoNguyenTo { // Class chính

  // Ham kiem tra mot so co phai nguyen to hay khong (giong bai 4)
  public static boolean isPrime(int x) {
    if (x < 2) { // Nho hon 2 thi khong phai nguyen to
      return false;
    }
    for (int i = 2; i * i <= x; i++) { // Duyet i tu 2 den can bac hai cua x
      if (x % i == 0) { // Neu tim thay uoc so
        return false; // Khong phai nguyen to
      }
    }
    return true; // La so nguyen to
  }

  public static void main(String[] args) { // Ham main
    Scanner sc = new Scanner(System.in); // Tao Scanner doc input

    System.out.print("Nhap so luong so nguyen to can liet ke (n): "); // Yeu cau nhap n
    int n = sc.nextInt(); // Doc gia tri n

    System.out.println("Danh sach " + n + " so nguyen to dau tien:"); // Thong bao bat dau in

    int dem = 0; // Bien dem so luong so nguyen to da tim duoc, khoi tao = 0
    int soHienTai = 2; // Bien duyet qua tung so, bat dau tu 2 (so nguyen to nho nhat)

    while (dem < n) { // Vong lap chay den khi du n so nguyen to
      if (isPrime(soHienTai)) { // Neu soHienTai la so nguyen to
        System.out.print(soHienTai + " "); // In so nguyen to do ra man hinh
        dem++; // Tang bien dem len 1
      }
      soHienTai++; // Tang soHienTai len 1 de xet so tiep theo
    }
    System.out.println(); // Xuong dong sau khi in xong danh sach
    sc.close(); // Dong Scanner
  }
}
