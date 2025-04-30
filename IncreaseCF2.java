public class IncreaseCF2 implements IncreaseCF {
    private DS2 ds;

    public IncreaseCF2(DS2 ds) {
        this.ds = ds;
    }

    @Override
    public void IncreaseCF(){
        int tempv = ds.getTemp_v();
        int tempcf = ds.getCf();
        ds.setCf(tempcf+tempv);
        System.out.println("Action: Increased Current funds to "+ds.getCf());
    }
}
