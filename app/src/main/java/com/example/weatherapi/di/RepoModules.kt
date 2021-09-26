package com.example.weatherapi.di

import com.example.weatherapi.ui.repository.Repository
import org.koin.core.module.Module
import org.koin.dsl.module

val repoModules: Module = module {
    single { Repository() }
}