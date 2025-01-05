package com.example.cw2.api;

import com.example.cw2.models.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface ApiService {
    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    @POST("employees/add")
    Call<Void> addEmployee(@Body Employee employee);


}
