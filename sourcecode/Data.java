
/*
* Class that stores the array and cups data used by state and mdefsm
* */


public class Data {
    protected int k;
    protected int[] al;
    /* Array al organization
     * | 0     |   1   |
     * | ------| ----- |
     * | Cream | sugar |
     */
    // constructor to initialize it
    public Data() {
        this.k = 0;
        this.al = new int[2];
        this.al[0] = 0;
        this.al[1] = 0;
    }
    // getter and setters for data manipulation
    public int getK() {
        return k;
    }

    public int[] getAl() {
        return al;
    }

    public void setAl(int[] al) {
        this.al = al;
    }

    public void setK(int k) {
        this.k = k;
    }
}
