package com.hala.designpatternsinkotlin.Behavioral.Iterator.RepositoryExample

interface Iterator {
    operator fun hasNext(): Boolean
    operator fun next(): Any
}