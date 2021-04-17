/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sandeep Nadendla
 */
public class Loan {
    private long accNo;
    private String acctype;
    private String loanType;
    private double loanamount;

    public Loan(long accNo, String acctype, String loanType, double loanamount) {
        this.accNo = accNo;
        this.acctype = acctype;
        this.loanType = loanType;
        this.loanamount = loanamount;
    }

    public long getAccNo() {
        return accNo;
    }

    public String getAcctype() {
        return acctype;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanamount() {
        return loanamount;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }

    @Override
    public String toString() {
        return "Account Number=" + accNo + " Account Type=" + acctype +
                "\nLoan Type=" + loanType + " Load Amount=" + loanamount;
    }
    
    
}
