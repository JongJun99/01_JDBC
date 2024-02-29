package com.ohgiraffers.model.dto;

import java.sql.Date;

/*DTO(data Transfer Object)
* 여러 계층간 데이터 전송을 위해서 다양한 타입의 데이터를 하나로 묶어서 전송하는 쓰임의 클래스
* 유사한 말로는 VO, Bean, Entity, (Do, Domain, Row)등이 있음
*
* DTO 클래스의 조건
* 1. 모든 필드는 private
* 2. 기본생성자와 모든 필드를 초기화하는 생성자
* 3. 모든 필드에 대한 setter/getter
* 4. toString Overriding을 이용한 필드값 반환용 메소드
* 5. 직렬화 처리
* */
public class EmployeeDTO implements java.io.Serializable {
    private String emp_id;
    private String emp_name;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private int salary;
    private double bonus;
    private String managerId;
    private java.sql.Date hireDate;
    private java.sql.Date entDate;
    private String entYn;

    public EmployeeDTO() {}

    public EmployeeDTO(String emp_id, String emp_name, String empNo, String email, String phone, String deptCode, String jobCode, String salLevel, int salary, double bonus, String managerId, Date hireDate, Date entDate, String entYn) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Date getEntDate() {
        return entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
