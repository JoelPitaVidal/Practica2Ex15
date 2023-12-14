public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");


    Singleton instasncia = Singleton.getInstance();
    instasncia.setAtributo2(0);
    instasncia.setAtributo(1);
        System.out.println(instasncia.getAtributo2());
        System.out.println(instasncia.getAtributo());
    }
}
