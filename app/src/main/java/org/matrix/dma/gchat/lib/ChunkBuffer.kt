package org.matrix.dma.gchat.lib

import java.nio.charset.Charset

class ChunkBuffer {
    var buf = ByteArray(0)

    public fun addData(data: ByteArray) {
        val original = this.buf
        this.buf = ByteArray(this.buf.size + data.size)
        for (i in original.indices) {
            this.buf[i] = original[i]
        }
        for (i in data.indices) {
            this.buf[i + original.size] = data[i]
        }
    }

    public fun readChunk(): String? {
        val as16 = this.buf.toString(Charset.forName("UTF-8"))

        // Format: [length]\n[json]
        // Example: 14\n[[1,["noop"]]]

        var length = -1
        var lengthStr = ""
        var str = "";
        var read = 0
        var done = false
        for (ch in as16) {
            read++
            if (length < 0) {
                if (ch.isDigit()) {
                    lengthStr += ch
                } else if (ch == '\n') {
                    length = lengthStr.toInt()
                }
            } else {
                // start consuming data
                str += ch
                if (str.length == length) {
                    done = true
                    break
                }
            }
        }

        if (done) {
            this.buf = ByteArray(as16.length - read)
            this.addData(as16.substring(read).toByteArray(Charset.forName("UTF-8")))
            return str
        }

        return null
    }
}