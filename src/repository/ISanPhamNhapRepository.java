package repository;

import entity.SanPhamNhap;
import java.util.List;

public interface ISanPhamNhapRepository {
    List<SanPhamNhap> findAll();
    void add(SanPhamNhap sanPhamNhap);
}