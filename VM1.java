public class VM1 {
    private MDAEFSM md;
    private AF af;
    private DS<Float> ds;

    // simple class tha makes all the connections when vm-1 is selected.
    public void vm1Startup(){
        this.af = new CF1();
        this.ds = (DS<Float>) af.getDSobj(); // Cast needed if AF returns DSInterface<?>
        StorePrice<Float> sp = (StorePrice<Float>) af.getSPobj();
        System.out.println("Creating a MDAEFSM");
        this.af = new CF1(); // 1. Create the factory for VM1
        Op<Float> op = new Op<>(ds, sp);

        // 4. Create MDAEFSM, injecting the Op object
        this.md = new MDAEFSM(op);
    }
    public void create(float p) {

        ds.setTemp_p(p);
        md.create();
    }

    public void coin(float v){
        ds.setTemp_v(v);
        if(ds.getCf()>= ds.getPrice()){md.coin(1);}
        else{md.coin(0);}

    }
    public void card(float x){
        if(x>= ds.getPrice()){md.card();}
    }
    public void sugar(){
        md.Additive(1);
    }
    public void cappuccino( ){
        md.drink(1);
    }
    public void chocolate( ){
        md.drink(2);
    }
    public void insert_cups(int n){
        md.insert_cup(n);
    }
    public void set_price(float p){
        ds.setTemp_p(p);
        md.set_price();
    }
    public void cancel( ){
        md.cancel();
    }


}

