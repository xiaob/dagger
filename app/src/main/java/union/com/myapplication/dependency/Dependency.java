package union.com.myapplication.dependency;

public class Dependency{


    static class Person{
        public void buy(House house){

        }

        public void buy(Car house){

        }
    }


    static class House{

    }

    static class Car{

    }

    public static void main(String ... args){
        Person person = new Person();
        person.buy(new House());
        person.buy(new Car());

    }

}

