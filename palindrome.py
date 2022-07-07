number = int(input("Enter a value:"))  
temp = number  
rev = 0  
while(number > 0):   


 modulo = number % 10  
 rev = rev * 10 + modulo 
 number = number // 10  
if(temp == rev):  
    print("This value is a palindrome number")  
else:  
    print("This value is not a palindrome number")  