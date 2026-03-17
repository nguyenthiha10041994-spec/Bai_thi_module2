package service;

import entity.SanPhamXuat;
import repository.ISanPhamXuatRepository;
import repository.SanPhamXuatRepository;

import java.util.ArrayList;
import java.util.List;

public class SanPhamXuatService implements ISanPhamXuatService {

    private ISanPhamXuatRepository repository = new SanPhamXuatRepository();

    @Override
    public List<SanPhamXuat> findAll() {
        return repository.findAll();
    }

    @Override
    public List<SanPhamXuat> search(String keySearch) {
        List<SanPhamXuat> list = findAll();
        List<SanPhamXuat> result = new ArrayList<>();

        for (SanPhamXuat sp : list) {
            if (sp.getMaSanPham().equals(keySearch)
                    || sp.getTenSanPham().equals(keySearch)) {
                result.add(sp);
            }
        }

        return result;
    }

    @Override
    public void add(SanPhamXuat sanPhamXuat) {
        repository.add(sanPhamXuat);
    }
}