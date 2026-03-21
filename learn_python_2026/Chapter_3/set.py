#Set in Python
'''
    Set is the collection of unordered itemes.
    Each element in the set must be unique & immutable.

nums = {1,2,3,4,5}
set2 = {1,2,2,2,2,12}
        #repeated elements stored only once, so it resolved to{1,2}
null_set = set()        #empty set syntax
'''

# random string, list,tuple, dictionary, set
#set = stored in boolean, int, float, str, tuple.

collection = {"Ayush", 1,2,3,2,2,2, "Ayush", "world", "world"}
print(collection)
print(type(collection))

set = set()
print(type(set))



#Set Methods
'''
    set.add(el) #adds an element
    set.remove(el) #removes the elem an
    set.clear() # empties the set
    set.pop()  #removes  a random value

    set.union(set2) #Combines both set value  & returns new
    set.intersection(set2) #combine common values & returns new
'''

set.add(1)
set.add(2)
set.add(4)
set.add(3)
set.add(2)
set.add("Ayush Rajput")
set.add(("Ayush","Piyush", 1,3,4,5,6))
print(set)

print(len(set))
print(set.pop())


set1 = {1,2,3,4,5,6,4,5,2,4}
set2 = {7,8,9,19.12,45,67,34,5,6,3,2}
print(set1.union(set2))
print(set1.intersection(set2))