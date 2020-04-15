package cn.pojo;

public class Cost {
    private Integer id;
    private String cName;
    private double cPrice;
    private Integer reTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setcPrice(double cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getReTypeId() {
        return reTypeId;
    }

    public void setReTypeId(Integer reTypeId) {
        this.reTypeId = reTypeId;
    }
}
