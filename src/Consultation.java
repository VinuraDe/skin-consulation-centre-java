import java.util.Date;

public class Consultation {
    //represent the booked consultation with a specific doctor from a patient.
    //hold information about: date/time slot,the cost and the notes for the consultation
    private Date dateTime;
    private double cost;
    private String notes;
    private Doctor doctor;
    private Patient patient;

    public Date getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
