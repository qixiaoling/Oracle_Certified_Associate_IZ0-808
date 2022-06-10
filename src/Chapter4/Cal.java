package Chapter4;

public abstract class Cal {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println(" hello ");
        Cal x = null;
        x.calculate();
    }
}
