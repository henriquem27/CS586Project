public class Op<T extends Number> {
    // pointers
    private DS<T> ds;
    private StorePrice<T> sp;

    public Op(DS<?> ds, StorePrice<?> sp) {
        this.ds = (DS<T>) ds;
        this.sp = (StorePrice<T>) sp;
        // Initialize other action fields here
    }
    public static void disposeAdd(int[] al) {

    }
    public static void dispose(int d) {
    }
    public void StorePrice() {
        System.out.println("In op store price");
        sp.storePrice(ds);
    }
    public static void ZeroCF(){} // zero Cumulative Fund cf
    public static void  IncreaseCF(){} // increase Cumulative Fund cf
    public static void ReturnCoins(){}//

}
