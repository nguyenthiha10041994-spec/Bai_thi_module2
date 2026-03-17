package view;

import controller.SanPhamController;

public class RunApp {
    public static void main(String[] args) {
        SanPhamController controller = new SanPhamController();
        controller.displayMainMenu();
    }
}