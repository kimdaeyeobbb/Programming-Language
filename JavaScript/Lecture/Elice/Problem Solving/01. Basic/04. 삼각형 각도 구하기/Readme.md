![image](https://user-images.githubusercontent.com/68424403/185828661-b3a44a70-693a-44c2-913a-60bb764f91b0.png)


```javascript
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution(angle) {

  //angle 변수에 어떤 값이 들어오는지 확인해보세요!
  let arr1 = angle.split(" ");   // 공백 기준으로 값 쪼개서 배열에 넣기
  let sum = 180;

  /* forEach()로 배열 순회 - lambda(Arrow Function)로 구현 */
  arr1.forEach((item)=>{   
      item = parseInt(item);
      sum -= item;
  });

  /* 출력 */
  if (0<sum){
    return sum;
  } else {
    return 0;
  }
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
