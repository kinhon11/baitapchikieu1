package bai1;

public class nhanvien extends canbo{
    private int congviec;
    public nhanvien(String hoten, int tuoi, String gioitinh, String diachi, String congviec ) {
        super(hoten, tuoi, gioitinh, diachi);
    }
    @Override
    public void hienthithongtin() {
        super.hienthithongTin();
        System.out.println("Công việc: " + congviec);
    }
}

