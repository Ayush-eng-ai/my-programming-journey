# Recursion
'''
    When a function calls itself repeatedly.
    #prints n to 1 backwards
        def show(n):
            if(n == 0):
                return
            print(n)
            show(n - 1)
'''

def show(n):
    print(n)

show(n=5)

def show(n):
    if(n == 0): #base case
        return
    print(n)
    show(n - 1)

show(6)
print(show(6))



def show(n):
    if(n == 20): #Base case
        return
    print(n)
    show(n + 1)
    print("END")

show(6)



# return n!
def fact(n):
    if(n == 0 or n == 1):
        return 1
    return n * fact(n-1)
    
print(fact(int(input("Enter a num: " ))))
print(fact(6))

    

