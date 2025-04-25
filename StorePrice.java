
// generic implementation because we can store ints and floats
public interface StorePrice<T extends Number> {
    public void storePrice(DS<T> ds);
}
