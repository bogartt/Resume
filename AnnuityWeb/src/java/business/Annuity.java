package business;

import java.util.ArrayList;

public class Annuity {
   private double deposit1,deposit2, rate;
   private int term;
   private double[] bbal, iearn, ebal;
   private boolean built;

    public Annuity(double deposit,double deposit2, double rate, int term) {
       this.deposit1 = deposit;
       this.deposit2 =deposit2;
       this.rate = rate;
       this.term = term;
       buildAnnuity();
   }
   public Annuity(){
       this.deposit1= 0;
       this.deposit2=0;
       this.rate= 0;
       this.term= 0;
       this.built= false;

   }

  public void setDeposit1(double deposit1) {
        this.deposit1 = deposit1;
    }
    public void setDeposit2(double deposit2) {
        this.deposit2 = deposit2;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTerm(int term) {
        this.term = term;
    }
   public double getDeposit() {
       return this.deposit1;
   }
 public double getDeposit2() {
       return this.deposit2;
 }
   
   public double getRate() {
       return this.rate;
   }

   public int getTerm() {
       return this.term;
   }
   public double getFinalValue() {
       if (!built) {
           buildAnnuity();
       }
       return ebal[term-1];
   }
   public double BegBal(int m) {
       if (!built) {
           buildAnnuity();
       }
       return this.bbal[m-1];
   }
   public double IntEarn(int m) {
       if (!built) {
           buildAnnuity();
       }
       return this.iearn[m-1];
   }
   public double EndBal(int m) {
       if (!built) {
           buildAnnuity();
       }
       return this.ebal[m-1];
   }
   private void buildAnnuity() {
       bbal = new double[term];
       iearn = new double[term];
       ebal = new double[term];

       bbal[0] = 0;
       for (int i=0; i < this.term; i++) {
           if (i > 0) {
               bbal[i] = ebal[i-1];
           }
           iearn[i] = (bbal[i] + this.deposit1 ) * (this.rate / 12.0);
           ebal[i] = (bbal[i] + this.deposit1 + this.deposit2 + iearn[i]);
       }
       built = true;
       return ;
   }
   public ArrayList<AnnuityMonth> getMonths(){
        ArrayList<AnnuityMonth> months = new ArrayList<>();
        for (int i=1; i<= this.term; i++){
          AnnuityMonth m = new AnnuityMonth(
                  i,
                  this.bbal[i-1],
                  this.deposit1,
                  this.deposit2,
                  this.iearn[i-1],
                  this.ebal[i-1] );
            months.add(m);
        
        }
         return months;
    }


}
