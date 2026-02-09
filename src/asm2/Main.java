package asm2;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("SV01", "Bùi Đức Minh", 20, 9.8);
        sv.inThongtin();

        System.out.println("-----------------");


        TaiKhoan tk = new TaiKhoan("123456789", "Ming Ming", 500.000);
        tk.hienThiSoDu();
        tk.napTien(500);
        tk.rutTien(2000);
        tk.rutTien(200);
        tk.hienThiSoDu();

        System.out.println("-----------------");

        HocSinh hs = new HocSinh("Nguyễn Thu Trang", 9,9,9);
        hs.inThongTin();
    }
}
