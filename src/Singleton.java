public class Singleton {
    private int atributo;
    private int atributo2;
    private Singleton() {}

    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }



    public void setAtributo2(int atributo2) {this.atributo2 = atributo2;}
    public int getAtributo2() {return atributo2;}
    public void setAtributo(int atributo) {this.atributo = atributo;}
    public int getAtributo() {return atributo;}
}
