/*
*
* ABSTRACT FACTORY PATTERN
* Returns pointers  object for vm2 strategies.
* */


public class CF2 implements AF{
    private DS2 ds;
    public CF2() {
        this.ds = new DS2(0,0,0,0);
    }
    @Override
    public IncreaseCF getICFobj() {
        return new IncreaseCF2(this.ds);
    }

    @Override
    public DisposeAdditive getDAddobj() {
        return new DisposeAdditive2();
    }

    @Override
    public DisposeDrink getDDobj() {
        return new DisposeDrink2();
    }

    @Override
    public DS getDSobj() {
        return this.ds;
    }

    @Override
    public ReturnCoin getRCobj() {
        return new ReturnCoin2();
    }

    @Override
    public StorePrice getSPobj() {
        return new StorePrice2(this.ds);
    }

    @Override
    public ZeroCF getZCFobj() {
        return new ZeroCF2(this.ds);
    }
}
