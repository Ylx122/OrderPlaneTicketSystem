package cn.edu.hcnu.bean;

import java.util.Date;

//TODO 乘客类
public class Customer {
    private int id;                //ID
    private String customerType;   //乘客类型：成人、儿童、婴儿
    private String name;           //旅客姓名
    private String phone;          //手机号码
    private String cardId;         //身份ID
    private Date birthDate;        //生日


    //TODO getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
