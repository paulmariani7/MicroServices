package com.example.paulmariani.model;


public class Acteur {

    private String name;
    private String firstname;
    private String datedenaissance;
    private String filmographie;



    public Acteur(String name, String firstname, String datedenaissance, String filmographie) {
        this.name = name;
        this.firstname = firstname;
        this.datedenaissance = datedenaissance;
        this.filmographie = filmographie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDatedenaissance() {
        return datedenaissance;
    }

    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public String getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(String filmographie) {
        this.filmographie = filmographie;
    }

    @Override
    public String toString() {
        return "Acteur [name=" + name + ", firstname=" + firstname + ", datedenaissance=" + datedenaissance + "filmo=" + filmographie+"]";
    }

}


