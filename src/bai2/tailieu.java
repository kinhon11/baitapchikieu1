package bai2;

public abstract class tailieu {
    protected String matailieu;
    protected String tennhaxuatban;
    protected int sobanphathanh;

    public  tailieu(String matailieu, String tennhaxuatban, int sobanphathanh){
        this.matailieu = matailieu;
        this.tennhaxuatban = tennhaxuatban;
        this.sobanphathanh = sobanphathanh;
    }
    public String getMatailieu(){
        return matailieu;
    }
    public void hienthongtin(){
        System.out.println(" Mã tài liệu"+ matailieu);
        System.out.println(" Nhà xuất bản"+ tennhaxuatban);
        System.out.println(" Số bản phát hành"+ sobanphathanh);
    }

    public abstract void hienthithongtin();

    public Object getMaTaiLieu() {
        return null;
    }
}
