package repository;

import entity.SanPhamNhap;

import java.util.ArrayList;
import java.util.List;

public class SanPhamNhapRepository implements ISanPhamNhapRepository {

    private static List<SanPhamNhap> sanPhamNhapList = new ArrayList<>();

    @Override
    public List<SanPhamNhap> findAll() {
        return sanPhamNhapList;
    }

    @Override
    public void add(SanPhamNhap sanPhamNhap) {
        sanPhamNhapList.add(sanPhamNhap);
    }
}