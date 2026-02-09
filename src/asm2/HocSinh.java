package asm2;

public class HocSinh {
    private String hoTen;
    private Integer diemToan;
    private Integer diemVan;
    private Integer diemAnh;

    public HocSinh(String hoTen, Integer diemToan, Integer diemVan, Integer diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public void setDiemToan(Integer diemToan) {
        if (diemToan>0 && diemToan<10){

        }
    }

    public void tinhDiemTb() {

    }
}
