public class IncreaseCF1 implements IncreaseCF<Float>{
    @Override
    public void IncreaseCF(DS<Float> ds) {
        Float tempv = ds.getTemp_v();
        Float tempcf = ds.getCf();
        ds.setCf(tempcf+tempv);
        System.out.println("Action: Increased Current funds to "+ds.getCf());
    }
}
