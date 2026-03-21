#Let's Practice

# Ques1. WAP to check if a number entered by the user is odd or even.

# num = int(input("Enter a Number: "))
# if(num%2 == 0):
#     print("Number is Even: ",num )
# else:
#     print("Number is odd:",num)


# #Ques2.WAP to find the greatest of 3 numbers entered by the users.
# a, b, c = map(int, input("Enter a number: ").split(","))

# if(a>b and a>c):
#     print('Greatest a:',a)
# elif(b>c):
#     print('Greatest b:',b)
# else:
#     print('Greatest c:',c)

#Ques4.WAP to find the greatest of "n" numbers entered by the users.
# numbers= list(map(int,input("Enter a numbers:"  ).split(",")))
# print("Maximum number in this list:", max(numbers))

#Ques3. WAP to check if a number is a multiple of 7 or not.
num = int(input( "Enter a number: "))
if(num%7==0):
    print("This number is a 7 multiple:",num)
else:
    print(" This num, Is not a 7 multiple:",num)