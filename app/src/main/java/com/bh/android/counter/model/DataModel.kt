package com.bh.android.counter.model

import android.util.Log

class DataModel {

    private var tag = "BH_" + this.javaClass.simpleName

    var counter = 0

    fun counting(): Int {

        val oldCounter = counter
        counter += 1

        Log.v(tag, ">> +1 from $oldCounter to $counter and return the value to view model")

        return counter
    }
}