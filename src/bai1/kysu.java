package bai1;

public class kysu extends canbo{
    private String nganhdaotao;
    public kysu(String hoten, int tuoi, String gioitinh, String diachi,String nganhdaotao) {
        super(hoten, tuoi, gioitinh, diachi);
        this.nganhdaotao = nganhdaotao;
    }
    @Override
    public void hienthithongtin() {
        super.hienthithongTin();
        System.out.println("nganh dao tao: " + nganhdaotao);
    }
}
