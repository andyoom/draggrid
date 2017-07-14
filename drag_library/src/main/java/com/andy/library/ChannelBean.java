package com.andy.library;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/14 11:57
 */
public class ChannelBean {
    private String name;
    private boolean isSelect;

    public ChannelBean(String name, boolean isSelect) {
        this.name = name;
        this.isSelect = isSelect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
