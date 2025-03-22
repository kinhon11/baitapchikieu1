package package1;
import bai1.QLCB;
import bai1.congnhan;
import bai1.kysu;
import bai1.nhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Hiển thị danh sách cán bộ");
            System.out.println("3. Tìm kiếm cán bộ theo tên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    themCanBo(qlcb, scanner);
                    break;
                case 2:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 3:
                    System.out.print("Nhập tên cán bộ cần tìm: ");
                    String tenTimKiem = scanner.nextLine();
                    qlcb.timKiemTheoTen(tenTimKiem);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ 1 đến 4.");
            }
        }
    }

    private static void themCanBo(QLCB qlcb, Scanner scanner) {
        System.out.println("\n Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.print("Nhập lựa chọn: ");
        int loai = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm
        System.out.print("Nhập giới tính (Nam/Nữ/Khác): ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        switch (loai) {
            case 1:
                System.out.print("Nhập bậc (1-10): ");
                int bac = scanner.nextInt();
                qlcb.themCanBo(new congnhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                break;
            case 2:
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = scanner.nextLine();
                qlcb.themCanBo(new kysu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                break;
            case 3:
                System.out.print("Nhập công việc: ");
                String congViec = scanner.nextLine();
                qlcb.themCanBo(new nhanvien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
