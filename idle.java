public class idle extends State{
    public idle(MDAEFSM mda, Op<?> op,Data data) {
        super(mda,op,data);
        //System.out.println("State: Start Initialized");
    }
    @Override
    public void coin(int f){
        //System.out.println("State: Idle coin");
        op.IncreaseCF();
    }
    @Override
    public void card(){
        op.ZeroCF();
    }
    @Override
    public void set_price(){
        op.StorePrice();
    }
    @Override
    public int getStateId() {
        return 2;
    }
}
