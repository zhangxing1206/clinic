package cn.pojo;

import lombok.Data;

@Data
public class Drug {
    private Long id;
    /**
     * 药品编号
     */
    private String mNo;

    /**
     * 药品名称
     */
    private String mName;

    /**
     * 规格
     */
    private String mSize;

    private String rename;

    private double mSell;

    private double mBuy;
    //库存
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * 厂家
     */
    private String  mFactory;

    private int status;

    private String  createTime;

    private Vender vender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSize() {
        return mSize;
    }

    public void setmSize(String mSize) {
        this.mSize = mSize;
    }

    public String getTypeName() {
        return rename;
    }

    public void setTypeName(String rename) {
        this.rename = rename;
    }

    public double getmSell() {
        return mSell;
    }

    public void setmSell(double mSell) {
        this.mSell = mSell;
    }

    public double getmBuy() {
        return mBuy;
    }

    public void setmBuy(double mBuy) {
        this.mBuy = mBuy;
    }

    public String getmFactory() {
        return mFactory;
    }

    public void setmFactory(String mFactory) {
        this.mFactory = mFactory;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Vender getVender() {
        return vender;
    }

    public void setVender(Vender vender) {
        this.vender = vender;
    }
}
