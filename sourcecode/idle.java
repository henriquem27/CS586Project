// STATE PATTERN
// represents state after cups are inserted
public class idle extends State{

    // make necessary connections to pointers
    public idle(MDAEFSM mda, Op<?> op,Data data) {
        super(mda,op,data);

    }

    // peform action in opp
    @Override
    public void coin(int f){
        // reset additional array
        if (f==1){
            int[] al= data.getAl();
            //zero additives
            al[0]=0;
            al[1]=0;
            data.setAl(al);
        }
        //System.out.println("State: Idle coin");
        op.IncreaseCF();
    }// increase cup count
    @Override
    public void insert_cups(int n){
        int oldK = data.getK(); // Store k before incrementing
        data.setK(n+oldK);
    }
    // just zero since card should be full price
    @Override
    public void card(){
        int[] al= data.getAl();
        //zero additives
        al[0]=0;
        al[1]=0;
        data.setAl(al);
        op.ZeroCF();
    }

    // set new price.
    @Override
    public void set_price(){
        op.StorePrice();
    }
    @Override
    public int getStateId() {
        return 2;
    }
}
