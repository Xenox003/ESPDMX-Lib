package de.jxdev.espdmx.lib.serialization

import de.jxdev.espdmx.lib.websocket.CommandType

fun getArgClass(baseCommand : String, subCommand : String) : CommandType? {
    return CommandType.values().firstOrNull {
        it.baseCommand == baseCommand && it.subCommand == subCommand
    }
}