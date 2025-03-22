package bai1;

public abstract class canbo {
    public String hoten;
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;

    public canbo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void hienthithongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }

    public abstract void hienthithongtin();
}
