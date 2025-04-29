public class MDAEFSM {
    protected State startState;
    protected State idleState;
    protected State noCupsState;
    protected State coinsInsertedState;
    protected State currentState;
    protected Op<?> op;
    protected Data data;
    /* Array al organization
     * | 0     |   1   |
     * | ------| ----- |
     * | Cream | sugar |
     */


    public MDAEFSM(Op<Float> op) {
        this.op = op;
        this.data = new Data();
        startState = new Start(this, op,data);
        idleState = new idle(this, op,data);
        noCupsState = new nocups(this, op,data);
        coinsInsertedState = new coininserted(this, op,data);
        currentState = startState;
        System.out.println("MDAEFSM: Initialized. Current state: " + currentState.getClass().getSimpleName());


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
                int oldK = data.getK(); // Store k before incrementing
                data.setK(n+oldK);
                // if not in the idle state yet we have to switch to it.
                if (currentState.getStateId()==1) {
                    currentState.insert_cups(n);
                    changeState(getIdleState());
                }
            }

    }

    public void coin(int f) {
        currentState.coin(f);
        int[] al= data.getAl();
        if(currentState.getStateId()==2) {
            if (f == 0) {
                System.out.println("Need more funds");
            } else {
                System.out.println("Select Drinks and Additives");
                // perform action and change state
                //zero additives
                al[0] = 0;
                al[1] = 0;
                data.setAl(al);
                changeState(getCoinsInsertedState());
            }
        }



    }
    public void card() {
        currentState.card();
        int[] al= data.getAl();
        if(currentState.getStateId()==2) {
            // just return coins.
            //zero additives
            al[0]=0;
            al[1]=0;
            data.setAl(al);
            changeState(getCoinsInsertedState());
        }
    }

    public void Additive(int a){
        // just set the array.
        int[] al= data.getAl();
        if(currentState.getStateId()==3) {
            if (a == 0) {
                if (al[0] == 0) {
                    al[0] = 1;
                    data.setAl(al);
                } else {
                    al[0] = 0;
                    data.setAl(al);
                }
            }
            if (a == 1) {
                if(al[1] == 1) {
                    al[1] = 1;
                    data.setAl(al);
                } else {
                    al[1] = 1;
                    data.setAl(al);
                }
            }
        }
    }
    public void drink(int type){
        int k= data.getK();
        if(currentState.getStateId()==3) {
            if(k<=1){
                // need to change state to no cups
                currentState.dispose_drink(type);
                k=k-1;
                data.setK(k);
                changeState(getNoCupsState());
            }
            else{
                // just perform action
                currentState.dispose_drink(type);
                k=k-1;
                data.setK(k);
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


}
