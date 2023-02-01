package run;

import manager.MaterialManager;
import material.CrispyFlour;
import material.Meat;

import java.time.LocalDate;
import java.util.Scanner;

public class run {
    public static MaterialManager materialManager = new MaterialManager();

    public static void main(String[] args) {
        CrispyFlour cf1 = new CrispyFlour("cf1", "bot mi", LocalDate.now().plusYears(1), 25, 2);
        CrispyFlour cf2 = new CrispyFlour("cf2", "bot khoai", LocalDate.now().plusYears(1), 25, 2);
        CrispyFlour cf3 = new CrispyFlour("cf3", "bot gao", LocalDate.now().plusYears(1), 25, 2);
        CrispyFlour cf4 = new CrispyFlour("cf4", "bot dau", LocalDate.now().plusYears(1), 25, 2);
        CrispyFlour cf5 = new CrispyFlour("cf5", "bot san", LocalDate.now().plusYears(1), 25, 2);
        Meat m1 = new Meat("m1", "thit lon1", LocalDate.now().plusDays(7), 120, 1);
        Meat m2 = new Meat("m2", "thit lon2", LocalDate.now().plusDays(7), 120, 1);
        Meat m3 = new Meat("m3", "thit lon3", LocalDate.now().plusDays(7), 120, 1);
        Meat m4 = new Meat("m4", "thit lon4", LocalDate.now().plusDays(7), 120, 1);
        Meat m5 = new Meat("m5", "thit lon5", LocalDate.now().plusDays(7), 120, 1);
        materialManager.addMaterial(cf1);
        materialManager.addMaterial(cf2);
        materialManager.addMaterial(cf3);
        materialManager.addMaterial(cf4);
        materialManager.addMaterial(cf5);
        materialManager.addMaterial(m1);
        materialManager.addMaterial(m2);
        materialManager.addMaterial(m3);
        materialManager.addMaterial(m4);
        materialManager.addMaterial(m5);
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("menu--------");
            System.out.println("xin mời chọn menu");
            System.out.println("""
                    1. thêm thịt vao kho
                    2.thêm bột vào kho
                    3.hien thi vat lieu
                    4. xóa vật liêu               
                    0 .thoat""");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("xin moi nhap id");
                    String id = sc.nextLine();
                    sc.nextLine();
                    System.out.println("xin moi nhap ten sp");
                    String name = sc.nextLine();
                    System.out.println("ngay san xuat");
                    LocalDate ManufacturingDate = LocalDate.now();

                    System.out.println("xin moi nhap gia");
                    int cost = sc.nextInt();
                    System.out.println("xin moi nhap can nang");
                    double weight = sc.nextDouble();
                    Meat meat = new Meat(id, name, ManufacturingDate, cost, weight);
                    materialManager.addMaterial(meat);
                    break;
                case 2:
                    System.out.println("xin moi nhap id");
                    String idC = sc.nextLine();
                    sc.nextLine();
                    System.out.println("xin moi nhap ten sp");
                    String nameC = sc.nextLine();
                    System.out.println("ngay san xuat");
                    LocalDate ManufacturingDateC = LocalDate.now();
                    System.out.println("xin moi nhap gia");
                    int costC = sc.nextInt();
                    System.out.println("xin moi nhap can nang");
                    int quantityC = sc.nextInt();
                    CrispyFlour crispyFlour = new CrispyFlour(idC, nameC, ManufacturingDateC, costC, quantityC);
                    materialManager.addMaterial(crispyFlour);
                    break;
                case 3:
                    materialManager.display();
                case 4:
                    System.out.println(" xin mời nhập vị trí muốn xóa");
                    int input=sc.nextInt();
                    materialManager.deleteMaterial(input);
                    break;
                case 5:
                    System.exit(menu);
            }

        } while (true);
    }
}
