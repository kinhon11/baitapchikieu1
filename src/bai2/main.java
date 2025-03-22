package bai2;

import java.util.Scanner;

public class main {

    public main(String[] args){
        QuanLySach qls = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("\nMEnu");
            System.out.println("1. Them tai lieu");
            System.out.println("2. Xoa tai lieu");
            System.out.println("3. Hiem Thi tai lieu");
            System.out.println("4. tim kiem tai lieu");
            System.out.println("5. thoat");
            System.out.println("Chon:");

            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    qls.themTaiLieu();
                    break;
                case 2:
                    qls.xoaTaiLieu();
                    break;
                case 3:
                    qls.hienThiTaiLieu();
                    break;
                case 4:
                    qls.timKiemTaiLieu();
                    break;
                case 5:
                    System.out.println("Thoat chuong tirnh");
                    return;
                default:
                    System.out.println("chon thong tin hop le");
            }
        }
    }
}
