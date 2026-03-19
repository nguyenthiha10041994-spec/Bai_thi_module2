package service;
import repository.ISanPhamNhapRepository;
import repository.SanPhamNhapRepository;
import entity.SanPhamNhap;
import repository.ISanPhamNhapRepository;
import repository.SanPhamNhapRepository;

import java.util.ArrayList;
import java.util.List;

public class SanPhamNhapService implements ISanPhamNhapService {
    private ISanPhamNhapRepository sanPhamNhapRepository = new SanPhamNhapRepository();
    private ISanPhamNhapRepository repository = new SanPhamNhapRepository();

    @Override
    public List<SanPhamNhap> findAll() {
        return repository.findAll();
    }

    @Override
    public List<SanPhamNhap> search(String keySearch) {
        List<SanPhamNhap> list = findAll();
        List<SanPhamNhap> result = new ArrayList<>();

        for (SanPhamNhap sp : list) {
            if (sp.getMaSanPham().equals(keySearch)
                    || sp.getTenSanPham().equals(keySearch)) {
                result.add(sp);
            }
        }

        return result;
    }
    @Override
    public boolean delete(String ma) {
        return sanPhamNhapRepository.delete(ma);
    }

    @Override
    public void add(SanPhamNhap sanPhamNhap) {
        sanPhamNhapRepository.add(sanPhamNhap);
    }
}