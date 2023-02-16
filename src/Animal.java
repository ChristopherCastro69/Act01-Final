public abstract class Animal {
    protected int legs = 0;

    public Animal(){};


    protected Animal(int legs){
        this.legs = legs;
    }

    public int getLegs(){
        return legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.printf("Animal walks with " + getLegs());
    }

    public void helloWorld(){
        System.out.printf("Hello World");
        System.out.printf("Hi");
    }
    //Gwapo ko


}
