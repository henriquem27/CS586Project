// STATE PATTERN


//
public class Start extends State{
    // initializes start state
    public Start(MDAEFSM mda, Op<?> op, Data data_obj) {
        super(mda, op, data_obj);
        System.out.println("State: Start Initialized");
    }

    //create method
    @Override
    public void create() {
        //System.out.println("EVENT -> create() in state Start");
        op.StorePrice(); // Store the price set in VM1.create() via temp_p

    }

    @Override
    public int getStateId() {
        return 0;
    }
}
