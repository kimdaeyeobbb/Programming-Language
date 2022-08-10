def check_info(idnum):
    idlist = idnum.split('-')
    birth = idlist[0]; idlast = idlist[1];  # 주민등록번호 앞자리, 뒷자리
    gendercode = idlast[0]   # 성별번호

    # 성별 체킹
    if gendercode == '1' or gendercode == '3':   # 주민등록번호 뒷자리가 1,3인 경우
        gender = "남성"   # 남자
    elif gendercode == '2' or gendercode == '4':   # 주민등록번호 뒷자리가 2,4인 경우
        gender = "여성"   # 여자

    # 2000년대생인지 체킹
    if int(birth[:2]) >= 0 and 21 >= int(birth[:2]):   # 입력값이 00 ~21로 시작하는 경우
        check21century = input("2000년 이후 출생자입니까? (맞으면 O, 틀리면 X): ")
        if check21century == 'O':   # 2000년대 이후 출생인 경우
            print("2000년 이후 출생자입니다")
            if gendercode == '3' or gendercode == '4':  # 주민등록번호 뒷자리가 3또는 4인 경우
                return (f'{birth[:2]}년 {birth[2:4]}월 출생 / 성별: {gender}')
            elif gendercode == '1' or gendercode == '2':
                return ("주민등록번호를 다시 입력해주세요")   # 주민등록번호를 다시 입력받을 것

        elif check21century == 'X':   # 실제로 2000년대 이전 출생인 경우
            print("2000년 이전 출생자입니다")
            if gendercode == '1' or gendercode == '2':  # 성별번호가 1 또는 2인 경우
                return (f'{birth[:2]}년 {birth[2:4]}월 출생 / 성별: {gender}')
            elif gendercode == '3' or gendercode == '4':   # 성별번호가 3또는 4인 경우
                return ("주민등록번호를 다시 입력해주세요")   # 주민등록번호를 다시 입력받을 것

    else:   # 입력값이 2000년대생 이전 출생인 경우
        return (f'{birth[:2]}년 {birth[2:4]}월 출생 / 성별: {gender}')


inputid = input("주민등록번호를 입력하세요: ")
print(check_info(inputid))