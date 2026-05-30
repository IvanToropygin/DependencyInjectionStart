package com.example.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService: $context")

    }

    companion object {
        private const val LOG_TAG = "Example_Test"
    }
}