// STRATEGY PATTERN

public class ZeroCF2 implements ZeroCF{
    private DS2 ds;
   // initialize pointer
    public ZeroCF2(DS2 ds) {
        this.ds = ds;

    }
    @Override
    public void zeroCF() {
        int tempCF = ds.cf;
        ds.setCf(0);
        ds.setTemp_v(0);
        System.out.println(" \n Current fund is "+ds.getCf());
    }
}
