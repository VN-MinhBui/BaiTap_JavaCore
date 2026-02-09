package asm2;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private Double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTK, Double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien){
        if (soTien<=0){
            System.out.println("Nạp không thành công !");
        } else {
            soDu += soTien;
            System.out.println("Nạp tiền thành công !");
        }
    }

    public void rutTien(double soTien){
        if (soTien > soDu){
            System.out.println("Số dư không đủ !");
        } else if (soTien<=0) {
            System.out.println("Không thể rút !");
        } else {
            soDu -= soTien;
            System.out.println(" Rút thành công: "+soTien+"VND");
        }
    }

    public void hienThiSoDu(){
        System.out.println("Số dư hiện tại: "+soDu+"VND");
    }
}
