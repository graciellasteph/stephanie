package com.example.stephanie.models

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.ui.input.pointer.PointerEventPass

class User {
    var email: String = ""
    var pass: String = ""
    var userid: String=""

    constructor(email: String, pass: String, userid:String){
        this.email= email
        this.pass= pass
        this.userid=userid
    }
    constructor()
}