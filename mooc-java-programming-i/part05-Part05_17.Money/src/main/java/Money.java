
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money add) {
        int totalCents = this.cents + add.cents;
        int addEuro = totalCents / 100;
        if(addEuro == 1) {
            totalCents = totalCents - 100;
        }
        
        Money newMoney = new Money(this.euros + add.euros + addEuro, totalCents); 


        return newMoney;
    }
    public boolean lessThan(Money other) {
        if(this.euros < other.euros) {
            return true;
        }
        
            
        return this.cents < other.cents && this.euros == other.euros;
    }
    public Money minus(Money dec) {
        int totalCents = this.cents - dec.cents;
        int decEuro = 0;
        if (totalCents < 0) {
            decEuro++;
            totalCents = 100 + totalCents;
        }
        
        int totalEuros = this.euros - dec.euros - decEuro;
        if(totalEuros < 0) {
            totalEuros = 0;
            totalCents = 0;
        }
        Money newMoney = new Money(totalEuros, totalCents);
        
        
        
        return newMoney;
    }

}
