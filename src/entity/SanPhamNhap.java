package entity;

public class SanPhamNhap extends SanPham {
    private double thueNhapKhau;

    public SanPhamNhap() {
    }

    public SanPhamNhap(String maSanPham, String tenSanPham, double giaSanPham, int soLuong, String quocGiaSanXuat, double thueNhapKhau) {
        super(maSanPham, tenSanPham, giaSanPham, soLuong, quocGiaSanXuat);
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String getInfoToCSV() {
        return getMaSanPham() + "," +
                getTenSanPham() + "," +
                getGiaSanPham() + "," +
                getSoLuong() + "," +
                getQuocGiaSanXuat() + "," +
                thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thuế nhập: " + thueNhapKhau;
    }
}