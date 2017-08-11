package com.navigationdrawersample;

/**
 * Created by sysadmin on 11/8/17.
 */

public class MenuNavItem {
    private int mIcon;
    private String mTittle;
    public MenuNavItem(String mTittle,int mIcon){
        this.mIcon = mIcon;
        this.mTittle = mTittle;

    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public String getmTittle() {
        return mTittle;
    }

    public void setmTittle(String mTittle) {
        this.mTittle = mTittle;
    }
}
