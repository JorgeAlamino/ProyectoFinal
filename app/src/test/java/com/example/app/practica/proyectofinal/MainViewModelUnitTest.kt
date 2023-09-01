package com.example.app.practica.proyectofinal

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.app.practica.proyectofinal.View.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }
    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }

    @Test
    fun mainViewModel_TestIgual() = runTest{
        launch {
            viewModel.igual()
        }
        advanceUntilIdle()
        val value = viewModel.result.value?.resultado
        assert(value == "It´s the same text :D")

    }
}