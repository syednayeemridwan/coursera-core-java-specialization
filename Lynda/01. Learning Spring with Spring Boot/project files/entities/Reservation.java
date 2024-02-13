package com.frankmoley.lil.landonhotel.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import java.sql.Date;

@Entity
@Table(name="reservations")
@Data
@ToString
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="reservation_id")
  private long id;
  @Column(name="room_id")
  private long roomId;
  public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getRoomId() {
	return roomId;
}
public void setRoomId(long roomId) {
	this.roomId = roomId;
}
public long getGuestId() {
	return guestId;
}
public void setGuestId(long guestId) {
	this.guestId = guestId;
}
public Date getReservationDate() {
	return reservationDate;
}
public void setReservationDate(Date reservationDate) {
	this.reservationDate = reservationDate;
}
@Column(name="guest_id")
  private long guestId;
  @Column(name="res_date")
  private Date reservationDate;
}
