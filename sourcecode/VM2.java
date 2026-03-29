public class VM2 {
    private MDAEFSM md;
    private AF af;
    private DS2 ds;

    // simple class tha makes all the connections when vm-1 is selected.
    public void vm2Startup(){
        this.af = new CF2();
        this.ds = (DS2) af.getDSobj();
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
    public void CREATE(int p) {
        ds.setTemp_p(p);
        md.create();
    }

    public void coin(int v){
        ds.setTemp_v(v);
        if(ds.getCf()+v>= ds.getPrice()){md.coin(1);}
        else{md.coin(0);}

    }
    public void sugar(){
        md.Additive(1);
    }
    public void cream( ){
        md.Additive(0);
    }
    public void coffee( ){
        md.drink(0);
    }
    public void insertCups(int n){
        md.insert_cup(n);
    }
    public void setprice(int p){
        ds.setTemp_p(p);
        md.set_price();
    }
    public void CANCEL( ){
        md.cancel();
    }

}
