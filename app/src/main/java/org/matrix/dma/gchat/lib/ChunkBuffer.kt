package org.matrix.dma.gchat.lib

import android.util.Log
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

    public fun removeChunks() {
        val as16 = this.buf.toString(Charset.forName("UTF-8"))
    }
}