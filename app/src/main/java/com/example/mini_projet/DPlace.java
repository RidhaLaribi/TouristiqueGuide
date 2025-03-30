package com.example.mini_projet;

public class DPlace {
    private String cat,loc;
    private String name;

    private int pic1, pic2,pic3;
    private String desc;
    private String phone="";


    public DPlace(String cat,String name ,String desc, String loc , String phone , int pic1, int pic2, int pic3) {
        this.cat = cat;
        this.name = name;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.desc = desc;
        this.phone = phone;
        this.loc=loc;
    }
    public DPlace(String cat,String name ,String desc ,String loc , int pic1, int pic2, int pic3) {
        this.cat = cat;
        this.name = name;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.desc = desc;
        this.loc=loc;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getLoc() {
        return loc;
    }

    public int getPic1() {
        return pic1;
    }

    public int getPic2() {
        return pic2;
    }

    public int getPic3() {
        return pic3;
    }

    public String getCat() {
        return cat;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
