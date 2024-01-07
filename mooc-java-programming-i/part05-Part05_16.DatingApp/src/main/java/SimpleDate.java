
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        
        if(this.day < 30) {
            this.day++;
            return;
        }
        this.day = 1;
        if(this.month < 12) {
            this.month++;
            return;
        }
        this.month = 1;
        this.year++;
        
    }
    public void advance(int days) {
        for(int i = 0; i < days; i++) {
            this.advance();
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate date = new SimpleDate(this.day, this.month, this.year);
        for(int i = 0; i < days; i++) {
            date.advance();
        }
        return date;
    }

}
