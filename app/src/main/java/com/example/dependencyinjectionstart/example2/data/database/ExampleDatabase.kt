package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase: $context - $timeMillis")

    }

    companion object {
        private const val LOG_TAG = "Example_Test"
    }
}