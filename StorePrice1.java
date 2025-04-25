public class StorePrice1 implements StorePrice<Float>{
    @Override
    public void storePrice(DS<Float> ds) {
        Float tempPrice = ds.getTemp_p();
        ds.setPrice(tempPrice);
        System.out.println("VM-1 create with price: " + ds.getPrice());
    }
}
