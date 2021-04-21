# ******************************************
#  Author : Ali Azhari 
#  Created On : Tue Apr 20 2021
#  File : recursion.py
# *******************************************/

def fact(n):

    if n == 0:
        return 1

    return n * fact(n - 1)

def Main():
    for i in range(11):
        print(f'Factorial of {i} :  {fact(i)}')

Main()