package com.frankmoley.lil.landonhotel.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="rooms")
@Data
@ToString
public class Room {

  @Id
  @Column(name="room_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name="name")
  private String name;
  public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
}
public String getBedInfo() {
	return bedInfo;
}
public void setBedInfo(String bedInfo) {
	this.bedInfo = bedInfo;
}
@Column(name="room_number")
  private String roomNumber;
  @Column(name="bed_info")
  private String bedInfo;
}
