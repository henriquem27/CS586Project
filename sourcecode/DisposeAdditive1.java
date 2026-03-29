public class DisposeAdditive1 implements DisposeAdditive{

    // STRATEGY PATTERN

    // DisposeAdditives based onthe array passed
    @Override
    public void disposeAdd(int[] al) {
        if(al[1]==1){
            System.out.print(" with Sugar");
        }
    }
}
