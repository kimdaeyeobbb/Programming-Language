# 월급 입력시 연봉으로 변환하는 계산기
def calcannualincome(monthly):
    yearlyincome = monthly*12
    beforetax = yearlyincome
    aftertax = 0

    if yearlyincome> 50000:
        aftertax += int((yearlyincome-yearlyincome*0.42))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    elif yearlyincome > 30000:
        aftertax += int((yearlyincome-yearlyincome*0.4))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    elif yearlyincome > 15000:
        aftertax += int((yearlyincome-yearlyincome*0.38))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    elif yearlyincome > 8800:
        aftertax += int((yearlyincome-yearlyincome*0.35))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    elif yearlyincome > 4600:
        aftertax += int((yearlyincome-yearlyincome*0.24))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    elif yearlyincome > 1200:
        aftertax += int((yearlyincome-yearlyincome*0.15))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")

    else:
        aftertax += int((yearlyincome-yearlyincome*0.06))
        print(f"세전 연봉: {beforetax}만원, 세후 연봉: {aftertax}만원")


monthly_income = int(input("월급을 입력하세요(만원 단위): "))
calcannualincome(monthly_income)