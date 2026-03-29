// STRATEGY PATTERN

public class ZeroCF1 implements ZeroCF{
    private DS1 ds;
    // initialize pointer
    public ZeroCF1(DS1 ds){this.ds = ds;}
    // set funds to zero.
    @Override
    public void zeroCF() {
        float tempCF = ds.cf;
        ds.setCf(0f);
        ds.setTemp_v(0f);
        System.out.println(" \n Current fund is "+ds.getCf());
    }
}
