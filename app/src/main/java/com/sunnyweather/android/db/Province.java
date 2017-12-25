package com.sunnyweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ctt on 2017/12/25.
 */

public class Province extends DataSupport {
    private int id;
    private String proName;
    private int proCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProName(){
        return proName;
    }
    public void setProName(String proName){
        this.proName=proName;
    }
    public int getProCode(){
        return proCode;
    }
    public void setProCode(int proCode){
        this.proCode=proCode;
    }
}
