package com.vecter.tutorial.springboot.vecter.dataSource.mock

import com.vecter.tutorial.springboot.vecter.dataSource.bankDataSource
import com.vecter.tutorial.springboot.vecter.model.Bank
import org.springframework.stereotype.Repository

@Repository
class mockBankDataSource : bankDataSource {
    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}