package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Second commit");
        Cat firstCat = new Cat("Борис", "бежевый", 2);
        Cat secondCat = new Cat("Мурзик", "черный", 3);

        System.out.println("Данные первого котика: "+firstCat.getName()+", "+firstCat.getColor()
                +", "+firstCat.getAge());
        System.out.println("Данные второго котика: "+secondCat.getName()+", "+secondCat.getColor()
                +", "+secondCat.getAge());
    }
}