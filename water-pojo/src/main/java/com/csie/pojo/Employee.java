package com.csie.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.*;

@ApiModel(value = "员工对象",description = "员工信息")
public class Employee {

    @ApiModelProperty(value="员工id", name="id", example="json", required = false)
    @Id
    private Integer id;
    @ApiModelProperty(value="员工name", name="name", example="json", required = false)
    private String name;

    private String code;

    private String sex;

    private Integer age;

    private Date birthday;

    private String nationality;

    private String interest;

    @Column(name = "my_name")
    private String myName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return interest
     */
    public String getInterest() {
        return interest;
    }

    /**
     * @param interest
     */
    public void setInterest(String interest) {
        this.interest = interest;
    }

    /**
     * @return my_name
     */
    public String getMyName() {
        return myName;
    }

    /**
     * @param myName
     */
    public void setMyName(String myName) {
        this.myName = myName;
    }
}
