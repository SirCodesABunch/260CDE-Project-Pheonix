package cucompanionteam.cucompanion;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lorenzo-MSI on 19/03/2017.
 */

public class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "sql8.freesqldatabase.com/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest(String name, String lastname, String username, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("name", name);
        parameters.put("lastname", lastname);
        parameters.put("username", username);
        parameters.put("password", password);
    }

    public Map<String, String> parameters() {
        return parameters;
    }
}
