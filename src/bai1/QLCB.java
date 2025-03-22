package bai1;
import bai1.canbo;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private final List<canbo> canBoList = new ArrayList<>();

    public void themCanBo(canbo canBo) {
        canbo canbo = null;
        canBoList.add(canbo);
    }

    public void timKiemTheoTen(String hoTen) {
        for (canbo cb : canBoList) {
            if (cb.hoten.equalsIgnoreCase(hoTen)) {
                cb.hienthithongtin();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }

    public void hienThiDanhSachCanBo() {
        for (canbo cb : canBoList) {
            cb.hienthithongtin();
            System.out.println("----------------------");
        }
    }

    public void themcanbo(kysu kysu) {
    }
}
