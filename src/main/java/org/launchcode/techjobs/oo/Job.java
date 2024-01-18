package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO (DONE): Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO (DONE): Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        //String nameOutput = "Name: " + name + System.lineSeparator();
//        if(getName().isBlank()) {
//            setName("Data not available");
//        }


//        if(employer.getValue().isBlank()) {
//            setEmployer("Data not available");
//        }


        return "\n" +
                "ID: " + getId() + "\n" +
                "Name: " + (getName() == null || getName().isEmpty() ? "Data not available" : getName()) + "\n" +
                "Employer: " + (employer.getValue() == null || employer.getValue().isEmpty() ? "Data not available" : getEmployer()) + "\n" +
                "Location: " + (location.getValue() == null || location.getValue().isEmpty() ? "Data not available" : getLocation()) + "\n" +
                "Position Type: " + (positionType.getValue() == null || positionType.getValue().isEmpty() ? "Data not available" : getPositionType()) + "\n" +
                "Core Competency: " + (coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty() ? "Data not available" : getCoreCompetency()) + "\n";
    }
    //QUESTION: why can't i do getEmployer.isBlank()? but works fine if returning getEmployer? or can do employer.getValue.isBlank()?
    //getPositionType().toString().isBlank() vs.
    //positionType.getValue().isBlank()?
    //okay wtf is the point of .isBlank() if it results in a NullPointerException if its passed a null value?? isnt it supposed to check for that?!?!

    // TODO (DONE): Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    //also per textbook, also generate getter for the id field


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
