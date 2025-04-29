abstract class State {
    protected MDAEFSM mda;
    protected Op<?> op;
    protected Data data;


    public State(MDAEFSM mdaefsm, Op<?> op_obj, Data data_obj) {
        this.mda = mdaefsm;
        this.op = op_obj;
        this.data = data_obj;
    }

    public abstract int getStateId();
    public void create() {System.out.println("Operation create not available in this state.");}
    public void insert_cups(int n) {System.out.println("Inser_Cups not on this state");} // n represents # of cups
    public void coin(int f){System.out.println("Coin() not on this state");} // f=1: sufficient funds inserted for a drink
    public void card(){System.out.println("Card not on this state");}
    public void cancel(){System.out.println("cancel not on this state");}
    public void set_price(){System.out.println(" Set_Price not on this state");}
    public void dispose_drink(int d){System.out.println("DD not on this state");}
    public void additive(int a){System.out.println("Additive not on this state");}

}
