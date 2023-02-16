public class Fish extends Animal implements Pet{

    private String name;

    public Fish(){};
    public Fish(String name){
        super(0);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.printf(this.name + " is eating");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf(this.name + " is playing!");
    }
}
