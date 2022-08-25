package com.example.hamad14;

import java.io.Serializable;

public class KDD  implements Serializable {
    private String itemName;
    private String itemBrand;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    private  int itemImage;

    public KDD(String itemName, String itemBrand, int itemImage) {
        this.itemName = itemName;
        this.itemBrand = itemBrand;
        this.itemImage = itemImage;
    }
}
