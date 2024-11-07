package com.tp.pci;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class SupervisorActivity extends AppCompatActivity {

    private Spinner spinnerSupervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisor);

        spinnerSupervisor = findViewById(R.id.spinnerSupervisor);
        Button buttonNext = findViewById(R.id.buttonNext);

        // Crear un ArrayAdapter utilizando el arreglo de supervisores
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.supervisor_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSupervisor.setAdapter(adapter);

        buttonNext.setOnClickListener(v -> goToNextPage());
    }

    private void goToNextPage() {
        String selectedSupervisor = spinnerSupervisor.getSelectedItem().toString();
        Intent intent = new Intent(SupervisorActivity.this, SecondActivity.class);
        intent.putExtra("supervisorName", selectedSupervisor); // Pasar el nombre a la siguiente actividad
        startActivity(intent);
    }
}
