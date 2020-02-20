package com.cg.pecunia.dao;

import java.util.ArrayList;

import com.cg.pecunia.model.Loan;
import com.cg.pecunia.exception.AccountExcepetion;

public interface AccountLoanDao {
	
	//public int addAccount(Account account) throws AccountExcepetion;
	public Loan loanRequest(int accountNumber ,String amount1, int tenure,int creditScore) throws AccountExcepetion;
	public boolean loanApprovalStatus(Loan loan) throws AccountExcepetion;
	public double updateBalance(Loan loan) throws AccountExcepetion;
	public double calculateEmi(Loan loan) throws AccountExcepetion;
	public ArrayList<Loan> loanApprovalList(Loan loan) throws AccountExcepetion;
	public ArrayList<Loan> loanRejectList(Loan loan) throws AccountExcepetion;
	

}
