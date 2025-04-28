public class coininserted extends State{
    public coininserted(MDAEFSM mdaefsm, Op<?> op) {
        this.mda = mdaefsm;
        vmState(mda);
        setOp(op);
        System.out.println("State: Start Initialized");
    }
    @Override
    public void dispose_drink(int d){
        System.out.println("State CI: Disposing Drink");
        op.DisposeAdditive(mda.getAl());
        op.DisposeDrink(d);
        op.ZeroCF();
    }
    @Override
    public void coin(int f){
        System.out.println("State CI: Coin "+f);
        if(f==1){
            op.ReturnCoins();
        }
    }
    public void cancel(){
        op.ReturnCoins();
        op.ZeroCF();
    }
    @Override
    public int getStateId() {
        return 3;
    }

}

