public class DisposeDrink1 implements DisposeDrink {
    // STRATEGY PATTERN

    // DisposeAdditives based onthe int passed
    @Override
    public void dispose(int d) {
        if (d==1){
            System.out.print("Disposing cappuccino");
        }
        else if (d==2){
            System.out.print("Disposing Chocolate");
        }
    }
}
