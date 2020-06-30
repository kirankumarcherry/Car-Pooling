package com.virtusa.carpooling.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="carrider")
public class Rider 
{
private long id;
private String ridername;
private String email;
private String startaddress;
private String endaddress;

public Rider() {}
public Rider(String ridername,String email,String startaddress,String endaddress)
{
	this.ridername=ridername;
	this.email=email;
	this.startaddress=startaddress;
	this.endaddress=endaddress;
	
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Column(name = "ridername", nullable = false)
public String getRidername() {
	return ridername;
}
public void setRidername(String ridername) {
	this.ridername = ridername;
}

@Column(name = "email", nullable = false)
public String getEmail() {
	return email;
}
public void setEmail(String emailID) {
	this.email = emailID;
}
@Column(name = "startaddress", nullable = false)
public String getStartaddress() {
	return startaddress;
}
public void setStartaddress(String startaddress) {
	this.startaddress = startaddress;
}
@Column(name = "endaddress", nullable = false)
public String getEndaddress() {
	return endaddress;

}
public void setEndaddress(String endaddress) {
	this.endaddress = endaddress;
}


@Override
public String toString() {
	return "Rider [id=" + id + ", ridername=" + ridername + ",+  email=" + email
			+ " ,startaddress="+ startaddress + ",  endaddress=" + endaddress +"]";
} 
}
