public class Start extends State{
    public void vmState(MDAEFSM mda){
        super.vmState(mda);
    }

    public void op(Op op) {
        super.op(op);
    }

    @Override
    public void create(){
        Op.StorePrice();
    }

    @Override
    public int getStateId() {
        return 0;
    }
}
