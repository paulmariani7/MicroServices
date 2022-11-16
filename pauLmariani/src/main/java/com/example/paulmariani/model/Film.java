package com.example.paulmariani.model;

public class Film {

    private String title;
    private String realisateur;
    private String acteurprincipal;
    private String datesortie;


    public Film(String title, String realisateur, String acteurprincipal, String datesortie) {
        super();
        this.title=title;
        this.realisateur=realisateur;
        this.acteurprincipal=acteurprincipal;
        this.datesortie=datesortie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeurprincipal() {
        return acteurprincipal;
    }

    public void setActeurprincipal(String acteurprincipal) {
        this.acteurprincipal = acteurprincipal;
    }

    public String getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(String datesortie) {
        this.datesortie = datesortie;
    }

    @Override
    public String toString() {
        return "Film [title=" + title + ", realisateur=" + realisateur + ", acteur principal=" + acteurprincipal + "date de sortie=" + datesortie+"]";
    }

}
