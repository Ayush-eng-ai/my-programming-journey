#Conditional Question

#A = 5 & G = M
#A = 2 & G = F

A = int(input("A : "))
G = input("M/F : ")
if((A == 1 or A == 2) and G == "M"):
    print("fee is 100")
elif(A ==3 or A == 4 or G == "F" ):
    print("fee is 200")
elif(A ==5 and G == "M"):
    print("fee is 300")
else:
    print("no fee")


# And's Rule

'''True and True = True
True and False = False
False and True = False
False and False = False
'''
# Or's Rule
'''True or True = True
True or False = True
False or True = True
False or False = False
'''