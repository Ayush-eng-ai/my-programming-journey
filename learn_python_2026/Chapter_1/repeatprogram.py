print("Ayush is my Name.", "My age is 17 Years")
name = "Ayush " #string
age = 17        #integer
price = 7000000.50     #float

age2 = age
print("Age2: ", age2)

print("Name: ", name, " Age: ", age, " Price: ", price)

print(type(name))
print(type(age))
print(type(price))
print(type(age2))

"""Integer, Float, String, Boolean, None"""


Name1 = 'Ayush'
Name2 = "Ayush"
Name3 = '''Ayush'''
Name4 = """Ayush"""

print(Name1, Name2, Name3, Name4)
print(type(Name1), type(Name2), type(Name3), type(Name4))
print(Name1 == Name2 == Name3 == Name4)
print(Name1 is Name2 is Name3 is Name4)
print(id(Name1), id(Name2), id(Name3), id(Name4))

"""Some Keywords in python 
and, as, assert, break, class, continue, def, del, elif, else, except, finally, False, for, from, global, if, import, in, is , lambda, None, not, or, pass, raise, return True, try, while, with, yield"""


                # Python is Case Sensitive Language
#Sum of Two Numbers

a= 10 
b = 29
sum = a + b
print ("Sum is: ", sum)

#Difference of Two Numbers
diff = b - a
print("Difference is: ", diff)


                        # types of Tokens
#punctuators
# Punctuators are symbols to organize sentence structure in programming.
#(), {}, [], ., ,, :, ;, @, =, ->, +=, -=, *=, /=, //=, %=, &=, |=, ^=, >>=, <<=, #

# type of Language 1. emplicitly typed language 2. explicitly typed language
# Python is an implicitly typed language  




                    # Expression Execution
# String & Numeric values can operate together with*
A,B = 2,3 
Text = "@"
print(2*Text*3)

# Output: @@@@@@

# String Concatenation
#String & String can operate with +
A,B  = "2", 3
Text = "Ayush"
print((A+ Text)*B)

# Output: 2Ayush2Ayush2Ayush


#Numeric Value can oprate with all arithmetic operators
A,B = 2,3
C = 4
print(A+B*C)
# Output: 14

#Arithmetic expression with Integer and float will result in float

A,B = 2,3.5
C = A*B
print(C)
# Output: 7.0



#Result of division operator with  two integers will be float
A,B = 7,2
C = A/B
print(C)
# Output: 3.5

#Integer division with float and int will give int displayed as float
A,B = 7.0,2
C = A//B   
print(C, A/B)
# Output: 3.0

# floor gives closest integer, which is lesser than or equal to the float value result of (A//B)  is same as floor(A//B)
A,B = -7.0,2
C = A//B
print(C, A/B)
# Output: -4.0

A,B = 7.0,-2
C = A//B    
print(C, A/B)
# Output: -4.0
A,B = -7.0,-2
C = A//B    
print(C, A/B)
# Output: 3.0


'''Remainder is negative when denominator is negative
Numerator = Denominator * Quotient + Remainder
Numerator % Denominator = Remainder
(- % -) = +
(+ % -) = -
(- % +) = +
(+ % +) = +
'''
A,B = 7,-3
C = A%B
print(C)
# Output: -2

A,B = -7,3
C = A%B
print(C)
# Output: 2

A,B = -7,-3
C = A%B
print(C)
# Output: 1

A,B = 7,3
C = A%B
print(C)
# Output: 1




                        # Comments in Python
# Single line comment

""" This is a 
Multi line comment 
   in Python 
    """
# print("Hello World") # won't be printed
print("Hello Ayush") # will be printed




                    # Input in Python
'''input() ststement is used to accept values(using keyboard) from user during program execution'''

# string input
name = input("Enter your name: ")
print("Your name is: ", name)

# integer input
age = int(input("Enter your age: "))
print("Your age is: ", age)

# float input
price = float(input("Enter the price: "))
print("The price is: ", price)

# type of input
print(type(name))
print(type(age))
print(type(price))

print("My name is", name, "and I am", age, "years old",". The price of my car is", price)

#output my name is Ayush and I am 17 years old. The price of my car is 7000000.5








