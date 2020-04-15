package cn.pojo;

public class TemplateDetails {
    private int id;
    private int group;
    private String  mName;
    private String single;
    private String uage;
    private String frequency;
    private String day;
    private int total;
    private double mbuy;

    @Override
    public String toString() {
        return "TemplateDetails{" +
                "id=" + id +
                ", group=" + group +
                ", mName=" + mName +
                ", single='" + single + '\'' +
                ", uage='" + uage + '\'' +
                ", frequency='" + frequency + '\'' +
                ", day='" + day + '\'' +
                ", total=" + total +
                ", mbuy=" + mbuy +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String  getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getMbuy() {
        return mbuy;
    }

    public void setMbuy(double mbuy) {
        this.mbuy = mbuy;
    }
}
