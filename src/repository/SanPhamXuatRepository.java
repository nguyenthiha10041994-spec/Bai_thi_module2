package repository;

import entity.SanPhamXuat;

import java.util.ArrayList;
import java.util.List;

public class SanPhamXuatRepository implements ISanPhamXuatRepository {

    private static List<SanPhamXuat> sanPhamXuatList = new ArrayList<>();

    @Override
    public List<SanPhamXuat> findAll() {
        return sanPhamXuatList;
    }

    @Override
    public void add(SanPhamXuat sanPhamXuat) {
        sanPhamXuatList.add(sanPhamXuat);
    }
}
