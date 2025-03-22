package bai2;

public class tapchi extends tailieu{
    private int sophathanh;
    private int thangphathanh;
    public tapchi(String matailieu, String tennhaxuatban, int sobanphathanh, int sophathanh, int thangphathanh) {
        super(matailieu, tennhaxuatban, sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    @Override
    public void hienthithongtin() {
        super.hienthongtin();
        System.out.println(" số phát hành =" + sophathanh );
        System.out.println(" tháng phát hành =" + thangphathanh );

    }
}
