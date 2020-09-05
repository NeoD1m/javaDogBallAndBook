package mirea.ru.lab1;

public class Dog {

    private String name;
    private Float age;
    private Float weight;

    public  Dog(String name, Float age,Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void GetDogName(){
        System.out.println("Dog name is " + name);
    }
    public void GetDogAge(){
        System.out.println("Dog age is " + age);
    }
    public void GetDogWeight(){
        System.out.println("Dog weight is " + weight);
    }
    public void FeedTheDog(Float foodAmount){
        weight += foodAmount;
        System.out.println("Dog ate " + foodAmount + " it weights now " + weight);
    }
    public void GetDogAgeInHumanYears(){
        System.out.println("Dog age in human years is " + age*7);
    }
}
