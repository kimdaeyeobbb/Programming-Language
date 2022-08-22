![image](https://user-images.githubusercontent.com/68424403/185840507-229473c1-90bc-4581-ba34-410714c82b72.png)
![image](https://user-images.githubusercontent.com/68424403/185840519-0985d636-8873-481e-8b19-cda435626998.png)


```javascript
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution() {

  let americano;   // 아메리카노 가격
  let cafe_latte;    // 카페라떼 가격
  let milk_tea;    // 밀크티 가격

  let price1;    // 아메리카노 2잔 + 밀크티 1잔 가격
  let price2;    // 카페라떼 2잔 + 밀크티 2잔 가격 (생일 할인 혜택 적용)

    americano = 3500;
    cafe_latte = 3800;
    milk_tea = 4200;
    price1 = americano*2 + milk_tea;
    price2 = (cafe_latte*2 + milk_tea*2)*0.9;
  return price1 + price2; 
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
