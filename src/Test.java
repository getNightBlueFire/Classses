

public class Test {
    public static void main(String[] args) {
        Transport bus = new Transport();
        Person dima = new Person();
        dima.buyTransport(100);
        System.out.println("dima have car now:"+ dima.hasCar);
        System.out.println(dima.money);


    }


}
