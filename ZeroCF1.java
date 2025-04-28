public class ZeroCF1 implements ZeroCF<Float>{

    @Override
    public void zeroCF(DS<Float> ds) {
        float tempCF = ds.cf;
        ds.setCf(0f);
        System.out.println("Current fund is 0.0");
    }
}
