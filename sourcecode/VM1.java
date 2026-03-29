public class VM1 {
    private MDAEFSM md;
    private AF af;
    private DS1 ds;

    // simple class tha makes all the connections when vm-1 is selected.
    public void vm1Startup(){
        this.af = new CF1();
        this.ds = (DS1) af.getDSobj();
        StorePrice sp = af.getSPobj();
        ZeroCF zcf =  af.getZCFobj();
        IncreaseCF icf = af.getICFobj();
        ReturnCoin rc  = af.getRCobj();
        DisposeDrink dd = af.getDDobj();
        DisposeAdditive da = af.getDAddobj();
        //System.out.println("Creating a MDAEFSM");
        Op<Float> op = new Op<>(this.ds, sp,zcf,icf,da,dd,rc);


        this.md = new MDAEFSM(op);
    }
    public void create(float p) {
        ds.setTemp_p(p);
        md.create();
    }

    public void coin(float v){
        ds.setTemp_v(v);
        if(ds.getCf()+v>= ds.getPrice()){md.coin(1);}
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

