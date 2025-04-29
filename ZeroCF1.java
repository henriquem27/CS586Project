public class ZeroCF1 implements ZeroCF{
    private DS1 ds;
    public ZeroCF1(DS1 ds){this.ds = ds;}

    @Override
    public void zeroCF() {
        float tempCF = ds.cf;
        ds.setCf(0f);
        ds.setTemp_v(0f);
        System.out.println("Current fund is"+ds.getCf());
    }
}
