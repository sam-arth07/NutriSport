package com.nutrisport.shared.domain

import kotlinx.serialization.Serializable


@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val emailId: String,
    val city: String? = null,
    val postalCode: String? = null,
    val address: String? = null,
    val phoneNumber: PhoneNumber? = null,
    val cart: List<CartItems> = emptyList()
)


@Serializable
data class PhoneNumber(
    val dialCode: Int,
    val number: String
)