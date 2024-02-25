package com.frankmoley.lil.landonhotel.service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoomReservation {
  private long roomId;
  public long getRoomId() {
	return roomId;
}
public void setRoomId(long roomId) {
	this.roomId = roomId;
}
public String getRoomName() {
	return roomName;
}
public void setRoomName(String roomName) {
	this.roomName = roomName;
}
public String getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
}
public long getGuestId() {
	return guestId;
}
public void setGuestId(long guestId) {
	this.guestId = guestId;
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
public long getReservationId() {
	return reservationId;
}
public void setReservationId(long reservationId) {
	this.reservationId = reservationId;
}
public String getReservationDate() {
	return reservationDate;
}
public void setReservationDate(String reservationDate) {
	this.reservationDate = reservationDate;
}
private String roomName;
  private String roomNumber;
  private long guestId;
  private String firstName;
  private String lastName;
  private long reservationId;
  private String reservationDate;
}
