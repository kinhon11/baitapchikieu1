package bai1;

public class congnhan  extends canbo{
    private int bac;
    public congnhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }
    @Override
    public void hienthithongtin(){
        super.hienthithongTin();
        System.out.println("bac: " + bac);
    }
}
