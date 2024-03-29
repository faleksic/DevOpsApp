package hr.faleksic.devopsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "hr.faleksic.devopsapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
