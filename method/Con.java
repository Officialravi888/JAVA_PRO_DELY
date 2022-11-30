package method;

public class Con {
    private int gare;
    private int rece;

    Con(int gare, int rece) {
        this.gare = gare;
        this.rece = rece;
    }

    void display() {
        System.out.println(gare + "," + rece);
    }
    public static void main(String[] args) {
        Con obj=new Con(312,213);
        obj.display();

    }
}