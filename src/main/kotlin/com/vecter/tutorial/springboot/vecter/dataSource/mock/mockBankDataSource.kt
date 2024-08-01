package com.vecter.tutorial.springboot.vecter.dataSource.mock

import com.vecter.tutorial.springboot.vecter.dataSource.bankDataSource
import com.vecter.tutorial.springboot.vecter.model.Bank
import org.springframework.stereotype.Repository

@Repository
class mockBankDataSource : bankDataSource {
    var banks = listOf(
        Bank("12345",2,7),
        Bank("54321",8,9),
        Bank("67890",4,100)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }
}