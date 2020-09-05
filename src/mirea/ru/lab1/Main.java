package mirea.ru.lab1;

public class Main {
    public static void main(String[] args) {

        Ball rebBall = new Ball("red",10f);

        rebBall.GetBallSize();
        rebBall.GetBallColor();

        Separate();

        Dog strayDog = new Dog("Danny",3f,14f);
        strayDog.GetDogName();
        strayDog.GetDogAge();
        strayDog.GetDogAgeInHumanYears();
        strayDog.GetDogWeight();
        strayDog.FeedTheDog(3f);

        Separate();

        Book oldBook = new Book("1984",true);
        oldBook.GetBookName();
        oldBook.CloseTheBook();
        oldBook.OpenTheBook();
        oldBook.OpenTheBook();
        oldBook.CloseTheBook();
    }
    public static void Separate(){
        System.out.println("///////////////////////////////////////////////////////");
    }
}
