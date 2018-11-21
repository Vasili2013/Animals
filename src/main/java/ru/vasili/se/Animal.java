package ru.vasili.se;

class Animal {

    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}

class Cat extends Animal {

    protected boolean sweem;
    int jump;


    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }


    public void catInfo() {
        System.out.println("Кличка Кошки: " + name + " Выносливасть: " + run + " метров" + " Плавание:" + sweem + " Прыжок: " + jump + " метров");
    }
}

class Dog extends Animal {

    public double jump;
    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem, double jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void dogInfo() {
        System.out.println("Кличка Собаки: " + name + " Выносливасть: " + run + " метров" + " Плавание:" + sweem + " Прыжок: " + jump + " метров");
    }
}

class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Категория Кошек");
        Cat cat = new Cat("Рыжик", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Лайка", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}