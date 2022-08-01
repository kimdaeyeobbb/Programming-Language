dan = int(input("확인하고싶은 구구단의 단을 입력: "))

def gugu(num):
    if 50 >= num:   # 50이하인지 체크
        print("%d단에 대한 구구단을 출력합니다" %(num))
        for i in range(1,10,2):   # 1~9까지 홀수번째만 계산
            if 50 >= dan*i:
                print("%d * %d = %d" %(dan,i,dan*i))
    else:   # 50을 초과하는 케이스
        print("50이하인 값만 구구단을 출력할 수 있습니다")
        print("50이하의 값을 입력해주세요")

gugu(dan)