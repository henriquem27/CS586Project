public class DS<T extends Number>{
    protected T temp_p;
    protected T temp_v;
    protected T price;
    protected T cf;

    public DS(T temp_p, T temp_v, T price, T cf) {
        this.temp_p = temp_p;
        this.temp_v = temp_v;
        this.price = price;
        this.cf = cf;
    }
    public T getTemp_p() {
        return temp_p;
    }

    public T getTemp_v() {
        return temp_v;
    }

    public T getPrice() {
        return price;
    }

    public T getCf() {
        return cf;
    }

    public void setTemp_p(T temp_p) {
        this.temp_p = temp_p;
    }
    public void setTemp_v(T temp_v) {
        this.temp_v = temp_v;
    }
    public void setPrice(T price) {
        this.price = price;
    }
    public void setCf(T cf) {
        this.cf = cf;
    }
}
