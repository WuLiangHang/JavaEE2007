package com.ebank.entity;

public class Phone {
    private Long id;
    private String phoneNum;
    private Double cost;
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }

    public Phone() {
    }

    public Phone(Long id, String phoneNum, Double cost, Byte status) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.cost = cost;
        this.status = status;
    }

    public Phone(String phoneNum, Double cost, Byte status) {
        this.phoneNum = phoneNum;
        this.cost = cost;
        this.status = status;
    }
}
