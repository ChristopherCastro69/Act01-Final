public class listAnimals {
    private Animal[] animals;

    private int count = 0;

    public listAnimals(int maxArray){
        animals = new Animal[maxArray];
    }

    public boolean addAnimal(Animal a){
        boolean flag = false;
        if(a instanceof Cat || a instanceof Fish){
            if(a instanceof Cat){
                Cat c = (Cat) a;
                if(searchByName(c.getName()) == null);
                animals[count] = c;
                flag = true;
            }
        }
        else{
            Fish f = (Fish) a;
            if(searchByName(f.getName()) == null) {
                animals[count] = f;
            }
            count++;
            flag = true;
        }
        if(!flag){
            System.out.printf("Not in the list");
        }
        return flag;
    }

    public Animal searchByName(String name){
        boolean flag = false;
        for(Animal a:animals){
            if(a instanceof Cat){
                Cat c = (Cat) a;
                if(c.getName().equals(name)){
                    flag = true;
                    return c;
                }
            }
            else{
                Fish f = (Fish) a;
                if(f.getName().equals(name)){
                    flag = true;
                    return f;
                }
            }
        }
        System.out.printf("Animal is not in the list");
        return null;
    }

    public Animal deleteAnimal(String name){
        boolean flag = false;
        Animal a = searchByName(name);
        int ind = 0;
        for(int i = 0; i < count; i++){
            if(animals[i].equals(a)){
                ind = i;
                flag = true;
                break;
            }
        }
        count--;
        for(int i = ind; i < count; i++){
            animals[i] = animals[i+1];
        }
        return a;
    }

    public void display(){
        for(Animal a : animals){
            if(a instanceof Cat){
                Cat c = (Cat) a;
                System.out.printf(c.getName() + "is a cat and has " + c.getLegs() + " legs");
            }
            else if(a instanceof Fish){
                Fish f = (Fish) a;
                System.out.printf(f.getName() + "is a cat and has " + f.getLegs() + " legs");
            }
        }
    }


}
