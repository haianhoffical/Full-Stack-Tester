import java.util.Scanner; // Nạp thư viện Scanner

public class Bai15_DienTichChuVi { // Class chính

  public static void main(String[] args) { // Ham main
    Scanner sc = new Scanner(System.in); // Tao Scanner doc input

    System.out.println("Chon hinh can tinh:"); // Hien thi menu lua chon
    System.out.println("1. Tam giac"); // Lua chon 1
    System.out.println("2. Hinh vuong"); // Lua chon 2
    System.out.println("3. Hinh chu nhat"); // Lua chon 3
    System.out.println("4. Hinh tron"); // Lua chon 4
    System.out.print("Nhap lua chon (1-4): "); // Yeu cau nhap lua chon
    int chon = sc.nextInt(); // Doc lua chon cua nguoi dung

    switch (chon) { // Cau truc switch de xu ly theo lua chon

      case 1: { // Truong hop chon Tam giac
        // Voi tam giac: tinh dien tich can day va chieu cao, tinh chu vi can 3 canh
        System.out.print("Nhap canh day: "); // Yeu cau nhap canh day
        double day = sc.nextDouble(); // Doc canh day

        System.out.print("Nhap chieu cao: "); // Yeu cau nhap chieu cao
        double chieuCao = sc.nextDouble(); // Doc chieu cao

        System.out.print("Nhap canh a: "); // Yeu cau nhap canh a de tinh chu vi
        double a = sc.nextDouble(); // Doc canh a

        System.out.print("Nhap canh b: "); // Yeu cau nhap canh b
        double b = sc.nextDouble(); // Doc canh b

        System.out.print("Nhap canh c: "); // Yeu cau nhap canh c
        double c = sc.nextDouble(); // Doc canh c

        double dienTich = 0.5 * day * chieuCao; // Cong thuc dien tich tam giac = 1/2 * day * cao
        double chuVi = a + b + c; // Chu vi tam giac = tong 3 canh

        System.out.println("Dien tich tam giac: " + dienTich); // In dien tich
        System.out.println("Chu vi tam giac: " + chuVi); // In chu vi
        break; // Ket thuc case 1
      }

      case 2: { // Truong hop chon Hinh vuong
        System.out.print("Nhap canh hinh vuong: "); // Yeu cau nhap canh
        double canh = sc.nextDouble(); // Doc canh

        double dienTich = canh * canh; // Cong thuc dien tich hinh vuong = canh^2
        double chuVi = 4 * canh; // Cong thuc chu vi hinh vuong = 4 * canh

        System.out.println("Dien tich hinh vuong: " + dienTich); // In dien tich
        System.out.println("Chu vi hinh vuong: " + chuVi); // In chu vi
        break; // Ket thuc case 2
      }

      case 3: { // Truong hop chon Hinh chu nhat
        System.out.print("Nhap chieu dai: "); // Yeu cau nhap chieu dai
        double dai = sc.nextDouble(); // Doc chieu dai

        System.out.print("Nhap chieu rong: "); // Yeu cau nhap chieu rong
        double rong = sc.nextDouble(); // Doc chieu rong

        double dienTich = dai * rong; // Cong thuc dien tich hinh chu nhat = dai * rong
        double chuVi = 2 * (dai + rong); // Cong thuc chu vi hinh chu nhat = 2*(dai+rong)

        System.out.println("Dien tich hinh chu nhat: " + dienTich); // In dien tich
        System.out.println("Chu vi hinh chu nhat: " + chuVi); // In chu vi
        break; // Ket thuc case 3
      }

      case 4: { // Truong hop chon Hinh tron
        System.out.print("Nhap ban kinh: "); // Yeu cau nhap ban kinh
        double banKinh = sc.nextDouble(); // Doc ban kinh

        double dienTich = Math.PI * banKinh * banKinh; // Cong thuc dien tich hinh tron = pi*r^2
        double chuVi = 2 * Math.PI * banKinh; // Cong thuc chu vi hinh tron = 2*pi*r

        System.out.println("Dien tich hinh tron: " + dienTich); // In dien tich
        System.out.println("Chu vi hinh tron: " + chuVi); // In chu vi
        break; // Ket thuc case 4
      }

      default: // Truong hop nguoi dung nhap lua chon khong hop le
        System.out.println("Lua chon khong hop le!"); // Thong bao loi
        break;
    }
    sc.close(); // Dong Scanner
  }
}
