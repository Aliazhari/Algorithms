# ******************************************
#  Author : Ali Azhari 
#  Created On : Tue Apr 20 2019
#  File : recursion.py
# *******************************************/

def fact(n):

    # Running time of factorial: O(n)
    if n < 0:
        raise Exception("Illegal argument Exception")
    if n == 0:
        return 1

    return n * fact(n - 1)

def Main():
    for i in range(11):
        print(f'Factorial of {i} :  {fact(i)}')

if __name__ == "__main__":
    Main()