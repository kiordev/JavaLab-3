package com.company;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

/*
 * Лабораторная работа №3 студента группы ВТ-19 (2021)
 *
 * Дисциплина: Кросс-платформенное программирование на Java
 *
 * Александр Киор, Мариуполь 2021
 */

public class Main {
    static void Task_One() {
        /*Программа по предложенной UML модели*/
        System.out.println("Первое задание");
        Cat Mursik = new Cat();
        Dog Bobik = new Dog();
        Cow Murka = new Cow();

        System.out.println("Звуки: ");
        Mursik.voice();
        Bobik.voice();
        Murka.voice();
        System.out.println("================");
        /*Программа по дополнению UML модели*/
        SoundCreateAnimals Lion = new SoundCreateAnimals("King");
        WingsAnimals Albatros = new WingsAnimals("Bard");
        WoolAnimals Cat = new WoolAnimals("Mursik");

        System.out.println("Свойства животных: ");
        Lion.ShowAnimalProperty();
        Albatros.ShowAnimalProperty();
        Cat.ShowAnimalProperty();

    } //Первое задание
    static void Task_Two(){

    } //Второе задание
    static void Task_Three(){} //Третье задание
    public static void main(String[] args) {
        /*Главное меню*/
        int global_user_choose = 0; //Глобальная переменная для выбора
        Scanner global_user = new Scanner(System.in);

        System.out.println("Лабораторная работа №3");
        boolean ProgramWorking = true;
        while(ProgramWorking == true){
            System.out.println("---------------------");
            System.out.println("1 - Первое задание");
            System.out.println("2 - Второе задание");
            System.out.println("3 - Третье задание");
            System.out.println("Введите номер задания: ");
            global_user_choose = global_user.nextInt();

            if(global_user_choose == 1 ){
                Task_One();
            }
            else if(global_user_choose == 2){
                Task_Two();
            }
            else if(global_user_choose == 3){
                Task_Three();
            }
            else{
                System.out.println("Ошибка, введите верное значение");
            }
        }


    }
}
