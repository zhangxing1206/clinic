package cn.utils;


public class Page {
    private int count;
    private int pageCount;
    private int index;
    private int size;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        if(count>0){
            pageCount=count%size==0?count/size:count/size+1;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
