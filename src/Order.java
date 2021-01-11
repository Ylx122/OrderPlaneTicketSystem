import java.util.Set;

//TODO 订单类
public class Order {     //订单类
    private String id;             //ID
    private String jpjg;           //机票价格
    private float airPortTax;      //机场税
    private float ryf;             //燃油费
    private float hkzhx;           //航空综合险
    private float jptgx;           //机票退改险
    private float yhq;             //优惠券
    private float hszj;            //含税总价
    //private Customer customers[];  //数组的形式
    private Set<Customer> customersSet;   //采用集合的形式 ——> 泛型


    //TODO Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJpjg() {
        return jpjg;
    }

    public void setJpjg(String jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<Customer> getCustomersSet() {
        return customersSet;
    }

    public void setCustomersSet(Set<Customer> customersSet) {
        this.customersSet = customersSet;
    }
}
