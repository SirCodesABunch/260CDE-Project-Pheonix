package martyn.simpleevents;


import java.util.ArrayList;

/**
 * This class would connect to a server / Database and retrieve all the events.
 * Then pass it to the function that called it for the events to likely be displayed on screen.
 *
 * Seeing as I don't have a server/database I will just make it return event objs.
 */

public class EventController {

    ArrayList<Event> events = new ArrayList<Event>();

    EventController(){
        //When the event controller is created it would connect to the database and update
        //The Events array list with the objs it created from reading from the database.
        //For now this will just create 3 events and add them to the events controller.

        Event event1 = new Event(1,"ECC Futures: Careers Fair!","Careers/Free",
                "This event is open to EEC students across all courses & years. Over 50 exhibitors on campus!","The Hub","Wednesday 1st March 2017: 12pm – 3pm");

        Event event2 = new Event(2,"Domionos: Freshers Week 50% Off!","Promotion/Money Off","Come celeberate freshers week with 50% our delicous pizza!");

        Event event3 = new Event (3,"Student Events: Pot Noodle Eating Competition!!","Competition/Paid",
                "Prove you're a student by winning the annual student pot noodle eating competition! 1st Prize is a years supply of pot noodle!",
                "The Hub","Wednesday 1st March 2017: 12pm – 6pm",15.00);

        events.add(event1);
        events.add(event2);
        events.add(event3);

    }
    public ArrayList<String> getEventTitles() {
        //Goes through the event list and get the titles.
        ArrayList<String> eventTitles = new ArrayList<String>();

        //Would have to take mesaures against events being empty!
        //But in this case it never will!
        for (int i = 0; events.size() > i; i++) {
            eventTitles.add(events.get(i).getEventTitle());

        }
        return eventTitles;
    }


    public ArrayList<Event> getEvents(){
        return events;
    }

}
