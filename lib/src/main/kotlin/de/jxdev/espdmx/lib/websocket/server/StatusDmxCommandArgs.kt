package de.jxdev.espdmx.lib.websocket.server

import com.google.gson.annotations.SerializedName
import de.jxdev.espdmx.lib.websocket.CommandArgs

data class StatusDmxCommandArgs (
    @SerializedName("list")     val list : ArrayList<Int>   = arrayListOf()
) : CommandArgs()