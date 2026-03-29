
// STATE PATTERN


public class nocups extends State{
    // initialize pointers
    public nocups(MDAEFSM mda, Op<?> op,Data data_obj) {
        super(mda,op,data_obj);
        //System.out.println("State: Start Initialized");
    }
    // add coins
    @Override
   public void coin(int f){
        //System.out.println("State no cups: Coin "+f);
        op.ReturnCoins();
   }
   // insert cups and zerocf() because moving to idle state
   @Override
   public void insert_cups(int n){
       int oldK = data.getK(); // Store k before incrementing
       data.setK(n+oldK);
        op.ZeroCF();
   }
    @Override
    public int getStateId() {
        return 1;
    }
}

