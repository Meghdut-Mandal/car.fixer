package com.android.devs.car;

public class ModelDetail {
    int image;
    String detail;
    String header;

    public ModelDetail(int image, String header,String detail) {
        this.image = image;
        this.detail = detail;
        this.header = header;
    }

    public int getImage() {
        return image;
    }

    public String getDetail() {
        return detail;
    }
    public String getHeader()
    {
        return header;
    }

}
