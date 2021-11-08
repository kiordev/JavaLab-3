package com.company;

public class SoundCreateAnimals implements ShowAnimalProperties{
    String name;
    /*Конструктор класса*/
    public SoundCreateAnimals(String name){
        this.name = name;
    }
    /*Метод для показа свойств*/
    @Override
    public void ShowAnimalProperty(){
        System.out.println(name+"-"+"издает звуки!");
    }
}
