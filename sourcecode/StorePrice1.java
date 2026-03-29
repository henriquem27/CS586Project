// Strategy pattern
public class StorePrice1 implements StorePrice{

    private DS1 ds;
    // make conection to correct data store
    public StorePrice1(DS1 ds){
        this.ds = ds;
    }
    @Override
    public void storePrice() {
        Float tempPrice = this.ds.getTemp_p();
        this.ds.setPrice(tempPrice);
        System.out.println("VM-1 create with price: " + this.ds.getPrice());
    }
}
