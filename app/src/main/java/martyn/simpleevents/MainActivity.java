package martyn.simpleevents;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

        private ArrayList<Event> eventList;
        private ArrayAdapter<String> eventAdaptToDisplay;
        private ListView events;
        private ArrayList<String> eventTitles;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EventController con = new EventController();
            //Creates the event Controller.

           //Locates the list view.
            events = (ListView) findViewById(R.id.ListViewID);

            //Returns a list of events
            eventList = con.getEvents();
            //In reality we would have to check if the event list is empty.
            //But in this case it never will be.

            eventTitles = con.getEventTitles();

            //Starts displaying the event to the screen.
            eventAdaptToDisplay = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, eventTitles);

            events.setAdapter(eventAdaptToDisplay);

            events.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    //int max = eventList.size();

                    Event eventClicked = eventList.get(position);


                    Intent myIntent = new Intent(view.getContext(), EventActivity.class);
                    Bundle eventObj = new Bundle();

                    eventObj.putParcelable("event", (Parcelable) eventClicked);


                    myIntent.putExtras(eventObj);

                    startActivityForResult(myIntent, 0);




                }
            });

    }
}
