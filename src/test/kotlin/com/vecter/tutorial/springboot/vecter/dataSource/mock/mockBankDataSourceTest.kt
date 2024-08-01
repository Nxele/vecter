package com.vecter.tutorial.springboot.vecter.dataSource.mock


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class mockBankDataSourceTest{
    private val mockDataSource = mockBankDataSource()
    @Test
    fun `should provide a collection of banks `(){
        // given
        
        
        // when
        val banks = mockDataSource.retrieveBanks() // get all the mocking data
        
        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3) // this assert check if the bank list has >= 3 records
    }
    @Test
    fun `should provide some mock data`(){
        // given

        
        // when
        val banks = mockDataSource.retrieveBanks() // get all the mocking data
        
        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() } // test if no blanks on the account number
        assertThat(banks).allMatch {it.trust != 0 } // test if all trust doesn't have a zero
        assertThat(banks).allMatch {it.transactionFee != 0} // test if all transactionFee doesn't have records with zero
    }
    
}