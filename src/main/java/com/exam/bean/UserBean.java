/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;



/**
 *
 * @author HP
 */
public class UserBean {
    
    private String fname;
     private String lname;
   private String user_id;
    private String password,confirm_pass;
   
    private String address;
    private String gender;
    
     private String Registration_date;
     private int mobnm;
   

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_pass() {
        return confirm_pass;
    }

    public void setConfirm_pass(String confirm_pass) {
        this.confirm_pass = confirm_pass;
    }

    

  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegistration_date() {
        return Registration_date;
    }

    public void setRegistration_date(String Registration_date) {
        this.Registration_date = Registration_date;
    }

   public int getMobnm() {
        return mobnm;
    }

    public void setMobnm(int mobnm) {
        this.mobnm = mobnm;
    }

   
    

   
    
}