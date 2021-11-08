package com.company;

public class WingsAnimals implements ShowAnimalProperties{
    String name;
    /*Конструктор класса*/
    public WingsAnimals(String name){
        this.name = name;
    }
    /*Метод для показа свойств*/
    @Override
    public void ShowAnimalProperty(){
        System.out.println(name+"-"+"есть крылья!");
    }
}
