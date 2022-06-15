package Chapter5.questions;

public class Encyclopedia extends Book{
    public static String material = "cellulose";
    public Encyclopedia(){
        super();

    }

    public String getMaterial(){
        return super.material;
    }

    public static void main(String[] args) {
        System.out.println(new Encyclopedia().getMaterial());
    }
}
