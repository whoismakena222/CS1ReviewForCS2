public class ScannersAndSuch {
    public class SumOfMultiplesOf5 {
        public static void main(String[] args) {
            int sum = 0;  //WHAT IS THIS DOING AND WHY(1)
            int i = 1;    //WHAT IS THIS DOING AND WHY(2)

            while (i <= 30) {       //WHAT IS THIS DOING AND WHY(3)
                if (i % 5 == 0) {   //WHAT IS THIS DOING AND WHY(4)
                    sum += i;       //WHAT IS THIS DOING AND WHY(5)
                }
                i++;   //WHAT IS THIS DOING AND WHY(6)
            }
            //WHAT IS THIS DOING AND WHY(7)
            System.out.println("The sum of all multiples of 5 between 1 and 30 is: " + sum);
        }
    }
}
