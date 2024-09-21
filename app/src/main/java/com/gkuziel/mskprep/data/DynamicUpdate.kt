package com.gkuziel.mskprep.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DynamicUpdate @Inject constructor(
    private val timer: Timer
) {
    fun get(
        timerCutOff: () -> Int
    ): Flow<Int> {
        return timer.get {
            timerCutOff()
        }
    }
}