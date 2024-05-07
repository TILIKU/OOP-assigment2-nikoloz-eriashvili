package assignment2.organizations.hotel;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Organization implements Contactable {
    String email, address, phoneNumber;

    List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        super(); // Call the no-argument constructor of Organization
        this.setName(name); // Set the name using the setter method on the current instance
    }

    public void addRoom(Room room) {
        rooms.add(room); // Add the provided room object to the rooms list
    }

    public boolean removeRoom(Room r) {
        boolean removed = false;
        for (Room room : rooms) {
            if (room.equals(r)) {
                rooms.remove(room);
                removed = true;
                break;
            }
        }
        return removed; // Return true if the room was successfully removed, false otherwise
    }

    public List<Room> getFreeRoom() {
        List<Room> freeRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isOccupied()) { // Check if the current room is free
                freeRooms.add(room); // If it is, add it to the freeRooms list
            }
        }
        return freeRooms;
    }


    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
