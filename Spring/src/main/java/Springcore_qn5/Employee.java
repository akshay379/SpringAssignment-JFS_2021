package Springcore_qn5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
@SuppressWarnings("deprecation")
public class Employee {
 
    private String id;
    private String name;
 
    @Resource(name="mycompany")
    private Company company;
 
    public String getId() {
        return id;
    }
    @Required
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", company=" + company.toString() + "]";
    }
}