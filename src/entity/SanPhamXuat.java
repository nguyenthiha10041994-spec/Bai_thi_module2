package entity;

public class SanPhamXuat extends SanPham {
    private double giaXuat;
    private String quocGiaNhap;

    public SanPhamXuat() {
    }

    public SanPhamXuat(String maSanPham, String tenSanPham, double giaSanPham,
                       int soLuong, String quocGiaSanXuat,
                       double giaXuat, String quocGiaNhap) {

        super(maSanPham, tenSanPham, giaSanPham, soLuong, quocGiaSanXuat);
        this.giaXuat = giaXuat;
        this.quocGiaNhap = quocGiaNhap;
    }

    public double getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(double giaXuat) {
        this.giaXuat = giaXuat;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String getInfoToCSV() {
        return getMaSanPham() + "," +
                getTenSanPham() + "," +
                getGiaSanPham() + "," +
                getSoLuong() + "," +
                getQuocGiaSanXuat() + "," +
                giaXuat + "," +
                quocGiaNhap;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Giá xuất: " + giaXuat +
                ", Quốc gia nhập: " + quocGiaNhap;
    }
}