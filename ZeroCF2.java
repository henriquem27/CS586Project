public class ZeroCF2 implements ZeroCF<Integer> {


    @Override
    public void zeroCF(DS<Integer> ds) {
        float tempCF = ds.cf;
        ds.setCf(0);
        System.out.println("Current fund is 0");
    }
}
