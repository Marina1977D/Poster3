package ru.netology;

public class MoviData {
    private int id;
    private String moviName;

    public MoviData() {
    }

    public MoviData(int id, String moviName){
        this.id = id;
        this.moviName = moviName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMoviName() {
        return moviName;
    }

    public void setMoviName(String moviName) {
        this.moviName = moviName;
    }
}
