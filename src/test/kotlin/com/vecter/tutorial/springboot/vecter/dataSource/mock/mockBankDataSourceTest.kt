package com.vecter.tutorial.springboot.vecter.dataSource.mock


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class mockBankDataSourceTest{
    private val mockDataSource = mockBankDataSource()
    @Test
    fun `should provide a collection of banks `(){
        // given
        
        
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }
    @Test
    fun `should provide some mock data`(){
        // given

        
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).allMatch {it.trust != 0 }
        assertThat(banks).allMatch {it.transactionFee != 0}
    }
    
}