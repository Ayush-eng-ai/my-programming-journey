# Let's Practice 
'''
Docstring for Chapter_5.func_exercise
        Ques1: WAF to print the length of a list.(List is the Parameter)
'''

name = ["Ayush", "Piyush", "Saloni", "Suman", "Chhavinath Singh"]
cast = ["rajput","yadav","dhanuk" ]

print(cast[1], end = " ")
print(cast[2], end = " ")

def print_len(list):
    print(len(list))
    return list

def print_list(list):
    for item in list:
        print(item, end = " ")

print_list(name)
print_list(cast)

print_len(name)
print_len(cast)

a = len(name)
print(a)


'''
    Ques2: WAF to print the elements of a list in a single line.(list is the parameter)
'''

name = ["Ayush", "Piyush", "Saloni", "Suman", "Chhavinath Singh"]
cast = ["rajput","yadav","dhanuk" ]

print(cast[1], end = " ")
print(cast[2], end = " ")

def print_len(list):
    print(len(list))
    return list

print_len(name)
print_len(cast)


str = "Ayush"
str1 = "Rajput"

a = str + " " + str1
print(a)

a = str , str1
print(a)




'''
    Ques3: WAF to find the factorial of n. (n is the parameter)
'''
#below this loop already completed.
# n = 5
# for i in range(1, n+1):
#     fact *= i
# print(fact) 

def cal_fact(n):
    fact = 1
    for i in range(1, n+1):
        fact *= i
    # print("factorial:",fact)
    return fact

a = cal_fact(4)
print("factorialof this number:", a)



'''
    Ques4: WAF to convert USD to INR.
'''
def converter(usd_val):
    inr_val = usd_val * 87
    print(usd_val, "USD =",inr_val, "INR")

converter(2)
'''
    Ques5: WAF find a even and odd number.
'''
def even_odd(n):
    if n % 2 == 0:
        print("Even")
    else:
        print("Odd")

even_odd(int(input("Enter a Number:")))