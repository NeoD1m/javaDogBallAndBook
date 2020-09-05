package mirea.ru.lab1;

public class Ball {

    private String color;
    private Float size;

    public  Ball(String color, Float size){
        this.color = color;
        this.size = size;
    }

    public void GetBallSize(){
        System.out.println("Ball size is " + size);
    }
    public void GetBallColor(){
        System.out.println("Ball color is " + color);
    }
}
