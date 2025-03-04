package com.example.complexnooperation;

public class ComplexNo {
    int real;
    int img;

// constructor
    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    //empty constructor
    public ComplexNo() {
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
        return "complexNo :" +
                 + real + "+" +
                 + img +
                'i';
    }

    ComplexNo add(ComplexNo c){
        ComplexNo resultComplexNumber=new ComplexNo();
        resultComplexNumber.real=this.real+c.real;
        resultComplexNumber.img=this.img+c.img;
        return resultComplexNumber;
    }

    ComplexNo sub(ComplexNo c){
        ComplexNo resultComplexNumber=new ComplexNo();
        resultComplexNumber.real=this.real-c.real;
        resultComplexNumber.img=this.img-c.img;
        return resultComplexNumber;
    }
}
