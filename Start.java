public class Start extends State{
    public void vmState(MDAEFSM mda){
        super.vmState(mda);
    }

    public Start(MDAEFSM mda, Op<?> op) {
        vmState(mda);
        setOp(op);
        System.out.println("State: Start Initialized");
    }

    @Override
    public void create() {
        System.out.println("EVENT -> create() in state Start");
        op.StorePrice(); // Store the price set in VM1.create() via temp_p
        // Transition to Idle
    }

    @Override
    public int getStateId() {
        return 0;
    }
}
