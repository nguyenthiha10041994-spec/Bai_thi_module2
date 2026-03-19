package view;

import entity.SanPhamXuat;

import java.util.List;
import java.util.Scanner;

public class SanPhamXuatView {

    private static Scanner scanner = new Scanner(System.in);

    public static SanPhamXuat inputData() {
        System.out.println("Nhập mã sản phẩm");
        String ma = scanner.nextLine();

        System.out.println("Nhập tên sản phẩm");
        String ten = scanner.nextLine();

        System.out.println("Nhập giá");
        double gia = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập quốc gia sản xuất");
        String nsx = scanner.nextLine();

        System.out.println("Nhập giá xuất");
        double giaXuat = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập quốc gia nhập");
        String quocGia = scanner.nextLine();

        return new SanPhamXuat(ma, ten, gia, soLuong, nsx, giaXuat, quocGia);
    }

    public static String inputSearch() {
        System.out.println("Nhập mã hoặc tên sản phẩm");
        return scanner.nextLine();
    }

    public static void displayList(List<SanPhamXuat> list) {
        for (SanPhamXuat sp : list) {
            System.out.println(sp);
        }
    }
    public static String inputMaXoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xoá: ");
        return scanner.nextLine();
    }
}