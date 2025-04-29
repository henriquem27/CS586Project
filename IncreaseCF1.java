public class IncreaseCF1 implements IncreaseCF{
    private DS1 ds;

    public IncreaseCF1(DS1 ds){
        this.ds = ds;
    }

    @Override
    public void IncreaseCF() {
        Float tempv = ds.getTemp_v();
        Float tempcf = ds.getCf();
        ds.setCf(tempcf+tempv);
        System.out.println("Action: Increased Current funds to "+ds.getCf());
    }
}
