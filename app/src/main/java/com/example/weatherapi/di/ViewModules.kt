package com.example.weatherapi.di

import com.example.weatherapi.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules:Module = module {
    viewModel { MainViewModel(get()) }
}