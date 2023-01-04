package com.example.expend10.models

object MyDataBase {
    val map = HashMap<String, ArrayList<String>>()
    val titleList = ArrayList<String>()

    fun addMap(){
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("Computer Accessories")
        titleList.add("Home Entertainment")
        titleList.add("TVs by brand")
        titleList.add("Kitchen Appliances")

        val listMobiles = arrayListOf<String>("MI", "RealMe", "Samsung", "Infinix", "Oppo", "apple", "Honor")
        val listLaptops = arrayListOf<String>( "Dell","MAC","HP", "ASUS" )
        val listCa = arrayListOf<String>("Pendrive","Bag","Mouse", "Keyboard")
            val listHe= arrayListOf<String>("chase","reading","speaking", "Writing")
            val listTv= arrayListOf<String>("LG","Artel","Samsung", "Smart")
            val listKa= arrayListOf<String>("kettle","pot","dishes", "Shelf")

        map[titleList[0]] = listMobiles
        map[titleList[1]] = listLaptops
        map[titleList[2]] = listCa
        map[titleList[3]] = listHe
        map[titleList[4]] = listTv
        map[titleList[5]] = listKa
    }
}