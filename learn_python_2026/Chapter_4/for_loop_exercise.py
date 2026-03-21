#Let's Practice
    # uSING FOR
'''
Docstring for Chapter_4.for_loop_exercise

            Print the element of the following list using a loop
            [1, 4, 9, 25, 36, 49, 64, 81, 100]
'''
num =   [1, 4, 9, 25, 36, 49, 64, 81, 100]
for el in num:
    print(el)


'''
        Ques2: Search for a number x in this tuple using loop
        (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
'''
tup = (1, 4, 9, 16, 49, 25, 36, 49, 64, 81, 100)
x = 49

index = 0
for i in tup:
    if( i == x):
        print("number found at index", index)
        break
    index += 1


index = 0
for i in tup:
    if( i == x):
        print("number found at index", index)
        continue
    index += 1

# next lecture practice question
#       using for & range( )

'''
    Print numbers from 1 to 100.
'''
for i in range(100):
    print(i)
'''
Print numbers from 100 to 1
'''
for i in range(100, 0, -1):
    print(i)

'''
    any number type the table
'''
n = int(input("Enter number: "))

for i in range(1, 11):
    print(n*i)


#  then Practice question

'''
    Ques1: WAP to find the sum of first n number.(using while)
'''
n = int(input("Enter a number: "))
sum = 0 
idx = 0
while(idx <= n):
    sum += idx
    print("Sum of total number:", sum)
    idx +=1

n = int(input("Enter a number: "))

sum = 0
for i in range(1, n+1):
    sum += i
    print(sum)


print("total number sum :  ",sum)

'''
    Ques2: WAP to find the factorial of first n numbers.(using for)
'''
#using  for Loop
n = 5
fact = 1
for i in range(1,  n+1):
    fact *= i
print("factorial", fact)

# Using while loop
n = 6
fact = 1
i = 1
while i <=n:
    fact *=i
    i += 1
print("factorial", fact)

