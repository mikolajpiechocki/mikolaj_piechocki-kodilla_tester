public class LeapYear1 {
            int year;

        public static void main(String[] args) {
            LeapYear1 year = new LeapYear1(2000);
            System.out.println(year.isLeap());
        }

        public LeapYear1(int year) {
            this.year = year;
        }

        public Boolean isLeap() {
            if (this.year % 4 == 0) {
                System.out.println("if pierwszy");
                if (this.year % 100 == 0) {
                    System.out.println("if drugi");
                    if (this.year % 400 == 0){
                        System.out.println("if trzeci");
                        return true;
                    } else return false;
                } else return true;
            } else return false;
        }

        // && - and - i
// || - or - albo
// % modulo zwraca reszte z dzielenia
   //   public Boolean isLeap2() {
     //   return ((this.year % 4 == 0) && (this.year % 100 == 0)) || (this.year % 400 == 0);
        }




