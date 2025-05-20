package com.news.gymnast.requests;

import com.news.gymnast.models.Classes;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class MembershipClassesResponse {
    private int id;
    private String name;
    private String code;
    private Date startDate;
    private Date expireDate;
    private BigDecimal value;
    private String image;
    private boolean renew;
    private boolean active;

    private Set<Classes> classes = new HashSet<>();

    public void addClass(Classes classes1) {
        if (classes != null) {
            this.classes.add(classes1);
        }
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

    public String getCode() {
        return code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isRenew() {
        return renew;
    }

    public void setRenew(boolean renew) {
        this.renew = renew;
    }


    public Date getStartDate() {
        return startDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
