# ******************************************
#  Author : Ali Azhari 
#  Created On : Wed Apr 21 2019
#  File : InsertionSearch.py
# *******************************************/


def InsertionSearch(data):

    # running time: O(n2)

    length = len(data)
    if length < 2:
        return data
    
    for i in range(1, length):
        current = data[i]
       
        j = i
        while j > 0 and data[j-1] > current:
            data[j] = data[j - 1]
            j = j-1

        data[j] = current   

    return data

def Main():
    data = ['F', 'J', 'T', 'W', 'X', 'A', 'T', 'V']
    print('Data before InsertionSearch')
    print(data)
    print('Data after InsertionSearch')
    print(InsertionSearch(data))

if __name__ == "__main__":
    Main()