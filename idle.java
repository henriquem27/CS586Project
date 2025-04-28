public class idle extends State{
    public idle(MDAEFSM mda, Op<?> op) {
        vmState(mda);
        setOp(op);
        System.out.println("State: Start Initialized");
    }
    @Override
    public void coin(int f){
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
