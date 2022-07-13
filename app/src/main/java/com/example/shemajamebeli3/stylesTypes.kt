package com.example.shemajamebeli3

data class stylesTypes (
        val description:String,
        val icon: Int
        )



val stylesofFields = listOf<stylesTypes>(
        stylesTypes(
                "Edit Profile",
                R.drawable.user
        ),

        stylesTypes(
                "Edit Address",
                R.drawable.location
        ),
        stylesTypes(
                "Notiffications",
                R.drawable.ic_bell_solid
        ),
        stylesTypes(
                "Payment",
                R.drawable.ic_credit_card_solid
        ),
        stylesTypes(
                "Security",
                R.drawable.ic_lock_solid
        ),
        stylesTypes(
                "Language",
                R.drawable.ic_earth_europe_solid
        ),

        stylesTypes(
                "Dark Mode",
                R.drawable.ic_eye_solid
        ),

        stylesTypes(
                "Edit Privacy Police",
                R.drawable.ic_lock_solid
        ),

        stylesTypes(
                "Help Center",
                R.drawable.ic_circle_info_solid
        ),

        stylesTypes(
                "Invite Friends",
                R.drawable.ic_shield_solid
        ),






        )