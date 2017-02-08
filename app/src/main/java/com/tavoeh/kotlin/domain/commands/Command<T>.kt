package com.tavoeh.kotlin.domain.commands

/**
 * Created by tavoeh on 8/02/2017.
 */
interface Command<T> {

    fun execute(): T

}