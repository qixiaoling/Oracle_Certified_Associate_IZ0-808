package Enthuware.Test2;

public class TestClass {
    public static void main(String[] args) throws Exception{
        Flyer f = new Eagle("American Bald Eagle");
        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).getName());
    }
}
