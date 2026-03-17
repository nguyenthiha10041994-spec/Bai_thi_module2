package controller;

import entity.SanPhamNhap;
import entity.SanPhamXuat;
import service.ISanPhamNhapService;
import service.ISanPhamXuatService;
import service.SanPhamNhapService;
import service.SanPhamXuatService;
import view.SanPhamNhapView;
import view.SanPhamXuatView;

import java.util.List;
import java.util.Scanner;

public class SanPhamController {

    private ISanPhamNhapService sanPhamNhapService = new SanPhamNhapService();
    private ISanPhamXuatService sanPhamXuatService = new SanPhamXuatService();

    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            System.out.println("------ QUẢN LÝ SẢN PHẨM ------");
            System.out.println("1. Danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Thoát");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    searchMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại!");
            }
        }
    }

    public void displayMenu() {
        while (true) {
            System.out.println("------------------ DANH SÁCH ------");
            System.out.println("1. Sản phẩm nhập");
            System.out.println("2. Sản phẩm xuất");
            System.out.println("3. Quay lại");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    List<SanPhamNhap> listNhap = sanPhamNhapService.findAll();
                    SanPhamNhapView.displayList(listNhap);
                    break;
                case 2:
                    List<SanPhamXuat> listXuat = sanPhamXuatService.findAll();
                    SanPhamXuatView.displayList(listXuat);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập sai!");
            }
        }
    }

    public void addMenu() {
        while (true) {
            System.out.println("--- THÊM ------");
            System.out.println("1. Sản phẩm nhập");
            System.out.println("2. Sản phẩm xuất");
            System.out.println("3. Quay lại");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    SanPhamNhap spNhap = SanPhamNhapView.inputData();
                    sanPhamNhapService.add(spNhap);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    SanPhamXuat spXuat = SanPhamXuatView.inputData();
                    sanPhamXuatService.add(spXuat);
                    System.out.println("Thêm thành công");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập sai!");
            }
        }
    }

    public void searchMenu() {
        while (true) {
            System.out.println("---------------- TÌM KIẾM ------");
            System.out.println("1. Sản phẩm nhập");
            System.out.println("2. Sản phẩm xuất");
            System.out.println("3. Quay lại");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    String keyNhap = SanPhamNhapView.inputSearch();
                    List<SanPhamNhap> listNhap = sanPhamNhapService.search(keyNhap);
                    if (listNhap.isEmpty()) {
                        System.out.println("Không tìm thấy");
                    } else {
                        SanPhamNhapView.displayList(listNhap);
                    }
                    break;

                case 2:
                    String keyXuat = SanPhamXuatView.inputSearch();
                    List<SanPhamXuat> listXuat = sanPhamXuatService.search(keyXuat);
                    if (listXuat.isEmpty()) {
                        System.out.println("Không tim thấy");
                    } else {
                        SanPhamXuatView.displayList(listXuat);
                    }
                    break;

                case 3:
                    return;
                default:
                    System.out.println("Nhập sai!");
            }
        }
    }
}