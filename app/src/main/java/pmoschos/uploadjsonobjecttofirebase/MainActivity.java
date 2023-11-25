package pmoschos.uploadjsonobjecttofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import pmoschos.uploadjsonobjecttofirebase.models.Warehouse;

public class MainActivity extends AppCompatActivity {

    private JSONArray warehousesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load data and upload to Firebase
        try {
            JSONArray warehousesArray = loadWarehousesFromAssets();
            uploadDataToFirebase(warehousesArray);
        } catch (IOException | JSONException e) {
            Log.e("MainActivity", "Error loading or processing JSON data", e);
        }
    }

    /**
     * Loads the warehouse data from the assets folder.
     * @return
     * @throws IOException
     * @throws JSONException
     */
    private JSONArray loadWarehousesFromAssets() throws IOException, JSONException {
        InputStream is = getAssets().open("warehouses.json");
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        is.close();

        String json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject obj = new JSONObject(json);
        return obj.getJSONArray("warehouses");
    }

    /**
     * Uploads the warehouse data to Firebase.
     * @param warehousesArray
     * @throws JSONException
     */
    private void uploadDataToFirebase(JSONArray warehousesArray) throws JSONException {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("warehouses");

        for (int i = 0; i < warehousesArray.length(); i++) {
            JSONObject warehouse = warehousesArray.getJSONObject(i);
            String id = warehouse.getString("id");
            String description = warehouse.getString("description");

            ref.child(id).setValue(new Warehouse(id, description));
        }
    }
}