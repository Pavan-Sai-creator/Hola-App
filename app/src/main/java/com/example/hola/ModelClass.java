package com.example.hola;

public class ModelClass {

    private int appIcon;
    private String appName;
    private String divider;

    ModelClass(int appIcon,String appName,String divider){
        this.appIcon = appIcon;
        this.appName = appName;
        this.divider = divider;
    }

    public int getAppIcon() {
        return appIcon;
    }

    public String getAppName() {
        return appName;
    }

    public String getDivider() {
        return divider;
    }
}
