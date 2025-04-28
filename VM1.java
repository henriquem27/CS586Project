public class VM1 {
    private MDAEFSM md;
    private AF af;

    public void create(float p) {
        this.af = new CF1();
        DS<Float> ds = (DS<Float>) af.getDSobj(); // Cast needed if AF returns DSInterface<?>
        StorePrice<Float> sp = (StorePrice<Float>) af.getSPobj();
        System.out.println("Creating a MDAEFSM");
        this.af = new CF1(); // 1. Create the factory for VM1
        Op<Float> op = new Op<>(ds, sp);

        // 4. Create MDAEFSM, injecting the Op object
        this.md = new MDAEFSM(op);
        ds.setTemp_p(p);
        md.create();
    }

    public void coin(float v){}
    public void card(float x){}
    public void sugar( ){}
    public void cappuccino( ){}
    public void chocolate( ){}
    public void insert_cups(int n){}
    public void set_price(float p){}
    public void cancel( ){}
}

