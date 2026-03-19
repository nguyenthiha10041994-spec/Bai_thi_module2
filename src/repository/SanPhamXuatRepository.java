package repository;

import entity.SanPhamXuat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamXuatRepository implements ISanPhamXuatRepository {

    private static final String PATH = "src/data/sanphamxuat.csv";

    @Override
    public List<SanPhamXuat> findAll() {
        List<SanPhamXuat> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue; // bỏ dòng trống

                String[] arr = line.split(",");

                if (arr.length < 7) continue; // thiếu cột thì bỏ

                String ma = arr[0];
                String ten = arr[1];
                double gia = Double.parseDouble(arr[2]);
                int soLuong = Integer.parseInt(arr[3]);
                String quocGiaSX = arr[4];
                double giaXuat = Double.parseDouble(arr[5]);
                String quocGiaNhap = arr[6];

                list.add(new SanPhamXuat(
                        ma,
                        ten,
                        gia,
                        soLuong,
                        quocGiaSX,
                        giaXuat,
                        quocGiaNhap
                ));
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void add(SanPhamXuat sp) {
        List<SanPhamXuat> list = findAll();
        list.add(sp);
        writeFile(list);
    }

    @Override
    public boolean delete(String ma) {
        List<SanPhamXuat> list = findAll();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSanPham().equals(ma)) {
                list.remove(i);
                writeFile(list);
                return true;
            }
        }
        return false;
    }

    // 🔥 Ghi lại file CSV
    private void writeFile(List<SanPhamXuat> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH));

            for (SanPhamXuat sp : list) {
                bw.write(
                        sp.getMaSanPham() + "," +
                                sp.getTenSanPham() + "," +
                                sp.getGiaSanPham() + "," +
                                sp.getSoLuong() + "," +
                                sp.getQuocGiaSanXuat() + "," +
                                sp.getGiaXuat() + "," +
                                sp.getQuocGiaNhap()
                );
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}