def sum_of_digits(number):
    sum = 0
    while number > 0:
       digit = number % 10 
       sum  += digit
       number = number // 10
       return sum 
    
    print(sum_of_digits(19835))