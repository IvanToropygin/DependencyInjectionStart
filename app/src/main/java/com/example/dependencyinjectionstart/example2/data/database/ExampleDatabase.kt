package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor(private val context: Context) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase: $context")

    }

    companion object {
        private const val LOG_TAG = "Example_Test"
    }
}