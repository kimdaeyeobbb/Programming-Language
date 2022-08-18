import random

# 컴퓨터가 중복되지 않는 숫자 랜덤하게 3개 생성
numlist = [random.randint(0,100) for _ in range(3)]
numlist.sort()
least = numlist[0]; mid = numlist[1]; greatest = numlist[2];
print(numlist)

def guess_num(user,num):
    global least,mid,greatest;

    # 정답인 경우
    if user == least:
        print(f"정답입니다! {user}는 최솟값입니다.")
        num.remove(least)   # 정답을 찾고 나서 요소 삭제
    elif user == mid:
        print(f"정답입니다! {user}는 중간값입니다.")
        num.remove(mid)   # 정답을 찾고 나서 요소 삭제
    elif user == greatest:
        print(f"정답입니다! {user}는 최대값입니다.")
        num.remove(greatest)    # 정답을 찾고 나서 요소 삭제

    # 정답을 못맞춘 경우
    else:
        if user not in num:
            print(f"{user}는 업습니다")
            if least < user:
                print(f"최소값은 {user}보다 작습니다")
            elif user < least:
                print(f"최소값은 {user}보다 큽니다")
            else:
                print(f"최소값은 {user}입니다")


    # 정답을 모두 찾은 경우
    if len(num) == 0:     # 리스트 내 숫자가 하나도 없을 것이므로
        print("게임종료")   # 게임 종료
        print(f"{trial}번 시도만에 예측 성공")
        return

# 함수 실행
trial = 0
while (len(numlist)>0):
    trial += 1
    print(f"{trial}차 시도")
    # 사용자가 정답이라 추측되는 숫자를 입력함
    user_num = int(input("정답이라 추측되는 숫자를 입력하세요: "))
    guess_num(user_num,numlist)
    print()