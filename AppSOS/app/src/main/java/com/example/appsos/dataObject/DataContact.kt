package com.example.appsos.dataObject

data class DataContact(val name : String, val phoneNumber : String)

val listContact = mutableListOf<DataContact>()
val listMessage = mutableListOf<DataContact>()

val listCall = listOf(DataContact("Tư vấn và hỗ trợ trẻ em","111"),
    DataContact("Trợ giúp và tìm kiếm cứu nạn","112"),
    DataContact("Gọi công an","113"),
    DataContact("Gọi cứu hỏa","114"),
    DataContact("Gọi cứu thương","115")
)
var check = false
var address = ""