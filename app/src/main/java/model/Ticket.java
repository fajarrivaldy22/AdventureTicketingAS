package model;

public class Ticket {
    private String idTicket;
    private String eventName;
    private Long price;
    private String[] imageEvent;
    private String dateHeld;
    private int duration;
    private String contactPerson;
    private String location;
    private String description;
    private String community;


    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String[] getImageEvent() {
        return imageEvent;
    }

    public void setImageEvent(String[] imageEvent) {
        this.imageEvent = imageEvent;
    }

    public String getDateHeld() {
        return dateHeld;
    }

    public void setDateHeld(String dateHeld) {
        this.dateHeld = dateHeld;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
}
