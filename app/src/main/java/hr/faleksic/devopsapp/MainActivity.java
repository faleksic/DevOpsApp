package hr.faleksic.devopsapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "hr.faleksic.devopsapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
    }

    public void showNewScreen(View view) {
        Intent intent = new Intent(this, NewScreenActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = StringManipulator.convertToReverseUpperCase(editText.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
