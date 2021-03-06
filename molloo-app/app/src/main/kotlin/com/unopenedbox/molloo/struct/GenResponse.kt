package com.unopenedbox.molloo.struct

import kotlinx.serialization.Serializable

@Serializable
data class GenResponse<T>(val status:Int, val message: String, val data:T?, val isError: Boolean)