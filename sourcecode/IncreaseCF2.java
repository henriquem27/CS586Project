
// STRATEGY PATTERN
public class IncreaseCF2 implements IncreaseCF {
    private DS2 ds;
    // constructor makes sure we are connected to the correct DS
    public IncreaseCF2(DS2 ds) {
        this.ds = ds;
    }
    // grabs the temporary inserted value and current funds and inserts them back into DS
    @Override
    public void IncreaseCF(){
        int tempv = ds.getTemp_v();
        int tempcf = ds.getCf();
        ds.setCf(tempcf+tempv);
        System.out.println("Action: Increased Current funds to "+ds.getCf());
    }
}
