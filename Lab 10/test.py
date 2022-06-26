def pattern(num):
    for i in range(num):
        for j in range(i+1):
            j+=1
            print(j, end=" ")
            
        print()
pattern(5)