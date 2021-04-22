# ******************************************
#  Author : Ali Azhari 
#  Created On : Tue Apr 20 2019
#  File : BinarySearch.py
# *******************************************/

def BS(data, target, low, high):

    # The total running time is O(logn)
    
    if low > high:
        return False

    mid = (low + high) // 2
    if data[mid] == target:
        return True

    if target > data[mid]:
        return BS(data, target, mid + 1, high)
    else:
        return BS(data, target, low, mid -1)
    

def Main():
    data = [1, 3, 5, 7, 9, 13]
    for i in range(15):
        print(f"{i} is " + ( 'Found' if BS(data, i, 0, len(data)-1) == True else 'Not Found'))


if __name__ == "__main__":
    Main()