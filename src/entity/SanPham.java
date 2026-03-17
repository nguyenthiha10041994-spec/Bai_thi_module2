package entity;

public abstract class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private double giaSanPham;
    private int soLuong;
    private String quocGiaSanXuat;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, double giaSanPham, int soLuong, String quocGiaSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.quocGiaSanXuat = quocGiaSanXuat;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getQuocGiaSanXuat() {
        return quocGiaSanXuat;
    }

    public void setQuocGiaSanXuat(String quocGiaSanXuat) {
        this.quocGiaSanXuat = quocGiaSanXuat;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "Mã: " + maSanPham +
                ", Tên: " + tenSanPham +
                ", Giá: " + giaSanPham +
                ", Số lượng: " + soLuong +
                ", Quốc gia: " + quocGiaSanXuat;
    }
}