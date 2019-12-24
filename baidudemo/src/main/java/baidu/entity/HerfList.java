package baidu.entity;

import java.util.List;

/**
 * @author peng.liu
 * @data 2019/12/10 9:37
 */
public class HerfList {
    private int herfId;
    private String herfValue;
    private List<Herf> HerfS;

    public List<Herf> getHerfS() {
        return HerfS;
    }

    public void setHerfS(List<Herf> herfS) {
        HerfS = herfS;
    }

    public int getHerfId() {
        return herfId;
    }

    public void setHerfId(int herfId) {
        this.herfId = herfId;
    }

    public String getHerfValue() {
        return herfValue;
    }

    public void setHerfValue(String herfValue) {
        this.herfValue = herfValue;
    }


    public HerfList() {
    }
}
