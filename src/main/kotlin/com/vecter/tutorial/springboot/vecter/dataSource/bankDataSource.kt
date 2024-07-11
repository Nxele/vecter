package com.vecter.tutorial.springboot.vecter.dataSource

import com.vecter.tutorial.springboot.vecter.model.Bank

interface bankDataSource {
    fun getBanks() : Collection<Bank>
}