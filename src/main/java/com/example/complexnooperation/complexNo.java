package com.example.complexnooperation;

public class complexNo {
    int real;
    int img;

// constructor
    public complexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    //getter
    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    //setter
    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    //for print

    @Override
    public String toString() {
        return "complexNo{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
}
