package com.example.sampleapp.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // editXにデータが入ったらtextXに反映するように使う
    var edit1 = MutableLiveData<String>()
    val text1 = Transformations.map(edit1) {edit1}

    var edit2 = MutableLiveData<String>()
    var text2 = MutableLiveData<String>()

    var edit3 = MutableLiveData<String>()
    var text3List = mutableListOf<String>()

    var text4 = MutableLiveData<String>()


    // EditText2をTextView2に反映
    fun changeEdit2(){
        text2.value = edit2.value
    }

    // EditText2をTextView2に反映
    fun clickHozon(){
        text3List.add(edit3.value.toString())
        edit3.value = ""

    }

    // EditText2をTextView2に反映
    fun clickHanei(){
        var tmp: String =""
        var tmpList = text3List.filterNotNull()
        tmpList.forEach { tmp = tmp + it +" " }
        text4.value = tmp
    }
}
