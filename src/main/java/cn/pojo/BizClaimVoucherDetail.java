package cn.pojo;

public class BizClaimVoucherDetail {
    private int id;
    private String item;
    private int account;
    private String des;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BizClaimVoucherDetail that = (BizClaimVoucherDetail) o;

        if (id != that.id) return false;
        if (account != that.account) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (des != null ? !des.equals(that.des) : that.des != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + account;
        result = 31 * result + (des != null ? des.hashCode() : 0);
        return result;
    }
}
