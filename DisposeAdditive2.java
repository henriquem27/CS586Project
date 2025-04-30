public class DisposeAdditive2 implements DisposeAdditive{
    @Override
    public void disposeAdd(int[] al) {
        if(al[1]==1 && al[0]==1) {
            System.out.print(" With Sugar and Cream");
        }
        if(al[1]==0 && al[0]==1) {
            System.out.print(" With Cream");
        }
        if(al[1]==1 && al[0]==0) {
            System.out.print(" With Sugar");
        }
    }
}
