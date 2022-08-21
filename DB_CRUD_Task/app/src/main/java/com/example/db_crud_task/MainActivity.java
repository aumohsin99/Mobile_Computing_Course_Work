package com.example.db_crud_task;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonViewAll;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.add);
        buttonViewAll = findViewById(R.id.ViewAll);
        editName = findViewById(R.id.name);
        editRollNumber = findViewById(R.id.rollno);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                List<StudentModel> list = dbHelper.getAllStudents();
                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
                listViewStudent.setAdapter(arrayAdapter);

            }
        });
        listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String[] replace = ((TextView) view).getText().toString().split(",");
                onBackPressed(replace[0].substring(19),replace[1].substring(11)
                        ,replace[2].substring(10));
            }});

    }
    public void onBackPressed(String Name,String rNo, String status) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        DBHelper dbHelper = new DBHelper(MainActivity.this);
        alert.setTitle("Do you want to update or delete record?");
        //Your action here
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter Information to update :");
        LinearLayout linearlayoutfirst= new LinearLayout(this);
        linearlayoutfirst.setOrientation(LinearLayout.VERTICAL);
        // Set up the input
        final EditText inputName = new EditText(this);
        final EditText inputRollNo = new EditText(this);
        final Switch isEnroll=new Switch(this);
        alert.setPositiveButton("Update", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                inputName.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_TEXT);
                inputName.setHint("Enter Name to be Updated:");
                inputName.setText(Name.substring(0,Name.length()-1));
                inputRollNo.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_NUMBER);
                inputRollNo.setHint("Enter Roll Number to be Updated:");
                inputRollNo.setText(rNo);
                isEnroll.setText("Active Student Status");
                boolean result=(status.substring(0,status.length()-1))=="false"? false:true;
                isEnroll.setChecked(result);
                linearlayoutfirst.addView(inputName);
                linearlayoutfirst.addView(inputRollNo);
                linearlayoutfirst.addView(isEnroll);
                builder.setView(linearlayoutfirst);
// Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(dbHelper.updateCourse(inputName.getText().toString(),
                                inputRollNo.getText().toString(),isEnroll.isChecked(),rNo)){
                            Toast.makeText(getBaseContext(), "Updated Successfully!!!", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(getBaseContext(), "Some Problem Occured!", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();

            }
        });
        alert.setNegativeButton("Delete",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (dbHelper.deleteStudent(rNo)) {
                            Toast.makeText(getBaseContext(), "Deleted Successfully!!!", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getBaseContext(), "Some Problem Occured!", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        alert.show();
    }
}