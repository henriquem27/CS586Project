public class DisposeDrink1 implements DisposeDrink {
    @Override
    public void dispose(int d) {
        if (d==1){
            System.out.println("Disposing cappuccino");
        }
        else if (d==2){
            System.out.println("Disposing Chocolate");
        }
    }
}
