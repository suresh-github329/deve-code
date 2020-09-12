package com.lara.sanitizer.customer.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email", "mobileNo"})})

public class Customer {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	@Column(length = 10)
	private String mobileNo;
	@Column(length = 50)
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL )
	private List<CustomerOrder> customerOrder=new ArrayList<CustomerOrder>();
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<CustomerOrder> getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(List<CustomerOrder> customerOrder) {
		this.customerOrder = customerOrder;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", password=" + password + "]";
	}

	
	
	
}
