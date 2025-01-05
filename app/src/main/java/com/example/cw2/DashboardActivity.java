package com.example.cw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnUploadEmployee, btnHolidayRequests, btnIncrementSalaries, btnViewEmployees, btnManageNotifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize buttons
        btnUploadEmployee = findViewById(R.id.btnUploadEmployee);
        btnHolidayRequests = findViewById(R.id.btnHolidayRequests);
        btnIncrementSalaries = findViewById(R.id.btnIncrementSalaries);
        btnViewEmployees = findViewById(R.id.btnViewEmployees);
        btnManageNotifications = findViewById(R.id.btnManageNotifications);

        // Set click listeners to navigate to new activities
        btnUploadEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to upload_employee_activity
                Intent intent = new Intent(DashboardActivity.this, upload_employee_activity.class);
                startActivity(intent);
            }
        });

        btnHolidayRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to holiday_requests_activity
                Intent intent = new Intent(DashboardActivity.this, holiday_requests_activity.class);
                startActivity(intent);
            }
        });

        btnIncrementSalaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to increment_salaries_activity
                Intent intent = new Intent(DashboardActivity.this, increment_salaries_activity.class);
                startActivity(intent);
            }
        });

        btnViewEmployees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to view_employees_activity
                Intent intent = new Intent(DashboardActivity.this, view_employees_activity.class);
                startActivity(intent);
            }
        });

        btnManageNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage_notifications_activity
                Intent intent = new Intent(DashboardActivity.this, manage_notifications_activity.class);
                startActivity(intent);
            }
        });
    }
}
