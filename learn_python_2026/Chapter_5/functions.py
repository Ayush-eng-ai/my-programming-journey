# Functions in python
'''
Docstring for Chapter_5.functions
    Block of statements that perform a specific task.

        def fun_name( param1,param2, ......):   ----> Function definition
            #some work
            return val

        func_name(arg1, arg2 .....) #function call
               def sum(a, b):
               s = a+ b
               return s               
               print(sum(2, 3))
'''
#without using function
# more lines of code
a = 2
b = 3

sum =  a + b
print(sum)

a = 5
b = 3

sum =  a + b
print(sum)

a = 2
b = 7

sum =  a + b
print(sum)

a = 8
b = 5

sum =  a + b
print(sum)

# using function
def calc_sum(a, b):
    sum = a + b 
    print(sum)
    return sum

calc_sum(2, 3)


#second function
def total(p, q):
    return p + q

sum = total(2, 6)
print(sum)

def print_hello():
    print("hello")

output = print_hello()
print(output) #None




# Average of 3 numbers

def cal_avg(a, b, c):
    sum = a + b + c
    avg = sum / 3
    print(avg)
    return avg

cal_avg(1, 2, 3)




'''
    ##Function in Python

    #Built-in-functions:  print(), len(), type(), range() etc.

    #User defined Functions:  
        
        
        '''

# #Built-in-functions:  print(), len(), type(), range() etc.
print("Ayush", end = "$") #sep = " "
print("rajput") #end = "\n"


    #User defined Functions:  
def cal_prod(a, b=2):
    print(a*b)
    return a*b

cal_prod(1)


def cal_prod(a=4, b=2):
    print(a*b)
    return a*b

cal_prod()




