package com.dfbz.day10.Five;

public class Test {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
        if(dog instanceof Dog){
            Dog d=(Dog) dog;
            d.lookHome();
        }else if(cat instanceof Cat){
            Cat c=(Cat) cat;
            c.catchMouse();
        }
        if(cat instanceof Cat ){
            Cat c=(Cat) cat;
            c.catchMouse();
        }else if(dog instanceof Dog){
            Dog d=(Dog)dog;
            d.lookHome();

        }



    }
}
