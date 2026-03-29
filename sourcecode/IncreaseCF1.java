// STRATEGY PATTERN
public class IncreaseCF1 implements IncreaseCF{
    private DS1 ds;
    // constructor makes sure we are connected to the correct DS
    public IncreaseCF1(DS1 ds){
        this.ds = ds;
    }
    // grabs the temporary inserted value and current funds and inserts them back into DS
    @Override
    public void IncreaseCF() {
        Float tempv = ds.getTemp_v();
        Float tempcf = ds.getCf();
        ds.setCf(tempcf+tempv);
        System.out.println("Action: Increased Current funds to "+ds.getCf());
    }
}
