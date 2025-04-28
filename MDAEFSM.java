public class MDAEFSM {
    protected State startState;
    protected State idleState;
    protected State noCupsState;
    protected State coinsInsertedState;
    protected State currentState;
    protected Op<?> op;
    protected int k;
    /* Array al organization
     * | 0     |   1   |
     * | ------| ----- |
     * | Cream | sugar |
     */
    protected int[] al;

    public MDAEFSM(Op<Float> op) {
        this.op = op;

        startState = new Start(this, op);
        idleState = new idle(this, op);
        noCupsState = new nocups(this, op);
        coinsInsertedState = new coininserted(this, op);
        currentState = startState;
        System.out.println("MDAEFSM: Initialized. Current state: " + currentState.getClass().getSimpleName());

        // Initialize EFSM data
        this.al = new int[2];
        al[0]=0;
        al[1]=0;
        this.k = 0; // Start with 0 cups
        System.out.println("MDAEFSM: Initial cup count (k) = " + this.k);
    }
    public void changeState(State newState) {
        currentState = newState;
    }

    public void create() {
        System.out.println("In mda store price");
        // do action if we are in start state only
        if (currentState.getStateId()==0) {
            currentState.create();
            // change state
            changeState(getNoCupsState());
        }
    }
    public void insert_cup(int n) {

            if (n > 0) {
                int oldK = this.k; // Store k before incrementing
                this.k = this.k + n;
                // if not in the idle state yet we have to switch to it.
                if (currentState.getStateId()==1) {
                    currentState.insert_cups(n);
                    changeState(getIdleState());
                }
            }

    }

    public void coin(int f) {
        if(currentState.getStateId()==1 ) {
            // just return coins.
            currentState.coin(f);
        }
        if(currentState.getStateId()==2) {
            if(f==0){
                currentState.coin(f);

            }
            else{
                // perform action and change state
                currentState.coin(f);
                //zero additives
                al[0]=0;
                al[1]=0;
                changeState(getCoinsInsertedState());
            }

        }
        if(currentState.getStateId()==3) {
            currentState.coin(f);
        }

    }
    public void card() {
        if(currentState.getStateId()==2) {
            // just return coins.
            currentState.card();
            //zero additives
            al[0]=0;
            al[1]=0;
            changeState(getCoinsInsertedState());
        }
    }

    public void Additive(int a){
        // just set the array.
        if(currentState.getStateId()==3) {
            if (a == 0) {
                if (al[0] == 0) {
                    al[0] = 1;
                } else {
                    al[0] = 0;
                }
            }
            if (a == 1) {
                if (al[0] == 1) {
                    al[0] = 1;
                } else {
                    al[0] = 1;
                }
            }
        }
    }
    public void drink(int type){
        if(currentState.getStateId()==3) {
            if(k<=1){
                // need to change state to no cups
                currentState.dispose_drink(type);
                k=k-1;
                changeState(getNoCupsState());
            }
            else{
                // just perform action
                currentState.dispose_drink(type);
                k=k-1;
            }
        }
    }
    public void cancel(){
        if(currentState.getStateId()==3) {
            // perform action and change state
            currentState.cancel();
            changeState(getIdleState());
        }

    }
    public void set_price(){
        if(currentState.getStateId()==2) {
            currentState.set_price();
        }
    }

    public State getStartState() { return startState; }
    public State getIdleState() { return idleState; }
    public State getNoCupsState() { return noCupsState; }
    public State getCoinsInsertedState() { return coinsInsertedState; }

    public int getK() { return k; }
    public int[] getAl() { return al; }
}
