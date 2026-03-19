package view;

import entity.SanPhamNhap;

import java.util.List;
import java.util.Scanner;

public class SanPhamNhapView {

    private static Scanner scanner = new Scanner(System.in);

    public static SanPhamNhap inputData() {
        System.out.println("Nhập mã sản phẩm");
        String ma = scanner.nextLine();

        System.out.println("Nhập tên sản phẩm");
        String ten = scanner.nextLine();

        System.out.println("Nhập giá");
        double gia = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập nhà sản xuất");
        String nsx = scanner.nextLine();

        System.out.println("Nhập thuế nhập");
        double thue = Double.parseDouble(scanner.nextLine());

        return new SanPhamNhap(ma, ten, gia, soLuong, nsx, thue);
    }

    public static String inputSearch() {
        System.out.println("Nhập mã hoặc tên sản phẩm");
        return scanner.nextLine();
    }

    public static void displayList(List<SanPhamNhap> list) {
        for (SanPhamNhap sp : list) {
            System.out.println(sp);
        }
    }
    public static String inputMaXoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xoá: ");
        return scanner.nextLine();
    }
}