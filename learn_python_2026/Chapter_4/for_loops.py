# Loops in Python
'''
    Loops are used for sequential traversal.. for traversing list, string, tuples etc
'''

'''
        for Loops
        for el in list:
            #some work
'''

list = [1,2,3,4]

for el in list:
    print(el)

print(" End of code ")

'''
            for loop with else

            for el in list
                #some work
            else:
                #work when loop ends
    '''
for el in list:
    print(el)
else:
    print("END")

tuple = (1,2,3,4)

for val in tuple:
    print(val)


str = "Ayush Rajput"

for char in str:
    print(char)
else:
    print("End")


str = "Data Scientiest"

for char in str:
    if(char == "s"):
        print("s found")
        break
    print(char)
else:
    print("End")




    ## range()
'''
    Range functions returns a sequence of  numbers, starting from 0 by default, and increments by 1(by default), and stops before a specified number.

            range(start?, stop, step?)
'''
'''
            for el in range(5):
                print(el)

            for el in range(1,5):
                print(el)

            for el in range(1, 5, 2):
                print(el)

'''
seq = range(5)

print(seq[0])
print(seq[1])#......

#using range function
for p in seq:
    print(p)

for s in range(10): # range(stop)
    print(s)

for s in range(2, 10): # range(start, stop)
    print(s)

for s in range(2, 10, 2): # range(start, stop)
    print(s)




'''
    #Pass Statement
        Pass is null statement that does nothing. It is used as a placeholder for future code.

        for el in range(10):
            pass
'''
for i in range(5):
    pass

if  i > 5:
    pass

print("Some useful work")


