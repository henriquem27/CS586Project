public class DisposeDrink2 implements DisposeDrink{

    // STRATEGY PATTERN

    // DisposeAdditives based on the int passed
    @Override
    public void dispose(int d) {
        if (d==0){
            System.out.print("Disposing coffee");
        }
    }
}
