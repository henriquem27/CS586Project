public class nocups extends State{
    public nocups(MDAEFSM mda, Op<?> op,Data data_obj) {
        super(mda,op,data_obj);
        System.out.println("State: Start Initialized");
    }

   public void coin(int f){
        System.out.println("State no cups: Coin "+f);
        op.ReturnCoins();
   }
   public void insert_cups(int n){
        op.ZeroCF();
   }
    @Override
    public int getStateId() {
        return 1;
    }
}

