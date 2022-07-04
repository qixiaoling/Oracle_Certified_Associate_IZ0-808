package Enthuware.Test2;

public class Q44 {
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        Q44 tc = new Q44();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        int x = 0;
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
                x = m;
            }
        }

    }
}
