public class MDAEFSM {

    protected State currentState;
    protected Op<?> op;
    protected Data data;
    private State[] SL;

    // constructor creates and initializes the state patterns necessary states and the appropriate connections for those states
    public MDAEFSM(Op<Float> op) {
        this.op = op;
        this.data = new Data();
        SL = new State[4];
        // state store states ath the list index
        SL[0] = new Start(this, op,data);
        SL[1] = new nocups(this, op,data);
        SL[2] = new idle(this, op,data);
        SL[3] = new coininserted(this, op,data);
        currentState = SL[0];// start at start state
        //System.out.println("MDAEFSM: Initialized. Current state: " + currentState.getClass().getSimpleName());

    }
    // change state function
    public void changeState(int index) {
        currentState = SL[index];
    }

    // create a call create on start state and change state
    public void create() {
       //System.out.println("In mda store price");
        // do action if we are in start state only
        if (currentState.getStateId()==0) {
            currentState.create();
            // change state
            changeState(1);
        }
    }
    // insert n cups into the data store and calls the action on the state, only change state if we are no cups state.
    public void insert_cup(int n) {

            if (n > 0) {

                // if not in the idle state yet we have to switch to it.
                if (currentState.getStateId()==1) {
                    currentState.insert_cups(n);
                    changeState(2);
                }
                else{
                    currentState.insert_cups(n);
                }
            }

    }
// zero the additives array if we inserted coins and change state
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
                changeState(3);
            }
        }



    }
    // card action no need to check for price and change state
    public void card() {
        currentState.card();

        if(currentState.getStateId()==2) {
            changeState(3);
        }
    }
    // set the correct additive array based on the selection
    public void Additive(int a){


        if(currentState.getStateId()==3) {
            currentState.additive(a);
        }
    }

    // dispose appropriate drink type
    public void drink(int type){
        int k= data.getK();
        if(currentState.getStateId()==3) {
            if(k<=1){
                // need to change state to no cups after the last cup
                currentState.dispose_drink(type);

                changeState(1);
            }
            else{
                // just perform action
                currentState.dispose_drink(type);
                changeState(2);

            }
        }
    }
    // cancel and change state
    public void cancel(){
        if(currentState.getStateId()==3) {
            // perform action and change state
            currentState.cancel();
            changeState(2);
        }

    }
    // reset machine price
    public void set_price(){
        if(currentState.getStateId()==2) {
            currentState.set_price();
        }
    }


}
