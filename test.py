import time

t = time.time()
print(t)

time.sleep(5)
t2 = time.time()
print(t2)
t = t2 - t
print(t)