public class DisposeDrink2 implements DisposeDrink{
    @Override
    public void dispose(int d) {
        if (d==0){
            System.out.print("Disposing coffee");
        }
    }
}
