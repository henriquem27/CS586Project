public class CF1 implements AF {
    private DS1 ds;
    public CF1() {
        this.ds = new DS1(0.0f,0.0f,0.0f,0.0f);
    }
    @Override
    public IncreaseCF getICFobj() {
        return new IncreaseCF1(this.ds);
    }

    @Override
    public DisposeAdditive getDAddobj() {
        return new DisposeAdditive1();
    }

    @Override
    public DisposeDrink getDDobj() {
        return new DisposeDrink1();
    }

    @Override
    public DS1 getDSobj() {
        return this.ds;
    }

    @Override
    public ReturnCoin getRCobj() {
        return new ReturnCoin1();
    }

    @Override
    public StorePrice getSPobj() {
        return new StorePrice1(this.ds);
    }

    @Override
    public ZeroCF getZCFobj() {
        return new ZeroCF1(this.ds);
    }

}
