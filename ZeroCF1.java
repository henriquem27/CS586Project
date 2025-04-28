public class ZeroCF1 implements ZeroCF<Float>{

    @Override
    public void zeroCF(DS<Float> ds) {
        float tempCF = ds.cf;
        ds.setCf(0f);
        ds.setTemp_v(0f);
        System.out.println("Current fund is"+ds.getCf());
    }
}
