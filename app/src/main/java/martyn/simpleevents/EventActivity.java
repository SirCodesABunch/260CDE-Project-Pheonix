package martyn.simpleevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Event event = getIntent().getParcelableExtra("event");

        TextView title = (TextView) findViewById(R.id.Event_Title);
        title.setText(event.getEventTitle());

        TextView desc = (TextView) findViewById(R.id.Event_Desc);
        desc.setText(event.getEventDesc());

        TextView type = (TextView) findViewById(R.id.Event_Type);
        type.setText(event.getEventType());

        TextView loc = (TextView) findViewById(R.id.Event_Location);
        loc.setText(event.getEventLocation());

        TextView time = (TextView) findViewById(R.id.Event_Time);
        time.setText(event.getEventTime());

        //TextView price = (TextView) findViewById(R.id.Event_Price);
        //price.setText("£" +  String.valueOf(event.getEventPrice()));


    }

}


