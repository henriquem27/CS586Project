public class MDAEFSM {
    protected State startState;
    protected State idleState;
    protected State noCupsState;
    protected State coinsInsertedState;
    protected State currentState;
    protected Op<?> op;
    protected int k;

    public MDAEFSM(Op<Float> op) {
        this.op = op;

        startState = new Start(this, op);
        currentState = startState;
        System.out.println("MDAEFSM: Initialized. Current state: " + currentState.getClass().getSimpleName());

        // Initialize EFSM data
        this.k = 0; // Start with 0 cups
        System.out.println("MDAEFSM: Initial cup count (k) = " + this.k);
    }

    public void create(){
        System.out.println("In mda store price");

        currentState.create();
    }
}
