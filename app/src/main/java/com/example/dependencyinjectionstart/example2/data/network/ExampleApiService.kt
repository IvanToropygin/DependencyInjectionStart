package com.example.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService: $context - $timeMillis")

    }

    companion object {
        private const val LOG_TAG = "Example_Test"
    }
}