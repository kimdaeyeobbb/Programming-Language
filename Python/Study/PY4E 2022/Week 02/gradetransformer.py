def gradetransform(student, score):
    if score >= 0 and 100 >= score:  # 0~100점 사이의 점수를 입력한 경우
        if score >= 95:
            grade = "A+"
        elif score >= 90:
            grade = "A"
        elif score >= 85:
            grade = "B+"
        elif score >= 80:
            grade = "B"
        elif score >= 75:
            grade = "C+"
        elif score >= 70:
            grade = "C"
        elif score >= 65:
            grade = "D+"
        elif score >= 60:
            grade = "D"
        else:
            grade = "F"
    else:   # 0~100점 사이의 점수를 입력하지 않은 경우
        print("0~100점 사이의 점수를 입력하세요")
        return

    print()
    print("*학점을 변환한 이후의 정보를 출력합니다*")
    print(f"학생이름: {student}")
    print(f"점수: {score}")
    print(f"학점: {grade}")


studentname = input("학생 이름을 입력하세요: ")
earnedscore = int(input("점수을 입력하세요: "))
gradetransform(studentname,earnedscore)