package service;

import entity.SanPhamNhap;
import java.util.List;

public interface ISanPhamNhapService {
    List<SanPhamNhap> findAll();
    List<SanPhamNhap> search(String keySearch);
    void add(SanPhamNhap sanPhamNhap);
}