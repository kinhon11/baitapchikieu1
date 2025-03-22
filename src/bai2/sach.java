package bai2;

public class sach extends tailieu{
    private String tentacgia;
    private int sotrang;
    public sach(String matailieu, String tennhaxuatban, int sobanphathanh, String tentacgia, int sotrang) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }
    @Override
    public void hienthithongtin(){
        super.hienthongtin();
        System.out.println("tác giả " + tentacgia);
        System.out.println("số trang " + sotrang);

    }
}
