
package business;

import java.util.ArrayList;

/**
 *
 * @author Bogartt
 */
public class AnnuityMonth {
    private int month;
    private double bbal,deposit1,deposit2,intearn,ebal;
    private String msg;
    
    public AnnuityMonth(){
        this.month =0;
        this.bbal=0;
        this.deposit1=0;
        this.ebal=0;
        this.msg ="";
        this.deposit2=0;
    }
    public AnnuityMonth(int m, double bb, double dep,double dep2, double ie, double eb){
        this.month = m;
        this.bbal = bb;
        this.deposit1 =dep;
        this.intearn = ie;
        this.ebal =eb;
        this.deposit2=dep2;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getBbal() {
        return bbal;
    }

    public void setBbal(double bbal) {
        this.bbal = bbal;
    }

    public double getDeposit1() {
        return deposit1;
    }
  public double getDeposit2() {
        return deposit2;
    }
    public void setDeposit1(double deposit1) {
        this.deposit1 = deposit1;
    }
    public void setDeposit2(double deposit2) {
        this.deposit2 = deposit2;
    }

    public double getIntearn() {
        return intearn;
    }

    public void setIntearn(double intearn) {
        this.intearn = intearn;
    }

    public double getEbal() {
        return ebal;
    }

    public void setEbal(double ebal) {
        this.ebal = ebal;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
