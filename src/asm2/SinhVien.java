package asm2;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Integer tuoi;
    private Double diemTb;

    public SinhVien(String maSV, String hoTen, Integer tuoi, Double diemTb) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTb = diemTb;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(Double diemTb) {
        this.diemTb = diemTb;
    }

    public void inThongtin(){
        System.out.println("mã SV: "+maSV);
        System.out.println("họ tên: "+hoTen);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Điểm TB: "+diemTb);
    }
}
