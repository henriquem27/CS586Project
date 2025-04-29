public class Op<T extends Number> {
    // pointers
    private DS<T> ds;
    private StorePrice sp;
    private ZeroCF zcf;
    private IncreaseCF icf;
    private DisposeAdditive da;
    private DisposeDrink dd;
    private ReturnCoin rc;
    public Op(DS<?> ds, StorePrice sp,ZeroCF zcf,IncreaseCF icf,DisposeAdditive da,DisposeDrink dd,ReturnCoin rc) {
        this.ds = (DS<T>) ds;
        this.sp = sp;
        this.zcf= zcf;
        this.icf = icf;
        this.da = da;
        this.dd = dd;
        this.rc = rc;
        // Initialize other action fields here
    }
    public void DisposeAdditive(int[] al) {
        System.out.println("In op disposeAdditive ");
        da.disposeAdd(al);
    }
    public void DisposeDrink(int d) {
        dd.dispose(d);
        System.out.println("In op disposeDrink");
    }
    public void StorePrice() {
        System.out.println("In op store price");
        sp.storePrice();
    }
    public void ZeroCF(){
        System.out.println("In op ZeroCF");
        zcf.zeroCF();
    } // zero Cumulative Fund cf
    public void  IncreaseCF(){
        System.out.println("In IncreaseCF");
        icf.IncreaseCF();
    } // increase Cumulative Fund cf
    public void ReturnCoins(){
        System.out.println("In op ReturnCoins");
        rc.returnCoin();
    }

}
