package service;

import entity.SanPhamXuat;
import java.util.List;

public interface ISanPhamXuatService {
    List<SanPhamXuat> findAll();
    List<SanPhamXuat> search(String keySearch);
    void add(SanPhamXuat sanPhamXuat);
}