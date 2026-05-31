package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.data.ExampleRepositoryImpl
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepositoryImpl,
    private val id: String
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this - $id")
    }
}
