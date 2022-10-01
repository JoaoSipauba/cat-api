package br.edu.ceuma.catapi.entity;

public class Cat {
    private String url;
    private String name;

    public Cat(String url, String name){
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }
}
