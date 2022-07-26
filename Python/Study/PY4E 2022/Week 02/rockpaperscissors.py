import random

def rsp(user):
    computer_kor = ["가위", "바위", "보"]
    computer_num = ['0', '1', '2']
    computer = random.choice(computer_kor)   # 컴퓨터가 가위, 바위, 보 중 무작위로 택 1

    # 양식에 맞지 않는 입력을 한 경우
    if not user in computer_kor:
        if not user in computer_num:
            print("잘못 입력되었습니다. 양식에 맞게 다시 입력해주세요")
            return

    # 가위, 바위, 보를 입력한 경우
    if user == "가위" or user == "바위" or user == "보":
        print(f'사용자: {user}')
        print(f'컴퓨터: {computer}')

    # 0, 1, 2를 입력한 경우
    if user == '0':
        user = '가위'   # 0으로 입력한 경우 가위로 바꿔서 처리
        print(f'사용자: {user}')
        print(f'컴퓨터: {computer}')

    if user == '1':
        user = '바위'   # 1로 입력한 경우 바위로 바꿔서 처리
        print(f'사용자: {user}')
        print(f'컴퓨터: {computer}')

    if user == '2':
        user = '보'   # 2로 입력한 경우 보로 바꿔서 처리
        print(f'사용자: {user}')
        print(f'컴퓨터: {computer}')


    # 가위, 바위, 보 수행
    if user == computer:  # 비긴경우
        print("비겼습니다")

    if (user == "가위" and computer == "보") or (user == "바위" and computer == "가위") or (user == "보" and computer == "바위"):   # 사용자가 이기는 경우
        print("사용자가 이겼습니다")

    if (computer == "가위" and user == "보") or (computer == "바위" and user == "가위") or (computer == "보" and user == "바위"):   # 컴퓨터가 이기는 경우
        print("컴퓨터가 이겼습니다")


userrsp = input("가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ")
rsp(userrsp)