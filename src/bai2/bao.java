package bai2;

import java.time.LocalDate;

public class bao extends tailieu{
    private final LocalDate ngayphathanh;
    public bao(String matailieu, String tennhaxuatban, int sobanphathanh, LocalDate ngayphathanh) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public void hienthithongtin() {
        super.hienthongtin();
        System.out.println(" Ngay phat hanh"+ ngayphathanh);
    }
}
