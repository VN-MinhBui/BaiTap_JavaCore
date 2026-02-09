package asm2;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public void setDiemToan(double diemToan) {
        if (diemToan < 0 || diemToan > 10) {
            System.out.println("Điểm Toán không hợp lệ!");
            return;
        }
        this.diemToan = diemToan;
    }

    public void setDiemVan(double diemVan) {
        if (diemVan < 0 || diemVan > 10) {
            System.out.println("Điểm Văn không hợp lệ!");
            return;
        }
        this.diemVan = diemVan;
    }

    public void setDiemAnh(double diemAnh) {
        if (diemAnh < 0 || diemAnh > 10) {
            System.out.println("Điểm Toán không hợp lệ!");
            return;
        }
        this.diemToan = diemToan;
    }

    public double tinhDiemTb() {
        return (diemVan + diemAnh + diemToan) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTb();
        if (dtb >= 8) return "Giỏi";
        else if (dtb >= 6.5) return "Khá";
        else if (dtb >= 5) return "Trung bình";
        else return "Yếu";
    }

    public void inThongTin(){
        System.out.println("Họ Tên: "+hoTen);
        System.out.println("Điểm Trung Bình: "+tinhDiemTb());
        System.out.println("Xếp Loại: "+xepLoai());
    }
}
