package com.example.math_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Add() {
            @Override
            public void add(int a, int b) {

            }
        };

        new Subtract() {
            @Override
            public void sub(int a, int b) {

            }
        };
        new Division() {
            @Override
            public void divide(int a, int b) {

            }
        };
        new Multiplication() {
            @Override
            public void multi(int a, int b) {

            }
        };

    }
}