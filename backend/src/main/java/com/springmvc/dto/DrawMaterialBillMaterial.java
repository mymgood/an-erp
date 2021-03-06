package com.springmvc.dto;

import com.springmvc.pojo.DrawMaterialBillMaterialEntity;

public class DrawMaterialBillMaterial extends DrawMaterialBillMaterialEntity {

    private String materialNo;

    private String materialName;

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}