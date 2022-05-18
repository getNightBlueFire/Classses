class Person {
    String gender;
    String name;
    byte age;
    int money;
    boolean hasCar;
    Person(){

    }
    void buyTransport(int cost){
        money = money-cost;
        hasCar = true;
    }

}
