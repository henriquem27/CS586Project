import java.util.Arrays;
/*
* STATE PATTERN
* represents the state were sufficient funds have been insered
* */
public class coininserted extends State{
    // constructor to make appropriate connections
    public coininserted(MDAEFSM mdaefsm, Op<?> op,Data data_obj) {
        super(mdaefsm,op,data_obj);
        //System.out.println("State: Start Initialized");
    }

    // sends to op the correct actions for disposing drink with the appropriate data
    @Override
    public void dispose_drink(int d){
        //System.out.println("State CI: Disposing Drink");
        //System.out.println("Integer Array: " + Arrays.toString(data.getAl()));
        op.DisposeDrink(d);
        int oldk = data.getK();
        data.setK(oldk-1);
        op.DisposeAdditive(data.getAl());

        op.ZeroCF();
    }
    // if we insert coins in at this state just return coins
    @Override
    public void coin(int f){
        //System.out.println("State CI: Coin "+f);
        if(f==1){
            op.ReturnCoins();
        }
    }
    // just set the array.
    public void additive(int a){
        // just set the array.
        int[] al= data.getAl();

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
    // return coins and zero the cf
    public void cancel(){
        op.ReturnCoins();
        op.ZeroCF();
    }
    // returns appropriate state id for state change
    @Override
    public int getStateId() {
        return 3;
    }

}

