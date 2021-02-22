package Behaviors;

import Entities.Oto;
import Entities.PTGT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management<E> {
   static String Path = "C:\\Users\\Admin\\Desktop\\case study\\src\\Data.dat";
  static List<PTGT> ptgts = (List<PTGT>) ReadWriteFile.readFromFile(Path);


    public void add(PTGT ptgt) {
        ptgts.add(ptgt);
        ReadWriteFile.writeObjectToFile(ptgts,Path);
    }

    public void update(PTGT ptgt) {
        for (PTGT ptgt1 : ptgts) {
            if (ptgt1.getId() == ptgt.getId()) {
                ptgt1.setGia(ptgt.getGia());
                ptgt1.setHangSX(ptgt.getHangSX());
                ptgt1.setMau(ptgt.getMau());
                ptgt1.setNamSX(ptgt.getNamSX());
            }
        }
        ReadWriteFile.writeObjectToFile(ptgts,Path);
    }

    public void delete(int id) {
        ptgts.removeIf(ptgt -> ptgt.getId() == id);
        ReadWriteFile.writeObjectToFile(ptgts,Path);
    }

    public void show() {
        for (PTGT ptgt : ptgts) {
            System.out.println("Bạn đã thêm " + ptgt.getClass().getSimpleName() + " thứ : "+ (ptgts.indexOf(ptgt) + 1));
            ptgt.hienThongTin();
        }
    }

    public void search(int id) {
        boolean found = false;
        for (PTGT p : ptgts) {
            if (p.getId() == id) {
                p.hienThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
                System.err.println("Không tìm thấy xe trong List");
        }
    }


}
