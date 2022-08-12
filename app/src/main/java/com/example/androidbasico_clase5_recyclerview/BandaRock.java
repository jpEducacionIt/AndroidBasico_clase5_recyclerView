package com.example.androidbasico_clase5_recyclerview;

public class BandaRock {
    private int imagenBanda;
    private String nombrebanda;
    private String albumPreferido;

    public BandaRock(int _imagenBanda, String _nombrebanda, String _albumPreferido) {
        this.imagenBanda = _imagenBanda;
        this.nombrebanda = _nombrebanda;
        this.albumPreferido = _albumPreferido;
    }

    public int getImagenBanda() {
        return imagenBanda;
    }

    public void setImagenBanda(int imagenBanda) {
        this.imagenBanda = imagenBanda;
    }

    public String getAlbumPreferido() {
        return albumPreferido;
    }

    public void setAlbumPreferido(String albumPreferido) {
        this.albumPreferido = albumPreferido;
    }

    public String getNombrebanda() {
        return nombrebanda;
    }

    public void setNombrebanda(String nombrebanda) {
        this.nombrebanda = nombrebanda;
    }
}
