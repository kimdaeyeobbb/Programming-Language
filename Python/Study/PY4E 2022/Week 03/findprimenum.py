# 에라토스테네스의 체 -
num1,num2 = map(int,input("소수찾기에 사용할 숫자 2개입력: ").split())

def findprime(n1,n2):
    a = [False,False] + [True]*(n2-1)   # 0과 1은 소수가 아니므로 False 처리
    primes = []   # 소수담을 리스트
    count = 0

    for i in range(2,n2+1):
        if a[i]:    # a[i] == True일 경우
            primes.append(i)   # 2부터 n2까지 소수 체크
            for j in range(2*i,n2+1,i):   # i의 배수는 합성수이므로
                a[j] = False   # 소수가 아님

    for primenum in primes:
        if primenum >= n1 and n2 >= primenum:
            count += 1

    print("소수의 개수: %d개" %count)

findprime(num1,num2)