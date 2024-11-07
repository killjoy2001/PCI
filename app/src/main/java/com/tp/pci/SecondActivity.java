package com.tp.pci;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private CheckBox checkBoxYes, checkBoxNo;
    private EditText editTextComments2, editTextComments3, editTextComments4; // Asegúrate de que estos IDs estén correctos
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); // Asegúrate de que el layout sea correcto

        // Inicializar los componentes
        checkBoxYes = findViewById(R.id.checkBoxYes);
        checkBoxNo = findViewById(R.id.checkBoxNo);
        editTextComments2 = findViewById(R.id.editTextComments2);
        editTextComments3 = findViewById(R.id.editTextComments3);
        editTextComments4 = findViewById(R.id.editTextComments4);
        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(v -> goToNextPart());
    }

    private void goToNextPart() {
        // Obtener respuestas
        boolean isYesChecked = checkBoxYes.isChecked();
        boolean isNoChecked = checkBoxNo.isChecked();
        String comments2 = editTextComments2.getText().toString();
        String comments3 = editTextComments3.getText().toString();
        String comments4 = editTextComments4.getText().toString();

        // Aquí puedes manejar los datos, crear un ID único y preparar para almacenarlo en Excel
    }
}

