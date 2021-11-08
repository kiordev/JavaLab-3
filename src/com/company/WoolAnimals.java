package com.company;

public class WoolAnimals implements ShowAnimalProperties{
    String name;
    /*Конструктор класса*/
    public WoolAnimals(String name){
        this.name = name;
    }
    /*Метод для показа свойств*/
    @Override
    public void ShowAnimalProperty(){
        System.out.println(name+"-"+"имеет шерсть");
    }
}
