package assignment2.organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
    String mission;

    String email, address, phoneNumber;

    List<Election> elections = new ArrayList<>();

    public Party(String name, String mission) {
        // TODO finish this method (0.25 points)
        super(); // Call the no-argument constructor of Organization
        this.setName(name); // Set the name using the setter method on the current instance
        this.mission = mission; // Initialize the mission field with the provided value
    }

    public void addElection(Election e) {
        // TODO finish this method (0.25 points)
        elections.add(e); // Add the provided Election object to the elections list
    }

    public boolean removeElection(Election e) {
        boolean removed = false;
        // TODO finish this method (0.25 points)
        for (Election election : elections) {
            if (election.equals(e)) {
                elections.remove(election);
                removed = true;
                break;
            }
        }
        return removed; // Return true if the Election was successfully removed, false otherwise
    }

    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        // TODO finish this method (0.25 points)
        for (Election election : elections) {
            if (election.isFair()) { // Check if the current Election is fair
                fairElections.add(election); // If it is, add it to the fairElections list
            }
        }
        return fairElections;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
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
