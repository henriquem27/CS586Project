public class DisposeAdditive1 implements DisposeAdditive{
    @Override
    public void disposeAdd(int[] al) {
        if(al[1]==1){
            System.out.println("Added Sugar to Drink");
        }
    }
}
