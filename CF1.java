public class CF1 implements AF {
    @Override
    public IncreaseCF<Float> getICFobj() {
        return new IncreaseCF1();
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
    public DS<Float> getDSobj() {
        return new DS<>(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public ReturnCoin getRCobj() {
        return new ReturnCoin1();
    }

    @Override
    public StorePrice<Float> getSPobj() {
        return new StorePrice1();
    }

    @Override
    public ZeroCF<Float> getZCFobj() {
        return new ZeroCF1();
    }

}
