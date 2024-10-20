public class check {
    public boolean isEven(int number){
        if(number % 2== 0) {
            return true;
            else{
                return flase;
            }

        }   
    }

}

public int sumOfDigits(int number){
  int sum = 0;
  while (number > 0) {
    sum += number % 10;
    number /= 10;

  }
  return sum;
}