package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		Assertions.assertDoesNotThrow(() -> {
			Financing financing = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void constructorShouldThrowsIllegalArgumentExceptionWhenInvalidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 20;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenValidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedAmount = 90000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertDoesNotThrow(()->{
			financing.setTotalAmount(expectedAmount);
		});
		
		Assertions.assertEquals(expectedAmount, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowsIllegalArgumentExceptionWhenInvalidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedAmount = 9000000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			financing.setTotalAmount(expectedAmount);
		});
		
		Assertions.assertEquals(totalAmount, financing.getTotalAmount());
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedIncome = 4000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertDoesNotThrow(()->{
			financing.setIncome(expectedIncome);
		});
		
		Assertions.assertEquals(expectedIncome, financing.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowsIllegalArgumentExceptionWhenInvalidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedIncome = 1000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			financing.setIncome(expectedIncome);
		});
		
		Assertions.assertEquals(income, financing.getIncome());
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenValidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		int expectedMonths = 100;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertDoesNotThrow(()->{
			financing.setMonths(expectedMonths);
		});
		
		Assertions.assertEquals(expectedMonths, financing.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowsIllegalArgumentExceptionWhenInvalidInput() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		int expectedMonths = 10;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			financing.setMonths(expectedMonths);
		});
		
		Assertions.assertEquals(months, financing.getMonths());
	}
	
	@Test
	public void entryShouldReturnEntryValueWhenCalled() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedEntry = 20000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertTrue(financing.entry() == expectedEntry);
	}
	
	@Test
	public void quotaShouldReturnQuotaValueWhenCalled() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedQuota = 1000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertTrue(financing.quota() == expectedQuota);
	}
	
}
