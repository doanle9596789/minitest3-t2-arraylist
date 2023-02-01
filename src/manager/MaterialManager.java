package manager;

import material.Material;
import material.Meat;

import java.util.ArrayList;
import java.util.Comparator;

public class MaterialManager {
    ArrayList<Material>listMaterial=new ArrayList<>();

    public MaterialManager() {
    }

    public MaterialManager(ArrayList<Material> listMaterial) {
        this.listMaterial = listMaterial;
    }

    public ArrayList<Material> getListMaterial() {
        return listMaterial;
    }

    public void setListMaterial(ArrayList<Material> listMaterial) {
        this.listMaterial = listMaterial;
    }
    public void addMaterial(Material material){
        listMaterial.add(material);
    }
    public void display(){
        for (Material k:listMaterial
             ) {
            System.out.println(k.toString());

        }
    }
    public void deleteMaterial(int i){
        listMaterial.remove(i);
    }
}
