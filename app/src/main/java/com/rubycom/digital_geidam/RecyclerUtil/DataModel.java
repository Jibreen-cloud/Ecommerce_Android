package com.rubycom.digital_geidam.RecyclerUtil;

public class DataModel {
    private int [] Images;
    private Double Amount;
    private String ShortDesc;
    private String title;

    public DataModel(int [] images, Double amount, String shortDesc, String title) {
        Images = images;
        Amount = amount;
        ShortDesc = shortDesc;
        this.title = title;
    }

    public int [] getImages() {
        return Images;
    }

    public void setImages(int [] images) {
        Images = images;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getShortDesc() {
        return ShortDesc;
    }

    public void setShortDesc(String shortDesc) {
        ShortDesc = shortDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
