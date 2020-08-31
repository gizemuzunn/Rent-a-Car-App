package com.example.quiz;

public class ListElement {
    private int element_type;

    private String carname;
    private String vites;
    private String koltuk;
    private String model;
    private String yakit;
    private String yakit_tuketim;
    private int kira;
    private String resim;

    public ListElement(int element_type, String carname, String vites, String koltuk, String model, String yakit, String yakit_tuketim, int kira, String resim) {
        this.element_type = element_type;
        this.carname = carname;
        this.vites = vites;
        this.koltuk = koltuk;
        this.model = model;
        this.yakit = yakit;
        this.yakit_tuketim = yakit_tuketim;
        this.kira = kira;
        this.resim = resim;
    }

    public ListElement(int element_type, String carname) {
        this.element_type = element_type;
        this.carname = carname;
    }

    public int getElement_type() {
        return element_type;
    }

    public String getCarname() {
        return carname;
    }

    public String getVites() {
        return vites;
    }

    public String getKoltuk() {
        return koltuk;
    }

    public String getModel() {
        return model;
    }

    public String getYakit() {
        return yakit;
    }

    public String getYakit_tuketim() {
        return yakit_tuketim;
    }

    public int getKira() {
        return kira;
    }

    public String getResim() {
        return resim;
    }
}
