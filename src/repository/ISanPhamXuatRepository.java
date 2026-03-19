package repository;

import entity.SanPhamXuat;
import java.util.List;

public interface ISanPhamXuatRepository {
    List<SanPhamXuat> findAll();
    void add(SanPhamXuat sanPhamXuat);
    boolean delete(String ma);
}