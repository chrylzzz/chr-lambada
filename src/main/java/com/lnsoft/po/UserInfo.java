package com.lnsoft.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created By Chr on 2019/1/14/0014.
 */
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {

    /**
     * 注意：如果db中的字段为 userName 那么@Column(name = "userName")解析的时候会加上变为user_Name,会自动加上_横杠
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//IDENTITY:主键类型，必须是int，long，short其中之一
    private Integer id;

    @Column(name = "name")//windows不区分大小写，linux区分大小写
    private String name;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "telphone")
    private String telphone;

    @Column(name = "registere_mode")
    private String registereMode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegistereMode() {
        return registereMode;
    }

    public void setRegistereMode(String registereMode) {
        this.registereMode = registereMode;
    }
}
