public class coininserted extends State{
    public coininserted(MDAEFSM mdaefsm, Op<?> op) {
        System.out.println("CoinInserted Initialized");
    }

    @Override
    public int getStateId() {
        return 3;
    }
}

