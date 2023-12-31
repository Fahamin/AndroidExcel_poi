package com.movie.newrelease.androidexcel_poi

import android.app.Application
import org.apache.poi.xssf.usermodel.XSSFBuiltinTableStyle.init

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        System.setProperty(
            "org.apache.poi.javax.xml.stream.XMLInputFactory",
            "com.fasterxml.aalto.stax.InputFactoryImpl"
        )
        System.setProperty(
            "org.apache.poi.javax.xml.stream.XMLOutputFactory",
            "com.fasterxml.aalto.stax.OutputFactoryImpl"
        )
        System.setProperty(
            "org.apache.poi.javax.xml.stream.XMLEventFactory",
            "com.fasterxml.aalto.stax.EventFactoryImpl"
        )

    }
}