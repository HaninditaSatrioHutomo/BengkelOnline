package com.satriohutomoproject.bengkelonlineproject;

/**
 * Created by aura comp on 12/2/2017.
 */

public class PojoJavaList {
    private String namaClub;
    private Integer background;

    PojoJavaList(String namaClub,Integer background){
        this.namaClub=namaClub;
        this.background=background;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public Integer getBackground() {
        return background;
    }

    public void setBackground(Integer background) {
        this.background = background;
    }
}
