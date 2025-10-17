package com.example.capstoneapplication

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

/**
 * This is the class for writing feedback onto tickets
 */
class FeedbackWriter {
    /**
     * This is the function that creates the ticket
     * @param name - name of the ticket
     * @param feedback - feedback for the ticket
     */
    fun writefeedback(name: String?, feedback: String?) {
        try {
            BufferedWriter(FileWriter(name)).use { writer ->
                writer.write(feedback)
            }
        } catch (e: IOException) {
            println(e)
        }
    }
}
