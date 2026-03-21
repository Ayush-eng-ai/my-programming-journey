# Let's Prictice
'''
    Print numbers from 1  to 100.
'''
num = 1 
while num <=100:
    print("num", num)
    num += 1

'''
    Print numbers from 100  to 1.
'''
i = 100
while(i>=1):
    print("i", i)
    i -= 1

'''
    Print the multiplication table of a number n.
'''
n = int(input("Enter a Number: "))
p = 1
while (p <= 10):
    print (n, "x", p, "=", n * p)
    p += 1


'''
    Print the elements of the following list using a loop:
        [1,4,9,16,25,36,49,64,81,100]
'''
# traverse
list = [1,4,9,16,25,36,49,64,81,100]
idx = 0 
while  idx < len(list):
    print(list[idx])
    idx += 1

'''
    Search for a number x in this tuple using loop:
        (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
'''
x = input("Enter a Number: ")
tup =  (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
t = 0 #initilization
while t < len(tup): #stoping point
    if(tup[t] == x):
        print("Found at index:", t) # work 
    else:
        print("Not Found a number:", x )
    t +=1 # updation




