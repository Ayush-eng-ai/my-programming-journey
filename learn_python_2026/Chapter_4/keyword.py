# Break & Continue
'''
        # Break: Used to terminate the loop when encountered.

        #Continue: terminates execution in the current interation & continues excution of the loop with the next iteration.

'''
# Break
i = 1 
while i <= 5:
    print(i)
    if(i == 3):
        break
    i +=1

print("End Of  Loop")



tup =  (1, 4, 9, 16, 25, 36, 49, 64, 81, 36, 100)
x = int(input("Enter a Number: "))
t = 0 #initilization
while t < len(tup): #stoping point
    if(tup[t] == x):
        print("Found at index:", t) # work 
        break
    else:
        print("Not Found a number:")
    t +=1 # updation




# Continue
i = 1 
while i <= 5:
    if(i == 3):
        i += 1
        continue # Skip
    print(i)
    i +=1

print("End Of  Loop")


p = 1 
while p <= 5:
    if(p%2 == 0):
        p += 1
        continue # Skip
    print(p)
    p +=1


