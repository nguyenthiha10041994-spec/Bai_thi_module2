package repository;

import entity.SanPhamNhap;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SanPhamNhapRepository implements ISanPhamNhapRepository {
    private void writeFile(List<SanPhamNhap> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/sanphamnhap.csv"));

            for (SanPhamNhap sp : list) {
                bw.write(sp.getInfoToCSV());
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<SanPhamNhap> findAll() {
        List<SanPhamNhap> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/data/sanphamnhap.csv"));
            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue; // bỏ dòng trống

                String[] arr = line.split(",");

                if (arr.length < 6) continue; // 🔥 NHẬP = 6 cột

                String ma = arr[0];
                String ten = arr[1];
                double gia = Double.parseDouble(arr[2]);
                int soLuong = Integer.parseInt(arr[3]);
                String nhaSanXuat = arr[4];
                double thueNhap = Double.parseDouble(arr[5]);

                list.add(new SanPhamNhap(
                        ma,
                        ten,
                        gia,
                        soLuong,
                        nhaSanXuat,
                        thueNhap
                ));
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public boolean delete(String ma) {
        List<SanPhamNhap> list = findAll();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSanPham().trim().equals(ma.trim())) {
                list.remove(i);
                writeFile(list);
                return true;
            }
        }

        return false;
    }
    @Override
    public void add(SanPhamNhap sp) {
        List<SanPhamNhap> list = findAll();
        list.add(sp);
        writeFile(list);
    }



}