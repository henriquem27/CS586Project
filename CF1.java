public class CF1 implements AF {
    @Override
    public IncreaseCF getICFobj() {
        return null;
    }

    @Override
    public DisposeAdditive getDAddobj() {
        return null;
    }

    @Override
    public DisposeDrink getDDobj() {
        return null;
    }

    @Override
    public DS<Float> getDSobj() {
        return new DS<>(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public ReturnCoin getRCobj() {
        return null;
    }

    @Override
    public StorePrice<Float> getSPobj() {
        return new StorePrice1();
    }

    @Override
    public ZeroCF getZCFobj() {
        return null;
    }

}
