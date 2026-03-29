
// STRATEGY PATTERN
public class StorePrice2 implements StorePrice{
    private  DS2 ds;
    // make conection to correct data store
    public StorePrice2(DS2 ds) {
        this.ds=ds;
    }
    @Override
    public void storePrice() {
        int tempPrice = this.ds.getTemp_p();
        this.ds.setPrice(tempPrice);
        System.out.println("VM-2 create with price: " + this.ds.getPrice());
    }
}
