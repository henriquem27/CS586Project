public class Op<T extends Number> {
    // pointers
    private DS<T> ds;
    private StorePrice<T> sp;


    public Op(DS<?> ds, StorePrice<?> sp) {
        this.ds = (DS<T>) ds;
        this.sp = (StorePrice<T>) sp;
        // Initialize other action fields here
    }
    public void DisposeAdditive(int[] al) {
        System.out.println("In op disposeAdditive ");
    }
    public void DisposeDrink(int d) {
        System.out.println("In op disposeDrink");
    }
    public void StorePrice() {
        System.out.println("In op store price");
        sp.storePrice(ds);
    }
    public void ZeroCF(){
        System.out.println("In op ZeroCF");
    } // zero Cumulative Fund cf
    public void  IncreaseCF(){
        System.out.println("In IncreaseCF");
    } // increase Cumulative Fund cf
    public void ReturnCoins(){
        System.out.println("In op ReturnCoins");
    }//

}
