package com.bh.android.counter.viewmodel

import android.util.Log
import androidx.databinding.ObservableField
import com.bh.android.counter.model.DataModel

class MainViewModel {

    private var tag = "BH_" + this.javaClass.simpleName

    private var dataModel = DataModel()
    var counterTex: ObservableField<String> = ObservableField("0")

    fun doCounting() {
        Log.v(tag, ">> doCounting")
        counterTex.set(dataModel.counting().toString())

    }
}