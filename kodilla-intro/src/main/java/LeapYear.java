import com.sun.org.apache.xpath.internal.objects.XBoolean;
public class LeapYear {
    int year;

    public static void main(String[] args) {
        String question = "Czy dany rok jest przestępny?";//czemu ta linika nie działa?
        LeapYear year = new LeapYear(2004);
        System.out.println(year.isLeap2());
    }

    public LeapYear(int year) {
        this.year = year;

    }

   /*     public Boolean isLeap() {
            if (this.year % 4 == 0) {
                if (this.year % 100==0) {
                    if (this.year % 400==0) {
                        System.out.println("This Year is Leap.");
                        return true;
                    } else {
                        System.out.println("This Year is not Leap.");
                        return false;
                    }
                }
                else{
                        System.out.println("This Year is Leap.");
                        return true;
                    }
                } else {
                System.out.println("Year is not Leap.");
                return false;
            }
            }
        }  */


    // && - and - i
// || - or - albo
// % modulo zwraca reszte z dzielenia
    public Boolean isLeap2() {
        return ((this.year % 4 == 0) || (this.year % 100 == 0)) || (this.year % 400 == 0);


        }


    }

