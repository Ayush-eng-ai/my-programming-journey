# Let's Practice
'''
Docstring for Chapter_5.recursion_exercise

    Write a recursive function to calculate the  sum of first n natural numbers.
'''

def sum_num(n):
    if(n == 0):
        return 0
    print(n)
    # return sum_num(n-1) + n
    return  n + sum_num(n-1)
print(sum_num(5))


'''
    Write a recursive function to print all elements in a list.
        Hint: use list & index as parameters.
'''

n = ["Ayush", "Piyush", "mrs. Suman Devi", "Mr. Chhavinath"]

def print_el(list, idx =0):
    if(idx == len(list)):
        return
    print(list[idx])
    print_el(list, idx+1)

fruits = ["mango", "Banana","Apple", "litchi"]
print_el(fruits)

