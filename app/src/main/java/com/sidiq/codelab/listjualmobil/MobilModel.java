package com.sidiq.codelab.listjualmobil;

import java.io.Serializable;

/**
 * Created by Student-12 on 16/06/2015.
 */
public class MobilModel implements Serializable {
    String title, image, harga, lokasi;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
