package bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private final List<tailieu> danhSachTaiLieu = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void themTaiLieu() {
        System.out.println("Chọn loại tài liệu để thêm: ");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mã tài liệu: ");
        String ma = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String nxb = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBan = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập tên tác giả: ");
                String tacGia = scanner.nextLine();
                System.out.print("Nhập số trang: ");
                int soTrang = scanner.nextInt();
                danhSachTaiLieu.add(new sach(ma, nxb, soBan, tacGia, soTrang));
                break;
            case 2:
                System.out.print("Nhập số phát hành: ");
                int soPhatHanh = scanner.nextInt();
                System.out.print("Nhập tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                danhSachTaiLieu.add(new tapchi(ma, nxb, soBan, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                System.out.print("Nhập ngày phát hành (yyyy-mm-dd): ");
                String ngayphathanh = scanner.next();

                danhSachTaiLieu.add(new bao(ma, nxb, soBan, LocalDate.parse(ngayphathanh)));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public void xoaTaiLieu() {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String ma = scanner.next();
        danhSachTaiLieu.removeIf(t -> t.getMaTaiLieu().equals(ma));
        System.out.println("Xóa thành công!");
    }

    public void hienThiTaiLieu() {
        for (tailieu t : danhSachTaiLieu) {
            t.hienthongtin();
            System.out.println("--------------------");
        }
    }

    public void timKiemTaiLieu() {
        System.out.println("Nhập loại tài liệu cần tìm: (1. Sách, 2. Tạp chí, 3. Báo)");
        int choice = scanner.nextInt();

        for (tailieu t : danhSachTaiLieu) {
            if ((choice == 1 && t instanceof sach) ||
                    (choice == 2 && t instanceof tapchi) ||
                    (choice == 3 && t instanceof bao)) {
                t.hienthongtin();
                System.out.println("--------------------");
            }
        }
    }
}
