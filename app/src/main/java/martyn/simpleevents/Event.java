package martyn.simpleevents;



//This class handles the events themselves and what they contain.

public class Event {

    private int eventID = -1;
    private String eventTitle;
    private String eventType;
    private String eventDesc;

    //These variables are more specific and do not have to be assigned to.
    //In an actual implementation a Factory / Abstract Factory Gang of Four method
    //Maybe implemented.
    private String eventLocation = "N/A";
    private String eventTime = "N/A";
    private double eventPrice = 0.00;

    Event(int id, String title, String type, String Desc){
        //When an event is constructed with these Argments set
        //the revelent variables equal to the arguments.

        this.eventID = id;
        this.eventTitle = title;
        this.eventType = type;
        this.eventDesc = Desc;


    }

    Event(int id, String title, String type, String Desc,String location, String time){
        //When an event is constructed with these Argments set
        //the revelent variables equal to the arguments.
        //Handles extend variables for location/time senstive events

        this.eventID = id;
        this.eventTitle = title;
        this.eventType = type;
        this.eventDesc = Desc;
        this.eventLocation = location;
        this.eventTime = time;

    }

    Event(int id, String title, String type, String Desc,String location, String time, double price){
        //When an event is constructed with these Argments set
        //the revelent variables equal to the arguments.
        //Handles extend variables for location/time/cost senstive events.

        this.eventID = id;
        this.eventTitle = title;
        this.eventType = type;
        this.eventDesc = Desc;
        this.eventLocation = location;
        this.eventTime = time;
        this.eventPrice = price;

    }



    public int getEventID(){
        return eventID;
    }

    public void setEventID(int aID){
        //In actual verision would have a automatic ID generation.
        this.eventID = aID;
    }

    public String getEventTitle(){
        return this.eventTitle;
    }

    public String getEventType(){
        return this.eventType;
    }
    public String getEventDesc(){
        return this.eventDesc;
    }

    public void setEventTitle(String aTitle){
        this.eventTitle = aTitle;
    }

    public void setEventType (String aType){
        this.eventType = aType;
    }

    public void setEventDesc(String aDesc){
        this.eventDesc = aDesc;
    }

    public String getEventLocation(){return this.eventLocation;}

    public String getEventTime(){return this.eventTime;}

    public double getEventPrice(){return this.eventPrice;}

    public void setEventLocation( String aLoc){this.eventLocation = aLoc;}


    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }

    public void setEventTime(String aTime){
        this.eventTime = aTime;
    }
}
