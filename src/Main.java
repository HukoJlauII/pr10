public class Main {
    public static void main(String[] args) {
        ConcreteFactory fact=new ConcreteFactory();
        System.out.println(fact.CreateComplex(5,6));
        System.out.println(fact.createComplex());

        Client client=new Client();
        ChairFactory chfact =new ChairFactory();
        client.setChair(chfact.createFunctionalChair());
        MagicChair mch=chfact.createMagicianChair();
        client.sit();
        mch.doMagic();
    }
}
